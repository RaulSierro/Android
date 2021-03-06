package com.tutorial.raulsierro.tutorialsgoliver;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = (Button) findViewById(R.id.btPulsar);
        final TextView lblMensaje = (TextView) findViewById(R.id.textView);
        final ToggleButton togle = (ToggleButton) findViewById(R.id.toggleButton);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblMensaje.setText("Has pulsado el boton");
            }
        });

        togle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (togle.isChecked()) {
                    lblMensaje.setText("Has pulsado: ON");
                }else {
                    lblMensaje.setText("Has pulsado: OFF");
                }


            }
        });
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