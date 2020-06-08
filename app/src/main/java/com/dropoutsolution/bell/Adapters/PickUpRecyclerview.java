package com.dropoutsolution.bell.Adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dropoutsolution.bell.Activities.RestaurantsDetailsActivity;
import com.dropoutsolution.bell.R;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;


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
    public void onBindViewHolder(@NonNull PickUpRecyclerview.ViewHolder viewHolder, final int i) {
        viewHolder.imageView.setImageResource(Images.get(i));


        Glide.with(context).load(Images.get(i)).into(viewHolder.imageView);

        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , RestaurantsDetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("img" , String.valueOf(Images.get(i)));
                intent.putExtras(bundle);
                Log.d(TAG, "images " + Images.get(i));
                context.startActivity(intent);
            }
        });
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
