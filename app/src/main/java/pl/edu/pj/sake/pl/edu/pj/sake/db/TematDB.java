package pl.edu.pj.sake.pl.edu.pj.sake.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import pl.edu.pj.sake.model.Temat;

/**
 * Created by madzia on 2015-05-26.
 */
public class TematDB extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "sake";
    private static final String TEMAT_TABLE_NAME = "temat";
    private static final String TEMAT_TABLE_CREATE =
            "CREATE TABLE " + TEMAT_TABLE_NAME + " ( tytul TEXT, opis TEXT);";
    private static final String INSERT_TEMAT = "INSERT INTO temat (tytul, opis) VALUES ('Tytul1', 'opis1');";

    public TematDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TEMAT_TABLE_CREATE);
        //db.execSQL(INSERT_TEMAT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void dodajTemat(String tytul, String opis) {
        Temat temat = new Temat(tytul, opis);
        SQLiteDatabase db = getWritableDatabase();
        ContentValues wartosci = new ContentValues();
        wartosci.put("tytul", temat.getTemat());
        wartosci.put("opis", temat.getOpis());
        db.insertOrThrow("temat", null, wartosci);
    }

    public Cursor dajDane() {
        String[] kolumny={"tytul", "opis"};
        SQLiteDatabase db = getReadableDatabase();
        Cursor kursor = db.query("temat", kolumny,null, null, null, null, null);
        return kursor;
    }
}
