package com.yourcompany.appstrack;
import android.view.Menu;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView=findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter=new MyAdapter(this,getMyList());
        mRecyclerView.setAdapter(myAdapter);



        final ImageButton imageButton =findViewById(R.id.options);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, imageButton);
                popup.getMenuInflater().inflate(R.menu.tool_menu, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        return true;
                    }
                });

                popup.show();//showing popup menu
            }
        });
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext()
                                , ProfileActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.message:
                        startActivity(new Intent(getApplicationContext()
                                , MessageActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.setting:
                        startActivity(new Intent(getApplicationContext()
                                , SettingActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext()
                                , DiscoverActivity.class));
                        overridePendingTransition(0, 0);
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
    private ArrayList<Model> getMyList() {
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Jenny Emo");
        m.setDescription("4 min ago");
        m.setImg(R.drawable.nam);
        m.setcomments("2 comments");
        m.setLike("20 likes");
        m.setShare("2 shared");
        m.setposts(R.drawable.ind);
        models.add(m);

         m = new Model();
        m.setTitle("Mutual Friends");
        m.setDescription("");
        m.setcomments("");
        m.setLike("");
        m.setShare("");
        models.add(m);

        m = new Model();
        m.setTitle("Tessa Jack");
        m.setDescription("7 min ago");
        m.setcomments("20 comments");
        m.setLike("200 likes");
        m.setShare("2 shared");
        m.setposts(R.drawable.chi);
        m.setImg(R.drawable.jaa);
        models.add(m);

        m = new Model();
        m.setTitle("Emma Farrhouk");
        m.setDescription("8 min ago");
        m.setcomments("30 comments");
        m.setLike("320 likes");
        m.setShare("13 shared");
        m.setposts(R.drawable.ppa);
        m.setImg(R.drawable.ppa);
        models.add(m);
        m = new Model();

        m.setTitle("Elon Musk");
        m.setDescription("10 min ago");
        m.setcomments("112 comments");
        m.setLike("2024 likes");
        m.setShare("24 shared");
        m.setposts(R.drawable.ban);
        m.setImg(R.drawable.index);
        models.add(m);

         m = new Model();
        m.setTitle("James Bond");
        m.setcomments("2 comments");
        m.setLike("20 likes");
        m.setShare("0 shared");
        m.setDescription("2 hrs ago");
        m.setImg(R.drawable.elo);
        m.setposts(R.drawable.bond);
        models.add(m);
        return models;
    }

}
