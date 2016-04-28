package com.filipkesteli.ispit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private EditText etName;
    private EditText etGender;
    private EditText etInterests;
    private Button btnBACK;
    private Button btnOUT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initWidgets();
        handleIntents();
    }

    private void initWidgets() {
        etName = (EditText) findViewById(R.id.etName);
        etGender = (EditText) findViewById(R.id.etGender);
        etInterests = (EditText) findViewById(R.id.etInterests);
        btnBACK = (Button) findViewById(R.id.btnBACK);
        btnOUT = (Button) findViewById(R.id.btnOUT);
    }

    private void handleIntents() {
        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.PARAMETER_ETNAME)) {
            etName =
        }
        /*
        if (intent.hasExtra(MainActivity.PARAMETER_SECOND)) {
            Toast.makeText(SecondActivity.this,
                    intent.getStringExtra(MainActivity.PARAMETER_SECOND), Toast.LENGTH_SHORT).show();
        }
        */
    }

    /*
    @Override
    public void finish() {

        //ne treba imati cilj kamo ide, jer zna kamo ide po defaultu!
        //To je paket koji zna kamo treba ici po REQUEST_CODE-u
        //kreiramo prazni intent
        //kao implicitni intent -> zna kamo se vraca po REQUEST_CODE-u,
        //dok implicitni intent zna po INTENT FILTERU, nije eksplicitni
        Intent data = new Intent();
        data.putExtra(MainActivity.PARAMETER_SECOND, getString(R.string.natrag_u_main));
        setResult(RESULT_OK, data);

        super.finish();
    }
    */
}
