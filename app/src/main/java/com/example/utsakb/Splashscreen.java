package com.example.utsakb;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Splashscreen extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    /*
   tanggal :12-05-2020
   nim :10117127
   nama :Bayu Satya
   kelas :IF4/AKB
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke main activity
                Intent main=new Intent(Splashscreen.this, MainActivity.class);
                startActivity(main);
                finish();

            }
        },waktu_loading);
    }
}
