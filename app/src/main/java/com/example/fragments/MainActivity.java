package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private SectionStatePagerAdapter adapter;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Main started");
        adapter=new SectionStatePagerAdapter(getSupportFragmentManager());
        viewPager=findViewById(R.id.containter);


    }
    public void setupPager(ViewPager viewPager){
        SectionStatePagerAdapter adapter2=new SectionStatePagerAdapter(getSupportFragmentManager());
        adapter2.addFragment(new fragment1(),"Fragment1");
        adapter2.addFragment(new fragment2(),"Fragment2");
        adapter2.addFragment(new fragment3(),"Fragment3");
        viewPager.setAdapter(adapter2);
    }
    public void setupPager(int fragmentNumber){
        viewPager.setCurrentItem(fragmentNumber);
    }
}