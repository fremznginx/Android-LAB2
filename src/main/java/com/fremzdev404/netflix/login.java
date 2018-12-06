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
    public static final String password = "password";
    public static final String phone = "phone";
    public static final String email = "email";

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

        Intent intent = getIntent();
        String reUsername = intent.getStringExtra(Register.username);
        String rePassword = intent.getStringExtra(Register.password);
        String rePhone = intent.getStringExtra(Register.phone);
        String reEmail = intent.getStringExtra(Register.email);

        EditText etUesr = findViewById(R.id.txtUsername);
        EditText etPw = findViewById(R.id.txtPassword);

        String txtUser = etUesr.getText().toString();
        String txtPw = etPw.getText().toString();

        if (txtUser.equals(reUsername) && txtPw.equals(rePassword)){
            Toast.makeText(getApplicationContext(),
                    "Welcome back " + txtUser,
                    Toast.LENGTH_LONG).show();

            Intent intent1 = new Intent(this, Home.class);
            intent1.putExtra(EXTRA_MESSAGE, txtUser);
            intent1.putExtra(phone, rePhone);
            intent1.putExtra(email, reEmail);
            startActivity(intent1);

            etUesr.setText("");
            etPw.setText("");

        }else
            Toast.makeText(getApplicationContext()
                    , "Username or Password Incorrect",
                    Toast.LENGTH_LONG).show();




    }
    public void Register(View view){
        startActivity(new Intent(login.this, Register.class));
    }
}
