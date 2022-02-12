package com.rushikeshnarkhede.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button button;
    String correct_username="mca";
    String correct_password="android";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(MainActivity.this, "Empty data provided",Toast.LENGTH_LONG).show();
                }else if(username.getText().toString().equals(correct_username)){
                    if(password.getText().toString().equals(correct_password)){
                        Toast.makeText(MainActivity.this, "Success Login",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(MainActivity.this, "Invalid Login",Toast.LENGTH_LONG).show();

                    }

                }else{
                    Toast.makeText(MainActivity.this, "Invalid Username/Password",Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}