package com.example.carlos.cursoandroidgeekipedia_appradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText et_valor1 ,et_valor2 ;
    private TextView tv_resultado;
    private RadioButton rb_sumar, rb_restar, rb_mult, rb_dividir;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valor1 = findViewById(R.id.et_valor1);
        et_valor2 = findViewById(R.id.et_valor2);
        tv_resultado = findViewById(R.id.tv_resultado);
        rb_sumar = findViewById(R.id.rb_sumar);
        rb_restar = findViewById(R.id.rb_restar);
        rb_mult = findViewById(R.id.rb_mult);
        rb_dividir = findViewById(R.id.rb_dividir);
    }

    public void calcular(View view){

        String valor1_s = et_valor1.getText().toString();
        String valor2_s = et_valor2.getText().toString();


        int valor1_int = Integer.parseInt(valor1_s);
        int valor2_int = Integer.parseInt(valor2_s);
        int res= 0;

    //hacer las operaciones.

        if (rb_sumar.isChecked()) {
            res = valor1_int + valor2_int;
            String resultado = String.valueOf(res);
            tv_resultado.setText(resultado);
        }
        else
        if (rb_restar.isChecked()) {
            res = valor1_int - valor2_int;
            String resultado = String.valueOf(res);
            tv_resultado.setText(resultado);
        }
        else
        if (rb_mult.isChecked()) {
            res = valor1_int * valor2_int;
            String resultado = String.valueOf(res);
            tv_resultado.setText(resultado);
        }
        else
        if (rb_dividir.isChecked()) {
            res = valor1_int - valor2_int;
            String resultado = String.valueOf(res);
            tv_resultado.setText(resultado);
        }

        else
        {Toast.makeText(getApplicationContext(), "Debe de marcar sumar o restar " , Toast.LENGTH_LONG).show();}






    }




}
