package com.dropoutsolution.bell.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dropoutsolution.bell.R;

import java.util.ArrayList;


public class PickUpRecyclerview extends RecyclerView.Adapter<PickUpRecyclerview.ViewHolder>{
    private ArrayList<Integer> Images;
    Context context ;

    public PickUpRecyclerview(ArrayList<Integer> images, Context context) {
        Images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public PickUpRecyclerview.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pickup_recyclerview , viewGroup , false);
        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PickUpRecyclerview.ViewHolder viewHolder, int i) {
        viewHolder.imageView.setImageResource(Images.get(i));
    }

    @Override
    public int getItemCount() {
        return Images.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.pizza);
        }
    }
}
