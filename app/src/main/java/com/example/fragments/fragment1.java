package com.example.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public class fragment1 extends Fragment {
    private static final String TAG = "fragment1";
    private Button btnfrag1;
    private Button btnfrag2;
    private Button btnfrag3;
    private Button btnSeccondActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment1,container,false);
        btnfrag1=view.findViewById(R.id.btnfrg1);
        btnfrag2=view.findViewById(R.id.btnfrg2);
        btnfrag3=view.findViewById(R.id.btnfrg3);
        btnSeccondActivity=view.findViewById(R.id.btnSeccondActivity);
        btnfrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Go to fragment 1",Toast.LENGTH_SHORT);
            }
        });
        btnfrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Go to fragment 2",Toast.LENGTH_SHORT);
            }
        });
        btnfrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Go to fragment 3",Toast.LENGTH_SHORT);
            }
        });
        btnSeccondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Go to fragment Seccond",Toast.LENGTH_SHORT);
                Intent intent=new Intent(getActivity(),SeccondActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
