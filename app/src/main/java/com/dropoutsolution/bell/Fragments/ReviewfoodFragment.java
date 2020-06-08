package com.dropoutsolution.bell.Fragments;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dropoutsolution.bell.Adapters.MyOrderRecylerView;
import com.dropoutsolution.bell.Adapters.ReviewsRecyclerview;
import com.dropoutsolution.bell.R;

import java.util.ArrayList;

import static android.widget.GridLayout.HORIZONTAL;

public class ReviewfoodFragment extends Fragment {

    public ReviewfoodFragment() {
        // Required empty public constructor
    }

    View view ;
    private RecyclerView recyclerView ;
    private RecyclerView.LayoutManager layoutManager ;
    private ArrayList<String> text = new ArrayList<>() ;
    private ArrayList<Integer> rate = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_reviewfood, container, false);

        text.clear();
        rate.clear();
        text.add("Usama Ali");
        rate.add(2);
        text.add("Mooez");
        rate.add(4);
        text.add("Awais");
        rate.add(3);
        text.add("Abdullah");
        rate.add(1);
        text.add("Usama Ali");
        rate.add(2);
        text.add("Mooez");
        rate.add(4);
        text.add("Awais");
        rate.add(3);
        text.add("Abdullah");
        rate.add(1);

        recyclerView = view.findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setNestedScrollingEnabled(true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        ReviewsRecyclerview reviewsRecyclerview = new ReviewsRecyclerview(text , rate , getContext());
        recyclerView.setAdapter(reviewsRecyclerview);
        return view ;
    }
}