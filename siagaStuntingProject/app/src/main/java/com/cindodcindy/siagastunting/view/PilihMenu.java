package com.cindodcindy.siagastunting.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cindodcindy.siagastunting.R;

public class PilihMenu extends AppCompatActivity {
    private TextView textView_menu_anak;
    private  TextView textView_menu_ibu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_menu);
        textView_menu_anak=findViewById(R.id.menu_anak);
        textView_menu_ibu=findViewById(R.id.menu_ibu);

        textView_menu_anak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PilihMenu.this, WelcomeAnak.class);
                startActivity(intent);
            }
        });

        textView_menu_ibu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PilihMenu.this, WelcomeBunda.class);
                startActivity(intent);
            }
        });
    }
}