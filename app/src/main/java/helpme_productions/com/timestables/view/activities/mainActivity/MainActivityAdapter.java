package helpme_productions.com.timestables.view.activities.mainActivity;


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import helpme_productions.com.timestables.R;
import helpme_productions.com.timestables.model.Multiples;

import static android.content.ContentValues.TAG;

class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.ViewHolder> {
    private List<Multiples> multiplesList = new ArrayList<>();

    MainActivityAdapter(List<Multiples> multiplesList) {
        this.multiplesList = multiplesList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_of_items,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Multiples multiples = multiplesList.get(position);
        Log.d(TAG, "onBindViewHolder: " + multiples.getFirst());
        holder.firstNum.setText(""+multiples.getFirst());
        holder.secondNum.setText(""+multiples.getSecond());
        holder.product.setText(""+multiples.getProduct());



    }

    @Override
    public int getItemCount() {
        return this.multiplesList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView firstNum;
        TextView secondNum;
        TextView product;
        ViewHolder(View itemView) {
            super(itemView);
            firstNum = itemView.findViewById(R.id.tvFirstNumber);
            secondNum = itemView.findViewById(R.id.tvSecondNumber);
            product = itemView.findViewById(R.id.tvProduct);
        }
    }
}
