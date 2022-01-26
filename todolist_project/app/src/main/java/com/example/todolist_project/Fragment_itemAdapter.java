package com.example.todolist_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fragment_itemAdapter extends RecyclerView.Adapter<Fragment_itemViewHolder>{


    @NonNull
    @Override
    public Fragment_itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.fragment_item1_element, parent, false);
        return new Fragment_itemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Fragment_itemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
