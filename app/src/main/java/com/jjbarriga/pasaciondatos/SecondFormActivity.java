package com.jjbarriga.pasaciondatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jjbarriga.pasaciondatos.utils.Personas;

public class SecondFormActivity extends AppCompatActivity{

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_form);
        instancias();
        recuperarDatos();
    }

    private void instancias() {
        textView = findViewById(R.id.textRec);
    }


    private void recuperarDatos() {
        if (getIntent().getExtras() != null) {
            Personas personas = (Personas) getIntent().getExtras().get(MainFormActivity.TAG_2);
            String saludo = String.format("%s %s %s %d ",
                    getResources().getString(R.string.Enhorabuena),
                    personas.getNombre(),
                    getResources().getString(R.string.numRecu),
                    personas.getTelefono());
            textView.setText(saludo);
        }
    }


}
