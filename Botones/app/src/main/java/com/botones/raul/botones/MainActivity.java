package com.botones.raul.botones;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAceptar = (Button) findViewById(R.id.bt_Aceptar);
        //Button btCancelar = (Button) findViewById(R.id.bt_Cancelar);
        Button bt1 = (Button) findViewById(R.id.bt_1);
        Button bt2 = (Button) findViewById(R.id.bt_2);
        Button bt3 = (Button) findViewById(R.id.bt_3);

        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(), "Has pulsado Aceptar", Toast.LENGTH_SHORT).show();
            }
        });

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        String s = new String();

        switch (v.getId()){
            case R.id.bt_1:
                s = "Boton 1";
                break;
            case R.id.bt_2:
                s = "Boton 2";
                break;
            case R.id.bt_3:
                s = "Boton 3";
                break;

        }

        Toast.makeText(getBaseContext(), "Has pulsado " + s, Toast.LENGTH_SHORT).show();


    }

    public void clickCancelar(View v){

        Toast.makeText(getBaseContext(), "Has pulsado Cancelar", Toast.LENGTH_SHORT).show();
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
