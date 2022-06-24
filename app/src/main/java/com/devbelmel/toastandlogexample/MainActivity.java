package com.devbelmel.toastandlogexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.devbelmel.toastandlogexample.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View MeView=binding.getRoot();
         setContentView(MeView);
         binding.button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Toast.makeText(MainActivity.this,"text in textview is "+binding.textView.getText(),Toast.LENGTH_LONG).show();
                 Log.d("textview string is ",binding.textView.getText().toString());
             }
         });



    }
}