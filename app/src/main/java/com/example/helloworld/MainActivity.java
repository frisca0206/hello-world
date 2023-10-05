package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int mCount = 0;
private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.tv_show_count);
    }

    public void countUp(View view) {
        // What happens when user clicks on the button_count Button goes here.
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void showToast(View view) {
        // Create a toast show it.
        Toast toast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG);
        toast.show();
    }

    public void minus(View view) {
        mCount--;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}