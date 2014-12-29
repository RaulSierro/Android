package com.basedatos.raul.basedatossqlite;

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

}
