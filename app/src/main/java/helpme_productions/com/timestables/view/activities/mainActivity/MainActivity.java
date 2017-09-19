package helpme_productions.com.timestables.view.activities.mainActivity;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.SeekBar;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import helpme_productions.com.timestables.R;
import helpme_productions.com.timestables.injecttion.mainActivity.DaggerMainActivityComponent;
import helpme_productions.com.timestables.model.Multiples;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {
    private static final String TAG = "test";
    @Inject MainActivityPresenter presenter;

    @BindView(R.id.sbTimesTableBar)
    SeekBar seekBar;
    @BindView(R.id.rvMultiples)
    RecyclerView recyclerView;

    MainActivityAdapter adapter;
    DefaultItemAnimator animator;
    RecyclerView.LayoutManager layoutManager;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupDagger();
        presenter.addView(this);
        seekBar.setMax(25);
        seekBar.setMin(1);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                presenter.fillList(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        presenter.fillList(1);
    }

    @Override
    public void showError(Error error) {

    }

    @Override
    public void setupDagger() {
        DaggerMainActivityComponent.create().inject(this);
    }

    @Override
    public void setupAdapter(List<Multiples> multiplesList) {
        Log.d(TAG, "setupAdapter: " + multiplesList.size());
        adapter = new MainActivityAdapter(multiplesList);
        layoutManager = new LinearLayoutManager(this);
        animator = new DefaultItemAnimator();

        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(animator);
        recyclerView.setLayoutManager(layoutManager);

    }
}
