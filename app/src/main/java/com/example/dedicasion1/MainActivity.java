package com.example.dedicasion1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText1;
EditText editText2;
EditText gmail;
Button button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gmail = findViewById(R.id.gmailcom);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.btn_click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_SUBJECT, editText1.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, editText2.getText().toString());
                intent.putExtra(Intent.EXTRA_EMAIL,gmail.getText().toString() );
                startActivity(intent);
            }
        });


    }
}