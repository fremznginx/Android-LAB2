package com.fremzdev404.netflix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent1 = getIntent();
        String message = intent1.getStringExtra(login.EXTRA_MESSAGE);
        String message1 = intent1.getStringExtra(login.phone);
        String message2 = intent1.getStringExtra(login.email);

        TextView textView = findViewById(R.id.txtUsername);
        textView.setTextSize(40);
        textView.setText(message);

        TextView textView1 = findViewById(R.id.txtPhone);
        textView1.setTextSize(40);
        textView1.setText(message1);

        TextView textView2 = findViewById(R.id.txtEmail);
        textView2.setTextSize(40);
        textView2.setText(message2);
    }

    public void Signout(View view){
        Toast.makeText(getApplicationContext(),
                "Thank for Using!",
                Toast.LENGTH_LONG).show();
        startActivity(new Intent(Home.this, login.class));
    }
}
