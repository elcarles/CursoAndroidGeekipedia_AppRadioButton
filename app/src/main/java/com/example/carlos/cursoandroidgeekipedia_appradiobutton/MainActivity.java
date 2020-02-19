package com.example.carlos.cursoandroidgeekipedia_appradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText et_valor1;
    private EditText et_valor2;
    private TextView tv_resultado;
    private RadioButton rb_sumar;
    private RadioButton rb_restar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valor1 = findViewById(R.id.et_valor1);
        et_valor2 = findViewById(R.id.et_valor2);
        tv_resultado = findViewById(R.id.tv_resultado);
        rb_sumar = findViewById(R.id.rb_sumar);
        rb_restar = findViewById(R.id.rb_restar);

    }

    public void calcular(View view){

        String valor1_s = et_valor1.getText().toString();
        String valor2_s = et_valor2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_s);
        int valor2_int = Integer.parseInt(valor2_s);
        int resultado = 0;

    //hacer las operaciones.

        if (rb_sumar.isChecked()) {
            resultado = valor1_int + valor2_int;
        }
        else
        if (rb_sumar.isChecked()) {
            resultado = valor1_int - valor2_int;
        }
         else
        {Toast.makeText(getApplicationContext(), "Debe de marcar sumar o restar " , Toast.LENGTH_LONG).show();}


        tv_resultado.setText("El resultado es  " + resultado );



    }




}
