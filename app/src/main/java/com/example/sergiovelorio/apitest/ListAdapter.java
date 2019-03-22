package com.example.sergiovelorio.apitest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListHolder> {
    PhotoBean[] photos;
    Context context;

    public ListAdapter(PhotoBean[] photos, Context context){
        this.photos = photos;
        this.context = context;
    }

    @NonNull
    @Override
    public ListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ListHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListHolder holder, int position) {
        holder.title.setText(photos[position].title);

        Glide
                .with(context)
                .load(photos[position].url)
                .into(holder.image);

    }

    @Override
    public int getItemCount() {
        return photos.length;
    }

    public static class ListHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView image;
        public ListHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.image);
        }
    }
}
