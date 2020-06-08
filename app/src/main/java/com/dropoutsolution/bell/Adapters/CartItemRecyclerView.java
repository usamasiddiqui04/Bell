package com.dropoutsolution.bell.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dropoutsolution.bell.Activities.RatefoodActivity;
import com.dropoutsolution.bell.R;

import java.util.ArrayList;

public class CartItemRecyclerView extends RecyclerView.Adapter<CartItemRecyclerView.ViewHolder> {

    private ArrayList<String> text ;
    private Context context ;
    private int Quantity = 0 ;

    public CartItemRecyclerView(ArrayList<String> text, Context context) {
        this.text = text;
        this.context = context;
    }

    @NonNull
    @Override
    public CartItemRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cartitemrecyclerview , parent , false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final CartItemRecyclerView.ViewHolder holder, final int position) {
        holder.textView.setText(text.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context , RatefoodActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return text.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView ;
        TextView number ;
        ImageView plus , minus ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.productname);
            number = itemView.findViewById(R.id.number);
            plus = itemView.findViewById(R.id.plus);
            minus = itemView.findViewById(R.id.minun);
        }
    }
}
