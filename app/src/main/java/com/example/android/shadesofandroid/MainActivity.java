package com.example.android.shadesofandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void red(View view)
    {
        Intent newview = new Intent(MainActivity.this, RedActivity.class);
        startActivity(newview);
    }

    public void pink(View view)
    {
        Intent newview = new Intent(MainActivity.this, PinkActivity.class);
        startActivity(newview);

    }

    public void purple(View view)
    {
        Intent newview = new Intent(MainActivity.this, PurpleActivity.class);
        startActivity(newview);
    }

    public void deep_purple(View view)
    {
        Intent newview = new Intent(MainActivity.this, DeeppurpleActivity.class);
        startActivity(newview);
    }

    public void indigo(View view)
    {
        Intent newview = new Intent(MainActivity.this, IndigoActivity.class);
        startActivity(newview);
    }

    public void blue(View view)
    {
        Intent newview = new Intent(MainActivity.this, BlueActivity.class);
        startActivity(newview);
    }

    public void lightblue(View view)
    {
        Intent newview = new Intent(MainActivity.this, LightBlueActivity.class);
        startActivity(newview);
    }

    public void cyan(View view)
    {
        Intent newview = new Intent(MainActivity.this, CyanActivity.class);
        startActivity(newview);
    }

    public void teal(View view)
    {
        Intent newview = new Intent(MainActivity.this, TealActivity.class);
        startActivity(newview);
    }

    public void green(View view)
    {
        Intent newview = new Intent(MainActivity.this, GreenActivity.class);
        startActivity(newview);
    }

    public void lightgreen(View view)
    {
        Intent newview = new Intent(MainActivity.this, LightGreenActivity.class);
        startActivity(newview);
    }

    public void lime(View view)
    {
        Intent newview = new Intent(MainActivity.this, LimeActivity.class);
        startActivity(newview);
    }

    public void yellow(View view)
    {
        Intent newview = new Intent(MainActivity.this, YellowActivity.class);
        startActivity(newview);
    }

    public void amber(View view)
    {
        Intent newview = new Intent(MainActivity.this, AmberActivity.class);
        startActivity(newview);
    }

    public void orange(View view)
    {
        Intent newview = new Intent(MainActivity.this, OrangeActivity.class);
        startActivity(newview);
    }

    public void deeporange(View view)
    {
        Intent newview = new Intent(MainActivity.this, DeepOrangeActivity.class);
        startActivity(newview);
    }

    public void brown(View view)
    {
        Intent newview = new Intent(MainActivity.this, BrownActivity.class);
        startActivity(newview);
    }

    public void grey(View view)
    {
        Intent newview = new Intent(MainActivity.this, GreyActivity.class);
        startActivity(newview);
    }

    public void bluegrey(View view)
    {
        Intent newview = new Intent(MainActivity.this, BlueGreyActivity.class);
        startActivity(newview);
    }

    public void black(View view)
    {
        Intent newview = new Intent(MainActivity.this, BlackActivity.class);
        startActivity(newview);
    }

    public void white(View view)
    {
        Intent newview = new Intent(MainActivity.this, WhiteActivity.class);
        startActivity(newview);
    }
}
