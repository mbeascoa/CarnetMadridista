package com.example.carnetmadridista;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class ventana_formulario extends AppCompatActivity{


TextView textViewNombre, textView1Apellido, textView2Apellido, textViewTelefono, textViewCorreo, textViewConfirmarCorreo, textViewSocio, textViewMayor, textViewResidente, textViewRegistroSocio, textViewCompuesto;
        EditText editTextNombre, editText1Apellido, editText2Apellido, editTextTelefono, editTextCorreo, editTextConfirmaCorreo;
        RadioGroup rgSocio, rgMayor, rgResidente;
        RadioButton radioButtonSoySocio, radioButtonNoSoySocio, radioButtonMenor, radioButtonMayor, radioButtonResidente, radioButtonNoResidente;
        Button btnSolicitaCarnet, btnAceptar, btnCerrar;


@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView logoRealMadrid = (ImageView) findViewById(R.id.imageViewCarnetMadridista);
        logoRealMadrid.setImageResource(R.drawable.carnetmadridista);

        textViewNombre = (TextView) findViewById(R.id.textViewNombre);
        textView1Apellido = (TextView) findViewById(R.id.textView1Apellido);
        textView2Apellido = (TextView) findViewById(R.id.textView2Apellido);
        textViewTelefono = (TextView) findViewById(R.id.textViewTelefono);
        textViewCorreo = (TextView) findViewById(R.id.textViewCorreo);
        textViewConfirmarCorreo = (TextView) findViewById(R.id.textViewConfirmarCorreo);
        textViewSocio = (TextView) findViewById(R.id.textViewSocio);
        textViewMayor = (TextView) findViewById(R.id.textViewMayor);
        textViewResidente = (TextView) findViewById(R.id.textViewResidente);
        textViewRegistroSocio = (TextView) findViewById(R.id.textViewRegistroSocio);
        textViewCompuesto = (TextView) findViewById(R.id.textViewCompuesto);

        editTextNombre = (EditText) findViewById(R.id.editTextNombre);
        editText1Apellido = (EditText) findViewById((R.id.editText1Apellido));
        editText2Apellido = (EditText) findViewById(R.id.editText2Apellido);
        editTextTelefono = (EditText) findViewById(R.id.editTextTelefono);
        editTextCorreo = (EditText) findViewById(R.id.editTextCorreo);
        editTextConfirmaCorreo = (EditText) findViewById(R.id.editTextConfirmaCorreo);

        rgSocio = (RadioGroup) findViewById(R.id.rgSocio);
        rgMayor = (RadioGroup) findViewById(R.id.rgMayor);
        rgResidente = (RadioGroup) findViewById(R.id.rgResidente);

        radioButtonSoySocio = (RadioButton) findViewById(R.id.radioButtonSoySocio);

        radioButtonNoSoySocio = (RadioButton) findViewById(R.id.radioButtonNoSoySocio);

        radioButtonMenor = (RadioButton) findViewById(R.id.radioButtonMenor);

        radioButtonMayor = (RadioButton) findViewById(R.id.radioButtonMayor);

        radioButtonResidente = (RadioButton) findViewById(R.id.radioButtonResidente);

        radioButtonNoResidente = (RadioButton) findViewById(R.id.radioButtonNoResidente);

        btnSolicitaCarnet = (Button) findViewById(R.id.btnSolicitaCarnet);
        btnAceptar = (Button) findViewById(R.id.btnAceptar);
        btnCerrar = (Button) findViewById(R.id.btnCerrar);


        }

public void irFormulario(View view) {

        Intent i = new Intent(this, Resultado.class);

        //recojo los valores de los editText
        String nombre= editTextNombre.getText().toString();
        String apellido1= editText1Apellido.getText().toString();
        String apellido2= editText2Apellido.getText().toString();
        String telefono= editTextTelefono.getText().toString();
        String correo= editTextCorreo.getText().toString();
        String confcorreo= editTextConfirmaCorreo.getText().toString();
        boolean soySocio = radioButtonSoySocio.isChecked();
        boolean noSoySocio = radioButtonNoSoySocio.isChecked();
        boolean soyMenor = radioButtonMenor.isChecked();
        boolean soyMayor = radioButtonMayor.isChecked();
        boolean soyResidente = radioButtonResidente.isChecked();
        boolean noSoyResidente = radioButtonNoResidente.isChecked();




        if (confcorreo.equals(correo)){

                //  vemos la selección del radio group soy Socio
                int radioSocioSel = rgSocio.getCheckedRadioButtonId();
                switch (radioSocioSel){
                        case R.id.radioButtonSoySocio:
                                 soySocio = true;
                                break;
                        case R.id.radioButtonNoSoySocio:
                                soySocio = false;
                                break;
                }
                //  vemos la selección del radio group soy Mayor
                int radioMayorSel = rgMayor.getCheckedRadioButtonId();
                switch (radioMayorSel){
                        case R.id.radioButtonMayor:
                                soyMayor = true;
                                break;
                        case R.id.radioButtonMenor:
                                soyMayor = false;
                                break;
                }
                //  vemos la selección del radio group Residente
                int radioResidenteSel = rgResidente.getCheckedRadioButtonId();
                switch (radioResidenteSel){
                        case R.id.radioButtonResidente:
                                 soyResidente = true;
                                break;
                        case R.id.radioButtonNoResidente:
                                soyResidente = false;
                                break;
                }
                Madridista dataCourse = new Madridista(nombre, apellido1, apellido2, telefono, correo, soySocio, soyMayor, soyResidente);


                Bundle bundle = new Bundle();
                bundle.putSerializable("data", dataCourse);
                i.putExtras(bundle);
                startActivity(i);

        }  else {
                Toast.makeText( this, "No son iguales los Email", Toast.LENGTH_SHORT ).show();
        }

}





        }


