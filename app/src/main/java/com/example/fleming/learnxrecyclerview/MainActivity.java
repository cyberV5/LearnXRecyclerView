package com.example.fleming.learnxrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        XRVFragment fragment = new XRVFragment();
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().add(R.id.activity_main, fragment).commit();
        }

    }
}
