package pl.edu.pj.sake.sake_kadra;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import pl.edu.pj.sake.pl.edu.pj.sake.db.StudentDB;


public class DodajStudentaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodaj_studenta);


        final EditText imieEditText = (EditText) findViewById(R.id.imie_editText);
        final EditText nazwiskoEditText = (EditText) findViewById(R.id.nazwisko_editText);
        final Button dodajStudentaActivityButton = (Button) findViewById(R.id.dodaj2_studenta_button);


        final StudentDB student = new StudentDB(this);

        dodajStudentaActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                student.dodajStudenta(imieEditText.getText().toString(), nazwiskoEditText.getText().toString());
                imieEditText.setText("", TextView.BufferType.EDITABLE);
                nazwiskoEditText.setText("", TextView.BufferType.EDITABLE);
            }
        });
    }
}
