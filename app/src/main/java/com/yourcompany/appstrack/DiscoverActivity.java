package com.yourcompany.appstrack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DiscoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.search);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext()
                                ,ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.message:
                        startActivity(new Intent(getApplicationContext()
                                ,MessageActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                            ,MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.setting:
                        startActivity(new Intent(getApplicationContext()
                                ,SettingActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.search:
                        return true;
                }
                return false;
            }
        });
        ImageButton button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}