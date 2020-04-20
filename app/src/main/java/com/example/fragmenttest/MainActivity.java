package com.example.fragmenttest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    MainFragment fragment1;
    MenuFragment fragment2;


    @Override
    protected void onCreate(Bundle savedInstanseState){
        super.onCreate(savedInstanseState);
        setContentView(R.layout.activity_main);

        fragment1= new MainFragment();
        fragment2= new MenuFragment();



        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment1).commit();
            }
        });



        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment2).commit();
            }
        });

    }

    public void onFragmentChange(int index){
        if (index == 0 ){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment1).commit();
        }
        else if (index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment2).commit();
        }
    }





}


//https://www.edwith.org/boostcourse-android/lecture/17074#_movie_11476
