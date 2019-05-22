package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public String titulo="",convert="";
    public Button btn2,btn1,btn3,btn4,btn5,btn6,btn7,btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titulo=btn1.getText().toString();
                convert="1";
                Intent Intent=new Intent(getApplicationContext(),Main2Activity.class);
                Intent.putExtra("tit",titulo);
                Intent.putExtra("conv",convert);
                startActivity(Intent);
            }
        });
        btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titulo=btn2.getText().toString();
                convert="2";
                Intent Intent=new Intent(getApplicationContext(),Main2Activity.class);
                Intent.putExtra("tit",titulo);
                Intent.putExtra("conv",convert);
                startActivity(Intent);
            }
        });
        btn3=(Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titulo=btn3.getText().toString();
                convert="3";
                Intent Intent=new Intent(getApplicationContext(),Main2Activity.class);
                Intent.putExtra("tit",titulo);
                Intent.putExtra("conv",convert);
                startActivity(Intent);
            }
        });
        btn4=(Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titulo=btn4.getText().toString();
                convert="4";
                Intent Intent=new Intent(getApplicationContext(),Main2Activity.class);
                Intent.putExtra("tit",titulo);
                Intent.putExtra("conv",convert);
                startActivity(Intent);
            }
        });
        btn5=(Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titulo=btn5.getText().toString();
                convert="5";
                Intent Intent=new Intent(getApplicationContext(),Main2Activity.class);
                Intent.putExtra("tit",titulo);
                Intent.putExtra("conv",convert);
                startActivity(Intent);
            }
        });
        btn6=(Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titulo=btn6.getText().toString();
                convert="6";
                Intent Intent=new Intent(getApplicationContext(),Main2Activity.class);
                Intent.putExtra("tit",titulo);
                Intent.putExtra("conv",convert);
                startActivity(Intent);
            }
        });
        btn7=(Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert="7";
                titulo=btn7.getText().toString();
                Intent Intent=new Intent(getApplicationContext(),Main2Activity.class);
                Intent.putExtra("tit",titulo);
                Intent.putExtra("conv",convert);
                startActivity(Intent);
            }
        });
        btn8=(Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert="8";
                titulo=btn8.getText().toString();
                Intent Intent=new Intent(getApplicationContext(),Main2Activity.class);
                Intent.putExtra("tit",titulo);
                Intent.putExtra("conv",convert);
                startActivity(Intent);
            }
        });
    }
}
