package com.example.android.inclassassignment10_mengqid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toActivity(View view)
    {
        switch (((Button) view).getText().toString())
        {
            case "OBJECT":
                startActivity(new Intent(this,ObjectActivity.class));
                break;

            case "LIST":
                startActivity(new Intent(this,ListActivity.class));
                break;

            case "CAMERA":
                startActivity(new Intent(this,CameraActivity.class));
                break;

            case "STORAGE":
                startActivity(new Intent(this,StorageActivity.class));
                break;
        }


    }
}
