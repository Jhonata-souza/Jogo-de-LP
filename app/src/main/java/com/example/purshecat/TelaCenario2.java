package com.example.purshecat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaCenario2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacenario2);
    }
    public void IrVoltarCenarios (View view){
        Intent intent = new Intent(this, TelaCenarios.class);
        startActivity(intent);
    }
    public void IrMapa (View view){
        Uri linkmapa = Uri.parse("https://www.google.com/maps/place/Guilin,+Guangxi,+China/@25.2877098,110.2914047,12z/data=!3m1!4b1!4m6!3m5!1s0x36a4f43675215133:0xff86c1191d704ae1!8m2!3d25.2736099!4d110.29002!16zL20vMDFzOXpw?hl=pt-BR&entry=ttu");
        Intent it = new Intent(Intent.ACTION_VIEW,linkmapa);
        startActivity(it);
    }
}
