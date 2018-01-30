package com.example.david.pruebafinalrecycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView rv = (RecyclerView) findViewById(R.id.lista);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        List<Usuario> listausuario = Arrays.asList(new Usuario(R.mipmap.ic_launcher, "David"),
                new Usuario(R.mipmap.ic_launcher, "Dav"));

        Adaptador adapter = new Adaptador(listausuario);
        rv.setAdapter(adapter);


    }
}
