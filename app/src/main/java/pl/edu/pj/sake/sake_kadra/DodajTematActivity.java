package pl.edu.pj.sake.sake_kadra;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import pl.edu.pj.sake.pl.edu.pj.sake.db.StudentDB;
import pl.edu.pj.sake.pl.edu.pj.sake.db.TematDB;


public class DodajTematActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodaj_temat);


        final EditText tytulEditText = (EditText) findViewById(R.id.tytul_editText);
        final EditText opisEditText = (EditText) findViewById(R.id.opis_editText);
        final Button dodajTematActivityButton = (Button) findViewById(R.id.dodaj2_temat_button);


        final TematDB temat = new TematDB(this);

        dodajTematActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temat.dodajTemat(tytulEditText.getText().toString(), opisEditText.getText().toString());
                tytulEditText.setText("", TextView.BufferType.EDITABLE);
                opisEditText.setText("", TextView.BufferType.EDITABLE);
            }
        });
    }
}
