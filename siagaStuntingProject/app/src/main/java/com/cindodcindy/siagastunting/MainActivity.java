package com.cindodcindy.siagastunting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.cindodcindy.siagastunting.view.LoginSignUp;

public class MainActivity extends AppCompatActivity {

    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(MainActivity.this, LoginSignUp.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}