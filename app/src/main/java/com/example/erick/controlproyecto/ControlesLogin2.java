package com.example.erick.controlproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ControlesLogin2 extends AppCompatActivity  implements ViewOnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controles_login2);

        getSupportActionBar().hide(); // Hide Action bar
    }
    public void loginTeacher(View view) {

        EditText TeacherName = (EditText) findViewById(R.id.teacher_username);
        EditText TeacherPassword = (EditText) findViewById(R.id.teacher_password);

        /*TextView text= (TextView) findViewById(R.id.welcome);
        String msg = TeacherName.getText().toString();
        text.setText(msg);
        */


        if(TeacherName.getText().toString().equals("test") && TeacherPassword.getText().toString().equals("test"))
        {
            Intent i = new Intent(this, RegistroControl.class);
            startActivity(i);

        }


        else if(TeacherName.getText().toString().equals("Swapna") && TeacherPassword.getText().toString().equals("rani"))
        {
            Intent i = new Intent(this, RegistroControl.class);
            startActivity(i);

        }

        else if(TeacherName.getText().toString().equals("") && TeacherPassword.getText().toString().equals(""))
        {
            Intent i = new Intent(this, RegistroControl.class);
            startActivity(i);

        }


        else
        {
            Toast.makeText(this, "Usuario o contraseña incorrectos!", Toast.LENGTH_LONG).show();

        }


    }}












