package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.fav:
                        startActivity(new Intent(getApplicationContext(),fav.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(),search.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.settings:
                startActivity(new Intent(MainActivity.this,settings.class));
                return true;
            case R.id.profile:
                startActivity(new Intent(MainActivity.this,profile.class));
                return true;
            case R.id.help:
                return true;
            case R.id.faq:
                startActivity(new Intent(MainActivity.this,faq.class));
                return true;
            case R.id.contact:
                startActivity(new Intent(MainActivity.this,contact.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}