package com.clicks.yogi.switchcase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchMethod(View view) {

        switch (view.getId()){

            case R.id.btn1:
                Toast.makeText(this, "button 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(this, "button 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                Toast.makeText(this, "button 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(this, "button 4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                Toast.makeText(this, "button 5", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}