package helpme_productions.com.timestables.view.activities.mainActivity;


import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import helpme_productions.com.timestables.model.Multiples;

import static android.content.ContentValues.TAG;

public class MainActivityPresenter implements MainActivityContract.Presenter {
    private MainActivityContract.View view;
    private List<Multiples> multiplesList = new ArrayList<>();
    @Override
    public void addView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void removeView() {
        this.view = null;
    }

    @Override
    public void fillList(int seekPosition) {
        multiplesList.clear();
        for (int i = 1; i < 25 ; i++) {
            multiplesList.add(new Multiples(i,seekPosition,i*seekPosition));
        }
        Log.d(TAG, "fillList" + multiplesList.size());
        view.setupAdapter(multiplesList);

    }
}
