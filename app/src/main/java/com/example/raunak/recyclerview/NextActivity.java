package com.example.raunak.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import Adapter.Myadapter;

public class NextActivity extends AppCompatActivity {
    private TextView name, desc, id;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        name = findViewById(R.id.textName);
        desc = findViewById(R.id.textdesc);
        id = findViewById(R.id.textid);

        Bundle bundle = getIntent().getExtras();
        String name1 = bundle.getString("name");
        String desc1 = bundle.getString("desc");
        Integer id1 = bundle.getInt("id");

        name.setText(name1);
        desc.setText(desc1);
        id.setText(Integer.toString(id1));

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(id1);
    }
}
