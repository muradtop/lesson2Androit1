package com.example.lesson2android2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imImage;
    TextView tvMeaning;
    Button btnOpenSecondActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imImage = findViewById(R.id.in_image);
        tvMeaning = findViewById(R.id.tv_meaning);
        btnOpenSecondActivity = findViewById(R.id.btn_open_second_activity);

        btnOpenSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        String getData = intent.getStringExtra("Key");
        String image = intent.getStringExtra("image");
        tvMeaning.setText(getData);
        if (image != null){
            imImage.setImageURI(Uri.parse(image));
        }
    }

}


