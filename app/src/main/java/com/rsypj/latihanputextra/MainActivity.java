package com.rsypj.latihanputextra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nama;
    EditText email;
    Button btnCek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText)findViewById(R.id.main_activity_etNama);
        email = (EditText)findViewById(R.id.main_activity_etEmail);
        btnCek = (Button)findViewById(R.id.main_activity_btnKirim);

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, PutActivity.class);
                in.putExtra("Name", nama.getText().toString());
                in.putExtra("Email", email.getText().toString());
                startActivity(in);
            }
        });
    }
}
