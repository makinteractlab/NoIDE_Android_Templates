package com.makinteract.androidprocessing;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;

// If you want to use Processing, you do not need to modify this file

public class MainActivity extends Activity {
    FragmentManager fragmentManager;
    ProcessingSketch sketch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sketch = new ProcessingSketch();

        getFragmentManager().beginTransaction()
                .add(R.id.container, sketch)
                .commit();

    }
}