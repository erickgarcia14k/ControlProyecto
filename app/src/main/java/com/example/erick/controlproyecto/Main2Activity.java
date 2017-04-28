package com.example.erick.controlproyecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends ActionBarActivity {

    private static final int TIME_DELAY = 2000; // Backpress delay time
    private static long back_pressed;           // Backpressed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().hide(); // Hide Action bar


    }


    public void Teacher(View view) {

        Intent i = new Intent(Main2Activity.this, ControlesLogin.class);
        startActivity(i);
    }

    public void Student(View view) {

        Intent i = new Intent(Main2Activity.this,ControlesLogin2.class);
        startActivity(i);
    }





    // Backpress Operations ###################
    @Override
    public void onBackPressed() {

        if (back_pressed + TIME_DELAY > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            Toast.makeText(getBaseContext(), "Presiona nuevamente para salir!",
                    Toast.LENGTH_SHORT).show();
        }
        back_pressed = System.currentTimeMillis();
    }
    // End Backpress Operations ###############

}


