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

        Intent intent = getIntent();
        String message = intent.getStringExtra(login.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.txtUsername);
        textView.setTextSize(40);
        textView.setText(message);
    }

    public void Signout(View view){
        Toast.makeText(getApplicationContext(),
                "Thank for Using!",
                Toast.LENGTH_LONG).show();
        startActivity(new Intent(Home.this, login.class));
    }
}
