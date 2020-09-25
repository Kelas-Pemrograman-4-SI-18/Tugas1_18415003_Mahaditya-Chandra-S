package com.chandra.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNama, edtNpm, edtJk, edtProdi, edtFakultas, edtNoTelp;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtNpmDanNama);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtJk = (EditText) findViewById(R.id.edtJk);
        edtProdi = (EditText) findViewById(R.id.edtprodi);
        edtFakultas = (EditText) findViewById(R.id.edtFakultas);
        edtNoTelp = (EditText) findViewById(R.id.edtNotlp);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strJk = edtJk.getText().toString();
                String strProdi = edtProdi.getText().toString();
                String strFakultas = edtFakultas.getText().toString();
                String strNoTelp = edtNoTelp.getText().toString();

                txtTampil.setText(strNpm + "\n" + strNama + "\n" + strJk + "\n" + strProdi + "\n" + strFakultas + "\n" + strNoTelp );
            }
        });


    }
}