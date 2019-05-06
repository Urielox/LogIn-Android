package com.example.urielgarciamoreno.log_in;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {

    TextView txtVwBienvenida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        txtVwBienvenida = (TextView)findViewById(R.id.txtVwBienvenida);
        String correo = (String)getIntent().getStringExtra("correo");
        txtVwBienvenida.setText(txtVwBienvenida.getText().toString()+ correo);
    }
}
