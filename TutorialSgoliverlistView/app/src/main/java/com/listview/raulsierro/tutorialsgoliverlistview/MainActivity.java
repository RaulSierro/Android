package com.listview.raulsierro.tutorialsgoliverlistview;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Titular[] datos = new Titular[]{
            new Titular("Titulo1","Subtitulo largo1"),
            new Titular("Titulo2","Subtitulo largo2"),
            new Titular("Titulo3","Subtitulo largo3"),
            new Titular("Titulo4","Subtitulo largo4"),
            new Titular("Titulo5","Subtitulo largo6"),
            new Titular("Titulo6","Subtitulo largo7"),
            new Titular("Titulo7","Subtitulo largo8"),
            new Titular("Titul9","Subtitulo largo9"),
            new Titular("Titulo10","Subtitulo largo10"),
            new Titular("Titulo11","Subtitulo largo11"),
            new Titular("Titulo12","Subtitulo largo12"),
            new Titular("Titulo13","Subtitulo largo13"),
            new Titular("Titulo14","Subtitulo largo14"),
            new Titular("Titulo15","Subtitulo largo15"),
            new Titular("Titulo16","Subtitulo largo16"),
            new Titular("Titulo17","Subtitulo largo17"),
            new Titular("Titulo18","Subtitulo largo18"),
            new Titular("Titulo19","Subtitulo largo19"),
            new Titular("Titulo20","Subtitulo largo20"),
            new Titular("Titulo21","Subtitulo largo21"),
            new Titular("Titulo22","Subtitulo largo22"),
            new Titular("Titulo23","Subtitulo largo23"),
            new Titular("Titulo24","Subtitulo largo24"),
            new Titular("Titulo25","Subtitulo largo25"),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AdaptadorTitulares adaptador = new AdaptadorTitulares(this);
        ListView lstOpciones = (ListView) findViewById(R.id.listView);
        final TextView lblEtiqueta = (TextView) findViewById(R.id.textView);
        lstOpciones.setAdapter(adaptador);

        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String opcionSeleccionada = ((TextView) view.findViewById(R.id.lblTitulo)).getText().toString();
                lblEtiqueta.setText("La opcion seleccionada es: "+ opcionSeleccionada);
            }
        });


    }


    public class AdaptadorTitulares extends ArrayAdapter {
        Activity context;

        AdaptadorTitulares(Activity context) {
            super(context,R.layout.listitem_titular,datos);
            this.context = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            View item = convertView;
            ViewHolder holder;

            if (item == null) {
                LayoutInflater inflater = context.getLayoutInflater();
                item = inflater.inflate(R.layout.listitem_titular, null);

                holder = new ViewHolder();
                holder.titulo = (TextView)item.findViewById(R.id.lblTitulo);
                holder.subtitulo = (TextView)item.findViewById(R.id.lblSubTitulo);

                item.setTag(holder);

            }else {
                holder = (ViewHolder)item.getTag();
            }
            TextView lblTitulo = (TextView) item.findViewById(R.id.lblTitulo);
            lblTitulo.setText(datos[position].getTitulo());

            holder.titulo.setText((CharSequence) datos[position].getTitulo());
            holder.subtitulo.setText((CharSequence) datos[position].getSubtitulo());

            return (item);
        }

        class  ViewHolder {
            TextView titulo;
            TextView subtitulo;

        }



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
