package com.imranmars0701gmail.fragment_excercise;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SelectFrag(View view) {
        Fragment fr;

        if (view == findViewById(R.id.btnButton2)) {
            fr = new Fragment_Two();
        } else {
            fr = new Fragment_One();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frag, fr);
        fragmentTransaction.commit();
    }
}
