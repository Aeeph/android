package com.example.androidkotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button Btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username = (EditText) findViewById(R.id.Name);
        final EditText password = (EditText) findViewById(R.id.Pss);
        Btnlogin = (Button) findViewById(R.id.btnLogin);

        Btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = username.getText().toString();
                String pass= password.getText().toString();
                if (name.equals("admin")&&pass.equals("admin")){
                    Toast.makeText(getApplicationContext(), "Anda Berhasil Login", Toast.LENGTH_SHORT).show();
                    Intent profil = new Intent(Login.this, Dashboard.class);
                    startActivity(profil);
                }else{
                    Toast.makeText(getApplicationContext(), "Username dan Password Tidak Sesuai", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}