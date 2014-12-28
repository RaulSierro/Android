package com.textoavanzado.raul.controltextoavanzado;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.auto_CTV);                 //Declaracion de los elementos
        MultiAutoCompleteTextView multi = (MultiAutoCompleteTextView) findViewById(R.id.multi_CTV);

        String[] paises = getResources().getStringArray(R.array.paises_array);                          //Creacion de nuestro Array

        ArrayAdapter<String>adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,paises);// Utilizacion de un adaptador que nos proporciona el sistema aunque tb lo podemos crear nosotros

        auto.setThreshold(1);                                                                           // Le decimos cuantas letras utilizamos para las sujerencias
        multi.setThreshold(1);
        multi.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());                             // Le decimos con que vamos a separar las palabras, en este caso comas

        auto.setAdapter(adapter);                                                                       // Asignamos el adaptador
        multi.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
