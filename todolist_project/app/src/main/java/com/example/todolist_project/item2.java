package com.example.todolist_project;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link item2} factory method to
 * create an instance of this fragment.
 */
public class item2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item2, container, false);
        final Button btn = view.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                final TextInputEditText textInput = view.findViewById(R.id.input_text);
                final TextInputEditText textInput2 = view.findViewById(R.id.input_text2);
                String t = textInput.getText().toString();
                String t2 = textInput2.getText().toString();


            }});
        return view;
    }
}