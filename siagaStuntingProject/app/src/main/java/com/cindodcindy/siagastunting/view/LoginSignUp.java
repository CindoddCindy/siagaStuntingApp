package com.cindodcindy.siagastunting.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cindodcindy.siagastunting.R;

public class LoginSignUp extends AppCompatActivity {

    public TextView textView_login_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_up);
        textView_login_sign_up=findViewById(R.id.tv_login);
        textView_login_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSignUp.this, PilihMenu.class);
                startActivity(intent);
            }
        });
    }
}