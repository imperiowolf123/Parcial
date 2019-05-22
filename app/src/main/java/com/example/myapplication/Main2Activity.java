package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    public String titulo="",convert="";
    EditText editText;
    TextView res;
    Button btn_resultado;
    public double num,resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        titulo = getIntent().getStringExtra("tit");
        this.setTitle(titulo);
        convert = getIntent().getStringExtra("conv");
        btn_resultado=(Button)findViewById(R.id.btn_calcular);
        btn_resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    editText=(EditText)findViewById(R.id.edit_text);
                    num=Integer.parseInt(editText.getText().toString());
                    res=(TextView)findViewById(R.id.res);
                        switch (convert) {
                            case "1":
                                resultado = (num * 1.8) + 32;
                                res.setText(resultado + "ºf");

                                break;
                            case "2":
                                resultado = (num - 32) * 1.8;
                                res.setText(resultado + "ºc");
                                break;
                            case "3":
                                resultado = num + 273.15;
                                res.setText(resultado + "ºk");
                                break;
                            case "4":
                                resultado = num - 273.15;
                                res.setText(resultado + "ºc");
                                break;
                            case "5":
                                resultado = num * 100;
                                res.setText(resultado + "cm");
                                break;
                            case "6":
                                resultado = num / 100;
                                res.setText(resultado + "m");
                                break;
                            case "7":
                                resultado = num / 2.54;
                                res.setText(resultado + "inch");
                                break;
                            case "8":
                                resultado = num * 2.54;
                                res.setText(resultado + "cm");
                                break;
                        }

                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Escribe un numero en el espacio de texto",Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
