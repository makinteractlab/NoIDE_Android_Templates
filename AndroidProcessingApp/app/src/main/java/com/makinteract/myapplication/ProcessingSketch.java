package com.makinteract.androidprocessing;

import android.util.Log;
import processing.core.PApplet;
import android.view.MotionEvent;
import ketai.ui.*;
import ketai.sensors.*;


public class ProcessingSketch extends PApplet {

    public void settings() {
        fullScreen();
    }


    // Modify the code from here
    private int x, y;
    private KetaiGesture gesture;
    private KetaiSensor accelerometer;


    public void setup()
    {
        gesture = new KetaiGesture(this);

        accelerometer = new KetaiSensor(this);
        accelerometer.start();

        // Init XY location
        x= width/2;
        y= height/2;
    }


    public void draw()
    {
        background(255);
        noStroke();
        fill(255,0,0);
        ellipse(x, y, 100, 100);
    }


    
    // Accelerometer event

    void onAccelerometerEvent(float x, float y, float z)
    {
        println (x, y, z);
    }


    // Press and drag events

    public void mousePressed()
    {
        x= mouseX;
        y= mouseY;
    }


    public void mouseDragged()
    {
        x= mouseX;
        y= mouseY;
    }


    // Gestures

    void onDoubleTap(float x, float y)
    {
        println("Double tap");
    }

    void onTap(float x, float y)
    {
        println("Single tap");
    }

    void onLongPress(float x, float y)
    {
        println("Long tap");
    }

    void onFlick( float x, float y, float px, float py, float v)
    {
        println("Flick");
    }

    void onPinch(float x, float y, float d)
    {
        println("Pinch");
    }

    void onRotate(float x, float y, float ang)
    {
        println("Rotate");
    }



    public boolean surfaceTouchEvent(MotionEvent event) {

        //call to keep mouseX, mouseY, etc updated
        super.surfaceTouchEvent(event);

        //forward event to class for processing
        return gesture.surfaceTouchEvent(event);
    }

}


