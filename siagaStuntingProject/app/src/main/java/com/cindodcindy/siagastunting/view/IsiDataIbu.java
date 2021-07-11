package com.cindodcindy.siagastunting.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cindodcindy.siagastunting.R;

public class IsiDataIbu extends AppCompatActivity {
    public TextView textView_isi_data_ibu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_data_ibu);

        textView_isi_data_ibu=findViewById(R.id.tv_data_ibu_next);
        textView_isi_data_ibu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IsiDataIbu.this, SiagaStuntingMenu.class);
                startActivity(intent);
            }
        });
    }
}