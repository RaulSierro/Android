package com.raul.basesqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper{
	
	 public static final String DB_NAME = "contactos.sqlite";
	 public  static int DB_SCHEME_VERSION = 1;

	public DbHelper(Context context) {
		super(context, DB_NAME, null, DB_SCHEME_VERSION = 1);
		// TODO Auto-generated coryonstructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
		db.execSQL(DataBaseManage.CREATE_TABLE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
