package com.yilmazakkan.haber_portali;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yilma on 18.12.2017.
 */
public class NewsDB extends SQLiteOpenHelper
{
    private  static final int DATABASE_VERSION= 1;
    private static final String DATABASE_NAME= "news_db";
    private static final String TABLE_NAME = "news_list";
    private static String NEWS_ID = "news_id";
    private static String NEWS_TITLE = "news_title";
    private static String NEWS_TEXT = "news_text";
    private static String NEWS_IMG = "news_image";


    public  NewsDB (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = " CREATE TABLE " + TABLE_NAME + "("
                + NEWS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NEWS_TITLE + " TEXT, "
                + NEWS_TEXT + " TEXT, "
                + NEWS_IMG + " BLOB);" ;
        db.execSQL(CREATE_TABLE);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }

}

