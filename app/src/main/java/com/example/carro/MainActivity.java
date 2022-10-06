package com.example.carro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText texto1;
        EditText texto2;
        EditText texto3;
        EditText texto4;
        EditText texto5;
        EditText texto6;
        Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = findViewById(R.id.boton1);
        texto1 = findViewById(R.id.texto1);
        texto2 = findViewById(R.id.texto2);
        texto3 = findViewById(R.id.texto3);
        texto4 = findViewById(R.id.texto4);
        texto5 = findViewById(R.id.texto5);
        texto6 = findViewById(R.id.texto6);

        boton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Bundle EnviarDatos = new Bundle();
                EnviarDatos.putString("dato1",texto1.getText().toString());
                EnviarDatos.putString("dato2",texto2.getText().toString());
                EnviarDatos.putString("dato3",texto3.getText().toString());
                EnviarDatos.putString("dato4",texto4.getText().toString());
                EnviarDatos.putString("dato5",texto5.getText().toString());
                EnviarDatos.putString("dato6",texto6.getText().toString());

                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtras(EnviarDatos);
                startActivity(i);
            }
        });


    }
}