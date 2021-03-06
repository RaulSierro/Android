package com.controlespersonalizadosb.raulsierro.controlpersonalizadoii;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private ControlLogin ctlLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctlLogin = (ControlLogin) findViewById(R.id.CtlLogin);

        ctlLogin.setOnLoginListener(new OnLoginListener() {
            @Override
            public void onLogin(String usuario, String password) {
                if (usuario.equals("Raul") && password.equals("Sierro")) {
                    ctlLogin.setMensaje("Login Correcto¡¡¡");
                }else {
                    ctlLogin.setMensaje("ERROR: Usuario o contrasena no coinciden");
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
