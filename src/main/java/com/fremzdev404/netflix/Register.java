package com.fremzdev404.netflix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    public static final String username = "username";
    public static final String password = "password";
    public static final String phone = "phone";
    public static final String email = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void register(View view){
        EditText Username = findViewById(R.id.txtUsername);
        EditText Password = findViewById(R.id.txtPassword);
        EditText RePassword = findViewById(R.id.txtRePassword);
        EditText Phone = findViewById(R.id.txtPhone);
        EditText Email = findViewById(R.id.txtEmail);

        String txtUsername = Username.getText().toString();
        String txtPassword = Password.getText().toString();
        String txtRePassword = RePassword.getText().toString();
        String txtPhone = Phone.getText().toString();
        String txtEmail = Email.getText().toString();

        if(txtPassword.equals(txtRePassword)){
            Toast.makeText(getApplicationContext(),
                    "สมัครสมาชิกสำเร็จ",
                    Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this, login.class);
            intent.putExtra(username, txtUsername);
            intent.putExtra(password, txtPassword);
            intent.putExtra(phone, txtPhone);
            intent.putExtra(email, txtEmail);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),
                    "รหัสผ่านไม่ตรงกัน",
                    Toast.LENGTH_LONG).show();
        }
    }
}
