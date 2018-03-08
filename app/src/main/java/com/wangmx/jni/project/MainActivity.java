package com.wangmx.jni.project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.wangmx.jni.jnilibrary.JniInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("jni", "onCreate: " + JniInterface.stringFromJNI());
    }

}
