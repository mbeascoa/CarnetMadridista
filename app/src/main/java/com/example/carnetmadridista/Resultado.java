package com.example.carnetmadridista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView mensajeSalida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        Intent inta = getIntent();
        Madridista data = (Madridista) inta.getSerializableExtra("data");

        String datoNombre=data.getNombre();
        String datoApellido1= data.getApellido1();
        String datoApellido2= data.getApellido2();
        String datoTelefono= data.getTelefono();
        String datoCorreo = data.getCorreo();

        String datoSocio=data.isSocio ? "SI": "NO";
        String datoMayor=data.isMayor? "SI": "NO";
        String datoResidente=data.isResidente? "SI": "NO";

        mensajeSalida = findViewById(R.id.textViewCompuesto);
        this.mensajeSalida.setText(Html.fromHtml("<p> <h4> Registro Socio: </h4></p> Nombre: <h5>" + datoNombre + "</h5> </p> Apellidos: <h5>" + datoApellido1 + " " + datoApellido2 +
                "</p></h5> Telefono: <h5> " + datoTelefono + "</p></h5> Email: <h5> "+ datoCorreo + "</p></h5> Socio: <h5> "+ datoSocio + "</p></h5> Menor Edad: <h5> " + datoMayor +"</p></h5> Extranjero:  <h5> " + datoResidente +"</h5>" ), TextView.BufferType.SPANNABLE);


    }

    public void closeWindow(View view) {
        finish();
    }
}