package com.yourcompany.appstrack;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class MessageActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Jessi Frost", "Jenny Sabastian", "Raze blast ", "Charles lechlare", "Val Bottas"};
    String mDescription[] = {"Active 1 min ago", "Active 10 min ago", "Active 20 min ago", "Active 43 min ago", "Active 55 min ago"};
    int images[] = {R.drawable.a, R.drawable.b, R.drawable.f, R.drawable.d, R.drawable.e};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.message);

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
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
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

        listView = findViewById(R.id.listView);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Toast.makeText(MessageActivity.this, "offline", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(MessageActivity.this, "offline", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(MessageActivity.this, "offline", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(MessageActivity.this, "offline", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(MessageActivity.this, "offline", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // so item click is done now check list view
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row1, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row1 = layoutInflater.inflate(R.layout.row1, parent, false);
            ImageView images = row1.findViewById(R.id.image);
            TextView myTitle = row1.findViewById(R.id.textView1);
            TextView myDescription = row1.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);




            return row1;
        }
    }
    }

