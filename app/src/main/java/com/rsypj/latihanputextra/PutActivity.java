package com.rsypj.latihanputextra;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by dhadotid on 17/10/2017.
 */

public class PutActivity extends AppCompatActivity {

    TextView etnama;
    TextView etemail;
    String nama;
    String email;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put);

        nama = getIntent().getStringExtra("Name");
        email = getIntent().getStringExtra("Email");

        etnama = (TextView) findViewById(R.id.put_activity_tvnama);
        etemail = (TextView) findViewById(R.id.put_activity_tvemail);

        etnama.setText(nama);
        etemail.setText(email);
    }
}
