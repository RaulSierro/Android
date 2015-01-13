package com.unidad11.raulsierro.cmunidad11;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private CheckBox chbox;
    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btn;
    private TextView txtSolucion;
    private Boolean check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText) findViewById(R.id.editTextUsuario);
        txtPassword = (EditText) findViewById(R.id.editTextPassword);
        chbox = (CheckBox) findViewById(R.id.checkbox);
        btn = (Button) findViewById(R.id.boton);
        txtSolucion = (TextView) findViewById(R.id.texSolucion);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check) {
                    txtSolucion.setText("Se guardara el Usuario " + txtUsuario.getText().toString() + " y la contrasena " + txtPassword.getText().toString());
                }else {
                    txtSolucion.setText("El Usuario es " + txtUsuario.getText().toString() + " y la contrasena es " + txtPassword.getText().toString());
                }
            }
        });


    }


    public void OnClickCheckBox(View v) {
        check = ((CheckBox) v).isChecked();
        /***if(check) {
            txtSolucion.setText("Seguardara el Usuario " + txtUsuario.getText().toString() + " y la contrasena " + txtPassword.getText().toString());
        }***/
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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
