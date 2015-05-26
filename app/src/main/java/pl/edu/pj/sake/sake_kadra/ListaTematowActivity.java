package pl.edu.pj.sake.sake_kadra;

import android.app.Activity;
import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pj.sake.pl.edu.pj.sake.db.StudentDB;
import pl.edu.pj.sake.pl.edu.pj.sake.db.TematDB;


public class ListaTematowActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tematow);

        ListView listView = (ListView) findViewById(R.id.lista_tematow_view);

        List<String> lista = new ArrayList<String>();

        TematDB temat = new TematDB(this);
        //temat.dodajTemat("Temat1", "Opis tematu 1");//Dodanie przyk³adowego rekordu do bazy danych - przy ka¿dym uruchomieniu

        Cursor cur = temat.dajDane();

        while(cur.moveToNext()) {
            lista.add(cur.getString(0) + " " + cur.getString(1));
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, lista);

        listView.setAdapter(adapter);

    }
}
