package com.fremzdev404.netflix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class login extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "username";

    ImageView logo;
    Animation fromtop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logo = (ImageView) findViewById(R.id.logo);

        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);
        logo.setAnimation(fromtop);
    }
    public void sendMessage(View view){

        EditText etUesr = findViewById(R.id.txtUsername);
        EditText etPw = findViewById(R.id.txtPassword);

        String txtUser = etUesr.getText().toString();
        String txtPw = etPw.getText().toString();

        if (txtUser.equals("mammothz") && txtPw.equals("1234")){
            Toast.makeText(getApplicationContext(),
                    "Welcome back " + txtUser,
                    Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this, Home.class);
            intent.putExtra(EXTRA_MESSAGE, txtUser);
            startActivity(intent);

            etUesr.setText("");
            etPw.setText("");

        }else
            Toast.makeText(getApplicationContext()
                    , "Username or Password Incorrect",
                    Toast.LENGTH_LONG).show();




    }
}
