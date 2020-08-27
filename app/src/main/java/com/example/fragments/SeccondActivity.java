package com.example.fragments;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SeccondActivity extends AppCompatActivity {
    private static final String TAG = "SeccondActivity";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.seccond_activity  );
        Log.d(TAG,"Seccond started");
    }
}
