package com.example.haspani.myuzarhaspani_1202154133_si3905;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(Splash.this,"M. YUZAR HASPANI - 1202154133",Toast.LENGTH_LONG).show(); //menampilkan isi pesan toast
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class)); //menunjukkan kelas berikutnya setelah splash
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}