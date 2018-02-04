package com.example.ryan.studycase;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    Button Abnormal, Eatbus;
    EditText menu, porsi;

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.ryan.studycase.extra.MESSAGE";

    private EditText mMessageEditText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Eatbus = (Button) findViewById(R.id.buttoneatbus);
        Abnormal = (Button) findViewById(R.id.buttonabnormal);
        menu = (EditText) findViewById(R.id.editText_main);
        porsi = (EditText) findViewById(R.id.editText_main2);


        Abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StudyCase2.class);
                String message = Abnormal.getText().toString();
                intent.putExtra("menu", menu.getText().toString());
                intent.putExtra("message", message);
                intent.putExtra("porsi", porsi.getText().toString());
                startActivity(intent);


            }
        });

        Eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, StudyCase2.class);
                String message = Eatbus.getText().toString();
                intent.putExtra("menu", menu.getText().toString());

                intent.putExtra("message", message);
                intent.putExtra("porsi", porsi.getText().toString());
                startActivity(intent);
            }
        });

    }
}


