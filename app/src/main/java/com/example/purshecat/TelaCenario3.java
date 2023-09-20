package com.example.purshecat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaCenario3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacenario3);
    }
    public void IrVoltarCenarios (View view){
        Intent intent = new Intent(this, TelaCenarios.class);
        startActivity(intent);
    }

}
