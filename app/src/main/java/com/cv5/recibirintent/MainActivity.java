package com.cv5.recibirintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ListView lista;
        ArrayList<Usuarios> arrayListUsuario;
        CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);

        arrayListUsuario = new ArrayList<>();
        arrayListUsuario
                .add(new Usuarios("Cristian",R.drawable.usuario));
        arrayListUsuario
                .add(new Usuarios("Felix",R.drawable.usuario));
        arrayListUsuario
                .add(new Usuarios("Pedro",R.drawable.usuarioj));
        arrayListUsuario
                .add(new Usuarios("Gonzalo",R.drawable.usuariop));


        adapter = new CustomAdapter(this,0,arrayListUsuario);

        lista.setAdapter(adapter);


    }
}
