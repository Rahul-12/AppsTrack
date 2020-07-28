package com.yourcompany.appstrack;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mImaeView, mPosts;
    TextView mTitle,mDes, mlikes, mcomment, mshared;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mImaeView=itemView.findViewById(R.id.imageIv);
        this.mTitle=itemView.findViewById(R.id.titleTv);
        this.mDes=itemView.findViewById(R.id.descriptionTv);
        this.mPosts=itemView.findViewById(R.id.post);
        this.mlikes=itemView.findViewById(R.id.likes);
        this.mshared=itemView.findViewById(R.id.shared);
        this.mcomment=itemView.findViewById(R.id.comments);
    }
}
