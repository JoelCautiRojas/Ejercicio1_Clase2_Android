package com.example.edutools.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //definicion de variables
    EditText et_entrada;
    Button bt_miboton;
    TextView tv_salida;
    ImageView im_imagenbandera;
    Button bt_botonperu;
    Button bt_botonchile;
    Button bt_botonargentina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //relacionar variables con componentes
        et_entrada = (EditText) findViewById(R.id.entrada);
        bt_miboton = (Button) findViewById(R.id.miboton);
        tv_salida = (TextView) findViewById(R.id.salida);
        im_imagenbandera = (ImageView) findViewById(R.id.imagenbandera);
        bt_botonperu = (Button) findViewById(R.id.botonperu);
        bt_botonchile = (Button) findViewById(R.id.botonchile);
        bt_botonargentina = (Button) findViewById(R.id.botonargentina);
        bt_miboton.setOnClickListener(this);
        bt_botonperu.setOnClickListener(this);
        bt_botonchile.setOnClickListener(this);
        bt_botonargentina.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.miboton:
                tv_salida.setText(et_entrada.getText().toString());
                break;
            case R.id.botonperu:
                im_imagenbandera.setImageResource(R.drawable.bandera1);
                break;
            case R.id.botonchile:
                im_imagenbandera.setImageResource(R.drawable.bandera2);
                break;
            case R.id.botonargentina:
                im_imagenbandera.setImageResource(R.drawable.bandera3);
                break;
            default:
                break;
        }
    }
}