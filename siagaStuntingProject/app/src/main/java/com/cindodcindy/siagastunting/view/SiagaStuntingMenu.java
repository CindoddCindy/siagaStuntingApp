package com.cindodcindy.siagastunting.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cindodcindy.siagastunting.R;

public class SiagaStuntingMenu extends AppCompatActivity {

    public TextView textView_pengukuran_status_gizi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siaga_stunting_menu);

        textView_pengukuran_status_gizi=findViewById(R.id.pengukuran_status_gizi);
        textView_pengukuran_status_gizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SiagaStuntingMenu.this, MengukurGizi.class);
                startActivity(intent);
            }
        });
    }
}