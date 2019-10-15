package com.jjbarriga.pasaciondatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText textoCaptura;
    private Button btnPaso, btnPasoParam;
    static final String TAG_1 = "texto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        btnPaso.setOnClickListener(this);
        btnPasoParam.setOnClickListener(this);
    }

    private void instancias() {
        textoCaptura = findViewById(R.id.textoCapturar);
        btnPaso = findViewById(R.id.btnPaso);
        btnPasoParam = findViewById(R.id.btnPasoParam);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnPaso:
                /*String palabra = textoCaptura.getText().toString();
                if (palabra.length()>0){
                    Toast.makeText(getApplicationContext(), palabra, Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Vacio",Toast.LENGTH_SHORT).show();
                }
                --------------------------
                */
                String palabra = textoCaptura.getText().toString();
                if (palabra.length()>0)
                    Toast.makeText(getApplicationContext(), palabra, Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "vacio", Toast.LENGTH_SHORT).show();
                /*
                --------------------------
                if (!textoCaptura.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(), textoCaptura.getText().toString(), Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();

                */

                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(i);
                break;

            case R.id.btnPasoParam:
                if (!textoCaptura.getText().toString().isEmpty()) {
                    Intent iPasar = new Intent(getApplicationContext(), SecondActivity.class);
                    iPasar.putExtra(TAG_1, textoCaptura.getText().toString());
                    startActivity(iPasar);
                } else
                    Toast.makeText(getApplicationContext(),"Por favor introduce datos",Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
