package pl.edu.pj.sake.pl.edu.pj.sake.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by madzia on 2015-05-24.
 */
public class StudentDB  extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "sake1";
    private static final String STUDENT_TABLE_NAME = "student";
    private static final String STUDENT_TABLE_CREATE =
            "CREATE TABLE " + STUDENT_TABLE_NAME + " ( imie TEXT, nazwisko TEXT);";
    private static final String STUDENT_TABLE_DROP = "DROP TABLE student;";
    private static final String STUDENT_DELETE = "DELETE FROM student;";

    public StudentDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //db.execSQL(STUDENT_TABLE_DROP);
        db.execSQL(STUDENT_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       // db.execSQL(STUDENT_DELETE);
    }

    public void dodajStudenta(String imie, String nazwisko) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues wartosci = new ContentValues();
        wartosci.put("imie", imie);
        wartosci.put("nazwisko", nazwisko);
        db.insertOrThrow("student", null, wartosci);
    }

    public Cursor dajDane() {
        String[] kolumny={"imie", "nazwisko"};
        SQLiteDatabase db = getReadableDatabase();
        Cursor kursor = db.query("student", kolumny,null, null, null, null, null);
        return kursor;
    }
}
