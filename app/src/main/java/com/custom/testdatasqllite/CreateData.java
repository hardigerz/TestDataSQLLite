package com.custom.testdatasqllite;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class CreateData extends Activity implements View.OnClickListener  {


    private Button buttonSubmit;
    private EditText edNama;
    private EditText eQty;
    private EditText eDate;
    private EditText edHarga;

    private DBDataSource dataSource;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_data);
        buttonSubmit = (Button) findViewById(R.id.buttom_submit);
        buttonSubmit.setOnClickListener(this);
        edNama = (EditText) findViewById(R.id.editnama);
        edHarga = (EditText) findViewById(R.id.editharga);
        eQty = (EditText) findViewById(R.id.editqty);
        eDate = (EditText) findViewById(R.id.editexp);

    }


    @Override
    public void onClick(View view) {

    }
}
