package com.example.todolist_project;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class item1 extends Fragment {
    protected ArrayList<fragment_item1_element> itemsList;
    protected Fragment_itemAdapter itemsAdapter;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item1, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.item1_recycler_view);
        this.recyclerView = recyclerView;
        this.addUsers(this.recyclerView);
        return view;
    }

    public void addUsers(RecyclerView recyclerView){
        this.itemsList = new ArrayList<>();
        this.itemsAdapter = new Fragment_itemAdapter();
        recyclerView.setAdapter(this.itemsAdapter);

    }
}