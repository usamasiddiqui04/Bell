package com.dropoutsolution.bell.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.dropoutsolution.bell.R;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.content.ContentValues.TAG;

public class RestaurantsDetailsActivity extends AppCompatActivity {



    ImageView imageView ;
    String img ;
    Bundle bundle = new Bundle();
    CircleImageView details ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_details);
        imageView = findViewById(R.id.imageview);
        bundle = getIntent().getExtras();
        img = bundle.getString("img");
        Log.d(TAG, "checking " + img);
        imageView.setImageResource(Integer.parseInt(img));

        details = findViewById(R.id.details);

        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurantsDetailsActivity.this , AboutresActivity.class));
            }
        });

    }
}