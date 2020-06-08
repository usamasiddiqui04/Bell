package com.dropoutsolution.bell.Adapters;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
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

public class RestaurantsReclyclerView extends RecyclerView.Adapter<RestaurantsReclyclerView.ViewHolder> {

    private ArrayList<Integer> Images;
    Context context ;
    private Integer img ;

    public RestaurantsReclyclerView(ArrayList<Integer> images, Context context) {
        Images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public RestaurantsReclyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviewlayout , parent , false);
        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RestaurantsReclyclerView.ViewHolder holder, final int position) {
        img = Images.get(position);
        Glide.with(context).load(Images.get(position)).into(holder.imageView);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , RestaurantsDetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("img" , String.valueOf(Images.get(position)));
                intent.putExtras(bundle);
                Log.d(TAG, "images " + Images.get(position));
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
