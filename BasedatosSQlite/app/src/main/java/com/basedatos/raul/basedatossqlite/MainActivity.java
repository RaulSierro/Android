package com.basedatos.raul.basedatossqlite;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    private DataBaseManage manage;
    private Cursor cursor;
    private ListView lista;
    private SimpleCursorAdapter adapter;
    private TextView tv;
    private ImageButton bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manage = new DataBaseManage(this);
        lista = (ListView) findViewById(R.id.listView);
        tv = (TextView) findViewById(R.id.editText);
        bt = (ImageButton) findViewById(R.id.imageButton);

        bt.setOnClickListener(this);



        String[] from = new String[]{manage.CN_NAME,manage.CN_PHONE};
        int[] to = new int[]{android.R.id.text1,android.R.id.text2};

        cursor = manage.CargarCursorContactos();
        adapter = new SimpleCursorAdapter(this,android.R.layout.two_line_list_item,cursor,from,to,0);
        lista.setAdapter(adapter);


    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.imageButton) {

            new BuscarTask().execute();

        }

    }


    private class BuscarTask extends AsyncTask<Void,Void,Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            cursor = manage.buscarContactos(tv.getText().toString());
            return null;
        }

        @Override
        protected void onPreExecute() {
            Toast.makeText(getApplicationContext(),"Buscando.....",Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            adapter.changeCursor(cursor);
            Toast.makeText(getApplicationContext(),"Busqueda Finalizada.....",Toast.LENGTH_LONG).show();
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
