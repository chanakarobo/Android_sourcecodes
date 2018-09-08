package com.example.chanaka.gpa_cal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_window);
    }

    public void clickhndse(View v){

        if(v.getId()==R.id.btnhndse){

            Intent i= new Intent (Login.this,MainActivity.class);
            startActivity(i);
        }
    }
    public void clickbis(View v){

        if(v.getId()==R.id.btnbis) {

            Intent i = new Intent(Login.this, Hdbis.class);
            startActivity(i);
        }
    }
    public void clickdcsd(View v){

        if(v.getId()==R.id.btndcsd) {

            Toast pass=Toast.makeText(Login.this,"Under Developing",Toast.LENGTH_SHORT);
            pass.show();
        }
    }
    public void clickdse(View v){

        if(v.getId()==R.id.btnse) {

            Toast pass1=Toast.makeText(Login.this,"Under Developing",Toast.LENGTH_SHORT);
            pass1.show();
        }
    }

}