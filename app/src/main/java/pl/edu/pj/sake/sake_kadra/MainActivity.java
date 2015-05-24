package pl.edu.pj.sake.sake_kadra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button listaStudentowActivityButton = (Button) findViewById(R.id.lista_studentow_button);
        final Button dodajStudentaActivityButton = (Button) findViewById(R.id.dodaj_studenta_button);

        final Intent listaStudentowActivityIntent = new Intent(this, ListaStudentowActivity.class);
        final Intent dodajStudentaActivityIntent = new Intent(this, DodajStudentaActivity.class);

        listaStudentowActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(listaStudentowActivityIntent);

            }
        });

        dodajStudentaActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(dodajStudentaActivityIntent);

            }
        });
    }
}
