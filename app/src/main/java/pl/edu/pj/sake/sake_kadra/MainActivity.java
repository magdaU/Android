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
        final Button listaTematowActivityButton = (Button) findViewById(R.id.lista_tematow_button);
        final Button dodajTematActivityButton = (Button) findViewById(R.id.dodaj_temat_button);

        final Intent listaStudentowActivityIntent = new Intent(this, ListaStudentowActivity.class);
        final Intent dodajStudentaActivityIntent = new Intent(this, DodajStudentaActivity.class);

        final Intent listaTematowActivityIntent = new Intent(this, ListaTematowActivity.class);
        final Intent dodajTematActivityIntent = new Intent(this, DodajTematActivity.class);

        listaStudentowActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(listaStudentowActivityIntent);

            }
        });

        listaTematowActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(listaTematowActivityIntent);

            }
        });

        dodajStudentaActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(dodajStudentaActivityIntent);

            }
        });

        dodajTematActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(dodajTematActivityIntent);

            }
        });
    }
}
