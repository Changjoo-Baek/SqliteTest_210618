//package com.zzazzu.sqlitetest_210618

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns
import android.util.Log

class ContactDBHelper private constructor(context: Context):
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    private val TAG = this.javaClass.simpleName
    override fun onCreate(db:SQLiteDatabase) {
         db.execSQL(SQL_CREATE_ENTRIES)
         Log.v(TAG, "DB Created")
     }

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "orgChart.db"

        private val SQL_CREATE_ENTRIES = "create table ${ContactContract.Entry.TABLE_NAME}(" +
                "$(BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                "$(ContactContract.Entry._IDX} TEXT not null unique," +
                "$(ContactConstract.Entry.NAME} TEXT not null," +
                "$(ContactConstract.Entry.MobileNO} TEXT not null," +
                "$(ContactConstract.Entry.telNO} TEXT," +
                "$(ContactConstract.Entry.Team} TEXT," +
                "$(ContactConstract.Entry.Mission} TEXT," +
                "$(ContactConstract.Entry.Position} TEXT," +
                "$(ContactConstract.Entry.Photo} TEXT," +
                "$(ContactConstract.Entry.Status} TEXT);"

        private const val SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS $(ContactContract.Entry.TABLE_NAME}"
        private var sInstance: ContactDBHelper? = null

        @Synchronized
        fun getInstance(context: Context): ContactDBHelper?{
            if (sInstance == null) {
                sInstance = ContactDBHelper(context)
            }
            return sInstance
        }
    }
}