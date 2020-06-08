package com.dropoutsolution.bell.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dropoutsolution.bell.R;

import java.util.ArrayList;

public class MyOrderRecylerView extends RecyclerView.Adapter<MyOrderRecylerView.ViewHolder> {
    private ArrayList<String> text ;
    private Context context ;

    public MyOrderRecylerView(ArrayList<String> text, Context context) {
        this.text = text;
        this.context = context;
    }

    @NonNull
    @Override
    public MyOrderRecylerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pastorderr_recyclerview , viewGroup , false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyOrderRecylerView.ViewHolder viewHolder, int i) {
        viewHolder.restaurantname.setText(text.get(i));

    }

    @Override
    public int getItemCount() {
        return text.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView restaurantname ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            restaurantname = itemView.findViewById(R.id.restaurantname);
        }
    }
}
