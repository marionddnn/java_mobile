package com.example.todolist_project;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
        MainActivity context;
        int totalTabs;
        public FragmentAdapter(MainActivity c, FragmentManager fm, int totalTabs) {
            super(fm);
            context = c;
            this.totalTabs = totalTabs;
        }

    @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new item1();
                case 1:
                    return new item2();
                case 2:
                    return new item3();
                default:
                    return null;
            }
        }
        @Override
        public int getCount() {
            return totalTabs;
        }
    }