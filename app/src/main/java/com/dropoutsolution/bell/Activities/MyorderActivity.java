package com.dropoutsolution.bell.Activities;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dropoutsolution.bell.Adapters.MyOrderRecylerView;
import com.dropoutsolution.bell.R;

import java.util.ArrayList;

public class MyorderActivity extends AppCompatActivity {

    private RecyclerView recyclerView ;
    private RecyclerView.LayoutManager layoutManager ;
    private ArrayList<String> text = new ArrayList<>() ;
    private Toolbar toolbar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myorder);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyorderActivity.this , MainActivity.class));
            }
        });


        text.clear();
        text.add("Cheezious");
        text.add("Pizza Hut");
        text.add("KFC");
        text.add("Mcdonald");
        recyclerView = findViewById(R.id.postrecyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        MyOrderRecylerView myOrderRecylerView = new MyOrderRecylerView(text , this);
        recyclerView.setAdapter(myOrderRecylerView);
    }
}