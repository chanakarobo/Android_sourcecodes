package com.example.chanaka.gpa_cal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread splash=new Thread(){


            public void run(){

                try{
                    sleep(4000);
                    Intent i= new Intent(getApplicationContext(),Login.class);
                    startActivity(i);
                    finish();

                }catch (InterruptedException e){}

            }

        };
        splash.start();
    }
}