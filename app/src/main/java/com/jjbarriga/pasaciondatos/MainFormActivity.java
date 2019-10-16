package com.jjbarriga.pasaciondatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.jjbarriga.pasaciondatos.utils.Personas;

public class MainFormActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nombre, telefono;
    Button pasar;
    CheckBox carnet;

    static final String TAG_2 = "texto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_form);
        instancias();
        acciones();
    }

    private void acciones() {
        pasar.setOnClickListener(this);
    }

    private void instancias() {
        pasar = findViewById(R.id.passDatos);
        nombre = findViewById(R.id.btnNombre);
        telefono = findViewById(R.id.btnTlfno);
        carnet = findViewById(R.id.carnet);
    }

    @Override
    public void onClick(View view) {
        if(!nombre.getText().toString().isEmpty() && telefono.getText().toString().length() == 9){
            int tlfnRec = Integer.valueOf(telefono.getText().toString());
            String nmRec = nombre.getText().toString();
            Intent intent = new Intent(getApplicationContext(), SecondFormActivity.class);


            Personas personas = new Personas(nmRec, tlfnRec, carnet.isChecked());
            intent.putExtra(TAG_2, personas);
            startActivity(intent);
        }

    }
}
