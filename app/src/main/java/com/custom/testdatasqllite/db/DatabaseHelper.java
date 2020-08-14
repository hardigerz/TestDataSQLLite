package com.custom.testdatasqllite.db;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper{

    public static final String TABLE_NAME = "data_invetory";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "nama_barang";
    public static final String COLUMN_QTY = "qty";
    public static final String COLUMN_DATE = "exp_date";
    public static final String COLUMN_PRICE = "harga";
    private static final String db_name ="inventori.db";
    private static final int db_version=1;

    private static final String db_create = "create table "
            + TABLE_NAME + "("
            + COLUMN_ID +" integer primary key autoincrement, "
            + COLUMN_NAME+ " varchar(50) not null, "
            + COLUMN_QTY+ " integer not null, "
            + COLUMN_DATE+ " varchar(50) not null), "
            + COLUMN_PRICE+ " varchar(50) not null); ";


    public DatabaseHelper(Context context) {
        super(context, db_name, null, db_version);
        // Auto generated
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(db_create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        Log.e(DatabaseHelper.class.getName(),"Upgrading database from version " + i1 + " to "
                + i + ", which will destroy all old data");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
