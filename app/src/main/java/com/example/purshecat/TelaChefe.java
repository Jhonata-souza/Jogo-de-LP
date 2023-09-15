package com.example.purshecat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaChefe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telachefe);
    }
    public void VoltarPersonagem (View view){
        Intent intent = new Intent(this, TelaPersonagem.class);
        startActivity(intent);
    }
}
