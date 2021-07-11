package com.cindodcindy.siagastunting.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cindodcindy.siagastunting.R;

public class IsiDataAnak extends AppCompatActivity {

    public TextView textView_isi_data_lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_data);
        textView_isi_data_lanjut=findViewById(R.id.tv_data_anak_next);
        textView_isi_data_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IsiDataAnak.this,SiagaStuntingMenu.class);
                startActivity(intent);
            }
        });
    }
}