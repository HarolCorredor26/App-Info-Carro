package com.example.carro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ResourceBundle;

public class MainActivity2 extends AppCompatActivity {
    private TextView pantalla1;
    private TextView pantalla2;
    private TextView pantalla3;
    private TextView pantalla4;
    private TextView pantalla5;
    private TextView pantalla6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pantalla1=findViewById(R.id.pantalla1);
        pantalla2=findViewById(R.id.pantalla2);
        pantalla3=findViewById(R.id.pantalla3);
        pantalla4=findViewById(R.id.pantalla4);
        pantalla5=findViewById(R.id.pantalla5);
        pantalla6=findViewById(R.id.pantalla6);

        Bundle recibirDatos = getIntent().getExtras();
        String info1 = recibirDatos.getString("dato1");
        String info2 = recibirDatos.getString("dato2");
        String info3 = recibirDatos.getString("dato3");
        String info4 = recibirDatos.getString("dato4");
        String info5 = recibirDatos.getString("dato5");
        String info6 = recibirDatos.getString("dato6");

        pantalla1.setText(info1);
        pantalla2.setText(info2);
        pantalla3.setText(info3);
        pantalla4.setText(info4);
        pantalla5.setText(info5);
        pantalla6.setText(info6);

    }

}