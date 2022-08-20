package com.example.final_task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNev=findViewById(R.id.bottom_navigation);




        bottomNev.setOnNavigationItemSelectedListener(navListener);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.myClass:

                    Toast.makeText(MainActivity.this, "My class", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.calander:

 ;                       Toast.makeText(MainActivity.this, "calander", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.allClasses:

                    Toast.makeText(MainActivity.this, "all class", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.workingList:


                    Toast.makeText(MainActivity.this, "working list", Toast.LENGTH_SHORT).show();


                    break;
            }

            return true;

        }
    };
}