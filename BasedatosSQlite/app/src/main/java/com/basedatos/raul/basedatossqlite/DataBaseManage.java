package com.basedatos.raul.basedatossqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Raul on 29/12/2014.
 */
public class DataBaseManage {

    public static  final String TABLE_NAME = "contactos";
    public static final String CN_ID = "_id";
    public static final String CN_NAME = "nombre";
    public static final String CN_PHONE = "telefono";

    public static final String CREATE_TABLE = "Create table "+TABLE_NAME+ " ("
            + CN_ID + " integer primary key autoincrement,"
            + CN_NAME + " text not null,"
            + CN_PHONE + " text);";

    private DbHelper helper;
    private SQLiteDatabase db;

    public DataBaseManage(Context context) {

        helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    public ContentValues generarContentValues(String nombre, String telefono){
        ContentValues valores = new ContentValues();
        valores.put(CN_NAME, nombre);
        valores.put(CN_PHONE,telefono);

        return valores;
    }

    public void insertar(String nombre, String telefono){


        db.insert(TABLE_NAME, null,generarContentValues(nombre,telefono));
    }

    /*public void insertar2(String nombre, String telefono){

        db.execSQL();
    }*/



}
