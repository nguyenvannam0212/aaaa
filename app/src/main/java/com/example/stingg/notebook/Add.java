package com.example.stingg.notebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Add extends AppCompatActivity {
    EditText addtieude,addnoidung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        addtieude = (EditText) findViewById(R.id.addtieude);
        addnoidung = (EditText) findViewById(R.id.addnoidung);
        back();
    }
    private void back()
    {
        ImageButton back =(ImageButton) findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add.super.onBackPressed();
            }
        });
    }
}
