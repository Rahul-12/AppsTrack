package com.yourcompany.appstrack;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row,null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {

        myHolder.mTitle.setText(models.get(i).getTitle());
        myHolder.mDes.setText(models.get(i).getDescription());
        myHolder.mImaeView.setImageResource(models.get(i).getImg());
        myHolder.mcomment.setText(models.get(i).getcomments());
        myHolder.mshared.setText(models.get(i).getShare());
        myHolder.mPosts.setImageResource(models.get(i).getposts());
        myHolder.mlikes.setText(models.get(i).getLike());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
