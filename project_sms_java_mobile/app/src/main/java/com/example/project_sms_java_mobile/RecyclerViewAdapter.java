package com.example.project_sms_java_mobile;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

        private ArrayList<Contact> localDataSet;

        /**
         * Provide a reference to the type of views that you are using
         * (custom ViewHolder).
         */
        public static class ViewHolder extends RecyclerView.ViewHolder {
            private final TextView textView;
            private final TextView textView2;


            public ViewHolder(View view) {
                super(view);

                textView = (TextView) view.findViewById(R.id.textView);
                textView2 = (TextView) view.findViewById(R.id.textViewPhone);
            }

            public TextView getTextView() {
                return textView;
            }

            public TextView getTextView2(){
                return textView2;
            }
        }

        /**
         * Initialize the dataset of the Adapter.
         *
         * @param dataSet String[] containing the data to populate views to be used
         * by RecyclerView.
         */
        public RecyclerViewAdapter(ArrayList<Contact> dataSet) {
            localDataSet = dataSet;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            // Create a new view, which defines the UI of the list item
            View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.contact_item, viewGroup, false);

            return new ViewHolder(view);
        }

    // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(ViewHolder viewHolder, final int position) {

            // Get element from your dataset at this position and replace the
            // contents of the view with that element
            viewHolder.getTextView().setText(localDataSet.get(position).getName());
            viewHolder.getTextView2().setText(localDataSet.get(position).getNumber());
            Log.i("position", position + "" + localDataSet.get(position));
        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return localDataSet.size();
        }
    }


