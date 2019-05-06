package com.example.urielgarciamoreno.log_in;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEntrar;
    EditText editTextEmail, editTextContra;
    final String correo = "urielox@hotmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = (Button)findViewById(R.id.btnEntrar);

        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        editTextContra = (EditText)findViewById(R.id.editTextContra);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextEmail.getText().toString().equals(correo) || editTextContra.getText().toString().equals("megaman")){

                    try{

                        Toast.makeText(recuperaActivity(), "Usuario Correcto", Toast.LENGTH_LONG).show();
                        Intent inicio = new Intent(MainActivity.this, Inicio.class);
                        inicio.putExtra("correo", correo);
                        startActivity(inicio);
                    }
                    catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }

                }
                else{
                    Toast.makeText(recuperaActivity(), "Correo o contraseña incorrectos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public MainActivity recuperaActivity(){
        return this;
    }
}
