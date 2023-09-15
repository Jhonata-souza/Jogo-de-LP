package com.example.purshecat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaCenarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacenarios);
    }
    public void IrCenario1 (View view){
        Intent intent = new Intent(this, TelaCenario1.class);
        startActivity(intent);
    }

    public void IrCenario2 (View view){
        Intent intent = new Intent(this, TelaCenario2.class);
        startActivity(intent);
    }

    public void IrCenario3 (View view){
        Intent intent = new Intent(this, TelaCenario3.class);
        startActivity(intent);
    }

    public void VoltarMainActivity (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
