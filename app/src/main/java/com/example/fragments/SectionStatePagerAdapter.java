package com.example.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionStatePagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> fragments=new ArrayList<>();
    private final List<String> fragmentsTitleList=new ArrayList<>();
    public SectionStatePagerAdapter(@NonNull FragmentManager fm) {

        super(fm);
    }
    public void addFragment(Fragment fragment,String title){
        fragments.add(fragment);
        fragmentsTitleList.add(title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
