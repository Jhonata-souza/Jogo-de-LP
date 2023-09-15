package com.example.purshecat;

import android.content.Intent;
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
}
