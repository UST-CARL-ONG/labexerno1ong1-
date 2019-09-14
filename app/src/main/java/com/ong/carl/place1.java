package com.ong.carl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class place1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place1);
    }
    public void onClick(View V) {
        Intent intent1 = new Intent(this, Main2Activity.class);
        startActivity(intent1);

    }
}
