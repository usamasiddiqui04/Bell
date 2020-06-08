package com.dropoutsolution.bell.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dropoutsolution.bell.Adapters.RestaurantsReclyclerView;
import com.dropoutsolution.bell.R;

import java.util.ArrayList;


public class DeliveryFragment extends Fragment {

    private RecyclerView recyclerView ;
    private View view ;
    private RecyclerView.LayoutManager layoutManager ;
    private ArrayList<Integer> images = new ArrayList<>() ;

    public DeliveryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_delivery, container, false);
        images.clear();
        images.add(R.drawable.pizza);
        images.add(R.drawable.fries);
        images.add(R.drawable.burgur);
        images.add(R.drawable.baryani);
        images.add(R.drawable.pizza);
        images.add(R.drawable.pizza);
        images.add(R.drawable.fries);
        images.add(R.drawable.burgur);
        images.add(R.drawable.baryani);
        images.add(R.drawable.pizza);
        recyclerView = view.findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        RestaurantsReclyclerView restaurantsReclyclerView = new RestaurantsReclyclerView(images , getContext());
        recyclerView.setAdapter(restaurantsReclyclerView);
        return view ;
    }
}