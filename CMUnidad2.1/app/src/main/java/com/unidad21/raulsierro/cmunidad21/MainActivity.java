package com.unidad21.raulsierro.cmunidad21;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private ListView lstOpciones;

    private Titular[] datos = new Titular[] {
            new Titular("atletismo.png", "Atletismo", R.id.checkbox),
            new Titular("baloncesto.png", "Baloncesto", R.id.checkbox),
            new Titular("futbol.png", "Futbol", R.id.checkbox),
            new Titular("golf.png", "Golf", R.id.checkbox),
            new Titular("motociclismo.png", "Motociclismo", R.id.checkbox),
            new Titular("natacion.png", "Natacion", R.id.checkbox),
            new Titular("pingpong.png", "PingPong", R.id.checkbox)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdaptadorTitulares adaptador = new AdaptadorTitulares(this);
        lstOpciones = (ListView) findViewById(R.id.lstOpcines);
        lstOpciones.setAdapter(adaptador);


    }


    class AdaptadorTitulares extends ArrayAdapter {

        Activity context;

        public AdaptadorTitulares(Activity context) {
            super(context, R.layout.listitem_listado, datos);
            this.context = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.listitem_listado, null);


            ImageView imagen = (ImageView) item.findViewById(R.id.lblImagen);
            imagen.setImageDrawable(Drawable.createFromPath(datos[position].getImageView()));
            TextView lblTitulo = (TextView) findViewById(R.id.lblTitulo);
            lblTitulo.setText(datos[position].getTitulo());

            CheckBox checkBox = (CheckBox) item.findViewById(R.id.checkbox);
            checkBox.isChecked();

            return (item);

        }


    }
}
