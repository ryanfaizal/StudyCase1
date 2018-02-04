package com.example.ryan.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class StudyCase2 extends AppCompatActivity {

    int jumlah_uang = 65000; int ongkos, total, hargaTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_case2);
        TextView Makanan = (TextView)findViewById(R.id.nama_menu);
        TextView jumlah = (TextView)findViewById(R.id.jumlah_porsi);
        TextView tempat = (TextView)findViewById(R.id.tempat);
        TextView hasil = (TextView)findViewById(R.id.total_harga);


        Intent i = getIntent();

        String menu = i.getStringExtra("menu");
        String message = i.getStringExtra("message");
        String porsi = i.getStringExtra("porsi");

        Makanan.setText(menu);
        jumlah.setText(porsi);
        tempat.setText(message);

        switch (message){
            case "EATBUS":
                ongkos = 50000;
                break;
            case "ABNORMAL":
                ongkos = 30000;
                break;
        }
        total = parseInt(porsi) * ongkos;
        String hargaTotal = Integer.toString(total);
        if(jumlah_uang < total){
            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Jangan disini makan malaanya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
        }else{
            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Disini Aja makan malamnya", Toast.LENGTH_SHORT).show();
        }
    }
}
