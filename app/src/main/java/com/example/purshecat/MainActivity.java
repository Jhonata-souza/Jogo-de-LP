package com.example.purshecat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void IrPersonagem (View view){
        Intent intent1 = new Intent(this, TelaPersonagem.class);
        startActivity(intent1);
    }
    public void IrCenarios (View view){
        Intent intent2 = new Intent(this, TelaCenarios.class);
        startActivity(intent2);

    }
}