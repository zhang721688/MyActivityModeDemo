package com.activity.mode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button button;
    protected Button button2;
    protected Button button3;
    protected Button button4;
    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setTitle(this.getClass().getSimpleName());
        Log.i(TAG, this + ILogTag.ARROW + "onCreate: ");
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            Log.i(TAG, this + ILogTag.ARROW + ":navigate to StandardActivity");
            startActivity(new Intent(this, StandardActivity.class));
        } else if (view.getId() == R.id.button2) {
            Log.i(TAG, this + ILogTag.ARROW + ":navigate to SingleTopActivity");
            startActivity(new Intent(this, SingleTopActivity.class));
        } else if (view.getId() == R.id.button3) {
            Log.i(TAG, this + ILogTag.ARROW + ":navigate to SingleTaskActivity");
            startActivity(new Intent(this, SingleTaskActivity.class));
        } else if (view.getId() == R.id.button4) {
            Log.i(TAG, this + ILogTag.ARROW + ":navigate to SingleInstanceActivity");
            startActivity(new Intent(this, SingleInstanceActivity.class));
        }
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(MainActivity.this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(MainActivity.this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(MainActivity.this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(MainActivity.this);
    }
}
