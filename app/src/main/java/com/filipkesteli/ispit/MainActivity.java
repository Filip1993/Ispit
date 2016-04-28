package com.filipkesteli.ispit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public static final String PARAMETER_SECOND = "com.filipkesteli.ispit.PARAMETER_SECOND";
    public static final int REQUEST_CODE = 0;

    public static final String PARAMETER_ETNAME = "com.filipkesteli.ispit.PARAMETER_ETNAME";
    public static final String PARAMETER_RG_GENDER = "com.filipkesteli.ispit.PARAMETER_RG_GENDER";
    public static final String PARAMETER_SP_INTERESTS = "com.filipkesteli.ispit.PARAMETER_SP_INTERESTS";

    private Button btnOK;
    private EditText etName;
    private RadioGroup rgGender;
    private RadioButton rbMale;
    private RadioButton rbFemale;
    private Spinner spInterests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }

    private void initWidgets() {
        btnOK = (Button) findViewById(R.id.btnOK);
        etName = (EditText) findViewById(R.id.etName);
        rgGender = (RadioGroup) findViewById(R.id.rgGender);
        rbMale = (RadioButton) findViewById(R.id.rbMale);
        rbFemale = (RadioButton) findViewById(R.id.rbFemale);
        spInterests = (Spinner) findViewById(R.id.spInterests);
    }

    private void setupListeners() {
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intentGoToSecondActivity();
                //intentWithResult();
                mIntents();
            }
        });
    }

    private void mIntents() {
        Intent intent = new Intent(this, SecondActivity.class);

        getEtName(intent);
        getRgGender(intent);
        getSpInterests(intent);

        startActivity(intent);
    }

    private void getEtName(Intent intent) {
        String name = etName.getText().toString();
        intent.putExtra(PARAMETER_ETNAME, name);
    }

    private void getRgGender(Intent intent) {
        String gender = null;
        switch (rgGender.getCheckedRadioButtonId()) {
            case R.id.rbMale:
                gender = rbMale.getText().toString();
                break;
            case R.id.rbFemale:
                gender = rbFemale.getText().toString();
                break;
        }
        intent.putExtra(PARAMETER_RG_GENDER, gender);
    }

    private void getSpInterests(Intent intent) {
        String interests = spInterests.getSelectedItem().toString();
        intent.putExtra(PARAMETER_SP_INTERESTS, interests);
    }

    /*
    private void intentWithResult() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }
    */

    /*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(MainActivity.this, "OK", Toast.LEN-GTH_SHORT).show();

                if (data != null && data.hasExtra(PARAMETER_SECOND)) {
                    String message = data.getStringExtra(PARAMETER_SECOND);
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, R.string.cancel, Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
    */

    /*
    private void intentGoToSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        String poruka = getString(R.string.probna_poruka);
        intent.putExtra(PARAMETER_SECOND, poruka);
        startActivity(intent);
    }
    */
}
