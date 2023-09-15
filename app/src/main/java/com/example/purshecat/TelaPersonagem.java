package com.example.purshecat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaPersonagem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telapersonagem);
    }
    public void IrChefe (View view){
        Intent intent = new Intent(this, TelaChefe.class);
        startActivity(intent);
    }
    public void IrProtagonista (View view){
        Intent intent = new Intent(this, TelaProtagonista.class);
        startActivity(intent);
    }
    public void IrBracoDireito (View view){
        Intent intent = new Intent(this, TelaBracoDireito.class);
        startActivity(intent);
    }

    public void VoltarMainActivity (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
