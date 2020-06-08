package com.dropoutsolution.bell.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;


import com.dropoutsolution.bell.Adapters.CartItemRecyclerView;
import com.dropoutsolution.bell.R;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    private RecyclerView recyclerView ;
    private RecyclerView.LayoutManager layoutManager ;
    private ArrayList<String> text = new ArrayList<>() ;
    private Toolbar toolbar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartActivity.this , MainActivity.class));
            }
        });

        text.clear();
        text.add("Cheezious");
        text.add("Pizza Hut");
        text.add("KFC");
        text.add("Mcdonald");
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        CartItemRecyclerView cartItemRecyclerView = new CartItemRecyclerView(text , this);
        recyclerView.setAdapter(cartItemRecyclerView);
    }
}