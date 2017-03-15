package com.shld.maven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shld.tools.T;

import io.kvh.sonatyaar.L;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        L.i("p j ");
        T.showToastShort(this,"提示");
    }
}
