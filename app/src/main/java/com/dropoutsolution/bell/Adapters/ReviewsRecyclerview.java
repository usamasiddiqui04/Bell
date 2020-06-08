package com.dropoutsolution.bell.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dropoutsolution.bell.R;

import java.util.ArrayList;

public class ReviewsRecyclerview extends RecyclerView.Adapter<ReviewsRecyclerview.ViewHolder> {

    ArrayList<String> text ;
    ArrayList<Integer> rating ;
    Context context ;

    public ReviewsRecyclerview(ArrayList<String> text, ArrayList<Integer> rating, Context context) {
        this.text = text;
        this.rating = rating;
        this.context = context;
    }

    @NonNull
    @Override
    public ReviewsRecyclerview.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reviewrecyclerview , parent , false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ReviewsRecyclerview.ViewHolder holder, int position) {
        holder.username.setText(text.get(position));
        holder.userrating.setRating(rating.get(position));
    }

    @Override
    public int getItemCount() {
        return text.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView username ;
        RatingBar userrating ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            username = itemView.findViewById(R.id.username);
            userrating = itemView.findViewById(R.id.userrating);
        }
    }
}
