package com.example.chanaka.gpa_cal;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Double grp=0.0,grp1=0.0,grp2=0.0,grp3=0.0,grp4=0.0,grp5=0.0,grp6=0.0,
            grp7=0.0,grp8=0.0,grp9=0.0,grp10=0.0,grp11=0.0,grp12=0.0,grp13=0.0,grp14=0.0,
            crd1=0.0, crd2=0.0, crd3=0.0, crd4=0.0, crd5=0.0, crd6=0.0, crd7=0.0, crd8=0.0, crd9=0.0, crd10=0.0, crd11=0.0, crd12=0.0,
            crd13=0.0, crd14=0.0,mul=0.0,gpa=0.0,multot,crdtot;

    String intro1, intro2, intro3, intro4, intro5, intro6, intro7, intro8, intro9, intro10, intro11, intro12, intro13,intro14;
    Double grparr[]=new Double[14];
    Double crdarr[]=new Double[14];
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hdse);

        Spinner spiner1 = (Spinner) findViewById(R.id.spin_mp);
        ArrayAdapter<CharSequence>adapter1=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner1.setAdapter(adapter1);
        spiner1.setOnItemSelectedListener(this);

        Spinner spiner2 = (Spinner) findViewById(R.id.spin_dsa);
        ArrayAdapter<CharSequence>adapter2=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner2.setAdapter(adapter2);
        spiner2.setOnItemSelectedListener(this);

        Spinner spiner3 = (Spinner) findViewById(R.id.spin_ead);
        ArrayAdapter<CharSequence>adapter3=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner3.setAdapter(adapter3);
        spiner3.setOnItemSelectedListener(this);

        Spinner spiner4 = (Spinner) findViewById(R.id.spin_ss);
        ArrayAdapter<CharSequence>adapter4=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner4.setAdapter(adapter4);
        spiner4.setOnItemSelectedListener(this);

        Spinner spiner5 = (Spinner) findViewById(R.id.spin_adm);
        ArrayAdapter<CharSequence>adapter5=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner5.setAdapter(adapter5);
        spiner5.setOnItemSelectedListener(this);

        Spinner spiner6 = (Spinner) findViewById(R.id.spin_ca);
        ArrayAdapter<CharSequence>adapter6=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner6.setAdapter(adapter6);
        spiner6.setOnItemSelectedListener(this);

        Spinner spiner7 = (Spinner) findViewById(R.id.spin_ea);
        ArrayAdapter<CharSequence>adapter7=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner7.setAdapter(adapter7);
        spiner7.setOnItemSelectedListener(this);

        Spinner spiner8 = (Spinner) findViewById(R.id.spin_dip);
        ArrayAdapter<CharSequence>adapter8=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner8.setAdapter(adapter8);
        spiner8.setOnItemSelectedListener(this);

        Spinner spiner9 = (Spinner) findViewById(R.id.spin_dw);
        ArrayAdapter<CharSequence>adapter9=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner9.setAdapter(adapter9);
        spiner9.setOnItemSelectedListener(this);

        Spinner spiner10 = (Spinner) findViewById(R.id.spin_mad);
        ArrayAdapter<CharSequence>adapter10=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner10.setAdapter(adapter10);
        spiner10.setOnItemSelectedListener(this);

        Spinner spiner11 = (Spinner) findViewById(R.id.spin_bs);
        ArrayAdapter<CharSequence>adapter11=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner11.setAdapter(adapter11);
        spiner11.setOnItemSelectedListener(this);

        Spinner spiner12 = (Spinner) findViewById(R.id.spin_ra);
        ArrayAdapter<CharSequence>adapter12=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner12.setAdapter(adapter12);
        spiner12.setOnItemSelectedListener(this);

        Spinner spiner13 = (Spinner) findViewById(R.id.spin_is);
        ArrayAdapter<CharSequence>adapter13=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner13.setAdapter(adapter13);
        spiner13.setOnItemSelectedListener(this);

        Spinner spiner14 = (Spinner) findViewById(R.id.spin_it);
        ArrayAdapter<CharSequence>adapter14=ArrayAdapter.createFromResource(this,R.array.credit,android.R.layout.simple_spinner_item);
        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner14.setAdapter(adapter14);
        spiner14.setOnItemSelectedListener(this);

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {

        ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);

        Spinner spinner1 = (Spinner) parent;
        Spinner spinner2 = (Spinner) parent;
        Spinner spinner3 = (Spinner) parent;
        Spinner spinner4 = (Spinner) parent;
        Spinner spinner5 = (Spinner) parent;
        Spinner spinner6 = (Spinner) parent;
        Spinner spinner7 = (Spinner) parent;
        Spinner spinner8 = (Spinner) parent;
        Spinner spinner9 = (Spinner) parent;
        Spinner spinner10 = (Spinner) parent;
        Spinner spinner11 = (Spinner) parent;
        Spinner spinner12 = (Spinner) parent;
        Spinner spinner13 = (Spinner) parent;
        Spinner spinner14 = (Spinner) parent;

        if (spinner1.getId() == R.id.spin_mp) {

            intro1 = parent.getItemAtPosition(position).toString();

            if (intro1.equals("")) {
                crd1 = 0.0;
                grp1=0.0;
            } else {
                crd1 = 2.0;
                grp1 = gredpoint(grp);
            }
        }
        if (spinner2.getId() == R.id.spin_dsa) {

            intro2 = parent.getItemAtPosition(position).toString();

                if(intro2.equals("")){
                    crd2=0.0;
                    grp2=0.0;
                }
                else {
                    crd2 = 3.0;
                    grp2 = gredpoint(grp);
                }
        }
            if (spinner3.getId() == R.id.spin_ead) {

                intro3 = parent.getItemAtPosition(position).toString();
                if(intro3.equals("")){
                    crd3=0.0;
                    grp3=0.0;
                }
                else {
                    crd3 = 3.0;
                    grp3 = gredpoint(grp);
                }
            }

            if (spinner4.getId() == R.id.spin_ss) {

                intro4 = parent.getItemAtPosition(position).toString();
                if(intro4.equals("")){
                    crd4=0.0;
                    grp4=0.0;
                }
                else {
                    crd4 = 3.0;
                    grp4 = gredpoint(grp);

                }
            }
            if (spinner5.getId() == R.id.spin_adm) {

                intro5 = parent.getItemAtPosition(position).toString();
                if(intro5.equals("")){
                    crd5=0.0;
                    grp5=0.0;
                }
                else {
                    crd5 = 3.0;
                    grp5 = gredpoint(grp);

                }
            }
            if (spinner6.getId() == R.id.spin_ca) {

                intro6 = parent.getItemAtPosition(position).toString();
                if(intro6.equals("")){
                    crd6=0.0;
                    grp6=0.0;
                }
                else {
                    crd6 = 3.0;
                    grp6 = gredpoint(grp);

                }
            }
            if (spinner7.getId() == R.id.spin_ea) {

                intro7 = parent.getItemAtPosition(position).toString();
                if(intro7.equals("")){
                    crd7=0.0;
                    grp7=0.0;
                }
                else {
                    crd7 = 3.0;
                    grp7 = gredpoint(grp);

                }
            }
            if (spinner8.getId() == R.id.spin_dip) {

                intro8 = parent.getItemAtPosition(position).toString();
                if(intro8.equals("")){
                    crd8=0.0;
                    grp8=0.0;
                }
                else {
                    crd8 = 3.0;
                    grp8 = gredpoint(grp);

                }
            }
            if (spinner9.getId() == R.id.spin_dw) {

                intro9 = parent.getItemAtPosition(position).toString();
                if(intro9.equals("")){
                    crd9=0.0;
                    grp9=0.0;
                }
                else {
                    crd9 = 3.0;
                    grp9 = gredpoint(grp);
                }
            }
            if (spinner10.getId() == R.id.spin_mad) {

                intro10 = parent.getItemAtPosition(position).toString();
               if(intro10.equals("")){
                   crd10=0.0;
                   grp10=0.0;
               }
                else {
                   crd10 = 3.0;
                   grp10 = gredpoint(grp);

               }
            }
            if (spinner11.getId() == R.id.spin_bs) {

                intro11 = parent.getItemAtPosition(position).toString();
                if(intro11.equals("")){
                    crd11=0.0;
                    grp11=0.0;
                }
                else {
                    crd11 = 3.0;
                    grp11 = gredpoint(grp);

                }
            }
            if (spinner12.getId() == R.id.spin_ra) {

                intro12 = parent.getItemAtPosition(position).toString();
                if(intro12.equals("")){
                    crd12=0.0;
                    grp12=0.0;
                }
                else {
                    crd12 = 3.0;
                    grp12 = gredpoint(grp);

                }
            }
            if (spinner13.getId() == R.id.spin_is) {

                intro13 = parent.getItemAtPosition(position).toString();
                if(intro13.equals("")){
                    crd13=0.0;
                    grp13=0.0;
                }
                else {
                    crd13 = 5.0;
                    grp13 = gredpoint(grp);
                }
            }
            if (spinner14.getId() == R.id.spin_it) {

                intro14 = parent.getItemAtPosition(position).toString();
                if(intro14.equals("")){
                    crd14=0.0;
                    grp14=0.0;
                }
                else {
                    crd14 = 5.0;
                    grp14 = gredpoint(grp);
                }
            }
        }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void gpacalculate (View v) {

        if (v.getId() == R.id.btn_cal) {

            // grade point /
            grparr[0]=grp1;
            grparr[1]=grp2;
            grparr[2]=grp3;
            grparr[3]=grp4;
            grparr[4]=grp5;
            grparr[5]=grp6;
            grparr[6]=grp7;
            grparr[7]=grp8;
            grparr[8]=grp9;
            grparr[9]=grp10;
            grparr[10]=grp11;
            grparr[11]=grp12;
            grparr[12]=grp13;
            grparr[13]=grp14;

            // number of credits /
            crdarr[0]=crd1;
            crdarr[1]=crd2;
            crdarr[2]=crd3;
            crdarr[3]=crd4;
            crdarr[4]=crd5;
            crdarr[5]=crd6;
            crdarr[6]=crd7;
            crdarr[7]=crd8;
            crdarr[8]=crd9;
            crdarr[9]=crd10;
            crdarr[10]=crd11;
            crdarr[11]=crd12;
            crdarr[12]=crd13;
            crdarr[13]=crd14;

            multot=0.0;
            crdtot=0.0;

            for(int i=0 ; i<=13 ; i++){

                multot=multot+multi(grparr[i],crdarr[i]);
                crdtot=crdtot+crdarr[i];
                gpa=multot/crdtot;
            }

            e1 = (EditText) findViewById(R.id.txt);
            e1.setText(String.format("%.2f",gpa));
        }

    }

    public double gredpoint (double grp){

        if(intro1.equals("A+")){

            grp= 4.0;
        }
        if(intro1.equals("A")){

            grp=4.0;
        }
        if(intro1.equals("A-")){

            grp=3.7;
        }
        if(intro1.equals("B+")){

            grp=3.3;
        }
        if(intro1.equals("B")){

            grp=3.0;
        }
        if(intro1.equals("B-")){

            grp=2.7;
        }
        if(intro1.equals("C+")){

            grp=2.3;
        }
        if(intro1.equals("C")){

            grp=2.0;
        }
        if(intro1.equals("C-")){

            grp=1.7;
        }
        if(intro1.equals("D+")){

            grp=1.3;
        }
        if(intro1.equals("D")){

            grp=1.0;
        }
        if(intro1.equals("E")){

            grp=0.0;
        }
        // intro 2
        if(intro2.equals("A+")){

            grp= 4.0;
        }

        if(intro2.equals("A")){

            grp=4.0;
        }
        if(intro2.equals("A-")){

            grp=3.7;
        }
        if(intro2.equals("B+")){

            grp=3.3;
        }
        if(intro2.equals("B")){

            grp=3.0;
        }
        if(intro2.equals("B-")){

            grp=2.7;
        }
        if(intro2.equals("C+")){

            grp=2.3;
        }
        if(intro2.equals("C")){

            grp=2.0;
        }
        if(intro2.equals("C-")){

            grp=1.7;
        }
        if(intro2.equals("D+")){

            grp=1.3;
        }
        if(intro2.equals("D")){

            grp=1.0;
        }
        if(intro2.equals("E")){

            grp=0.0;
        }

        //intro3
        if(intro3.equals("A+")){

            grp= 4.0;
        }
        if(intro3.equals("A")){

            grp=4.0;
        }
        if(intro3.equals("A-")){

            grp=3.7;
        }
        if(intro3.equals("B+")){

            grp=3.3;
        }
        if(intro3.equals("B")){

            grp=3.0;
        }
        if(intro3.equals("B-")){

            grp=2.7;
        }
        if(intro3.equals("C+")){

            grp=2.3;
        }
        if(intro3.equals("C")){

            grp=2.0;
        }
        if(intro3.equals("C-")){

            grp=1.7;
        }
        if(intro3.equals("D+")){

            grp=1.3;
        }
        if(intro3.equals("D")){

            grp=1.0;
        }
        if(intro3.equals("E")){

            grp=0.0;
        }
        // intro 4
        if(intro4.equals("A+")){

            grp= 4.0;
        }
        if(intro4.equals("A")){

            grp=4.0;
        }
        if(intro4.equals("A-")){

            grp=3.7;
        }
        if(intro4.equals("B+")){

            grp=3.3;
        }
        if(intro4.equals("B")){

            grp=3.0;
        }
        if(intro4.equals("B-")){

            grp=2.7;
        }
        if(intro4.equals("C+")){

            grp=2.3;
        }
        if(intro4.equals("C")){

            grp=2.0;
        }
        if(intro4.equals("C-")){

            grp=1.7;
        }
        if(intro4.equals("D+")){

            grp=1.3;
        }
        if(intro4.equals("D")){

            grp=1.0;
        }
        if(intro4.equals("E")){

            grp=0.0;
        }

        // intro 5
        if(intro5.equals("A+")){

            grp= 4.0;
        }
        if(intro5.equals("A")){

            grp=4.0;
        }
        if(intro5.equals("A-")){

            grp=3.7;
        }
        if(intro5.equals("B+")){

            grp=3.3;
        }
        if(intro5.equals("B")){

            grp=3.0;
        }
        if(intro5.equals("B-")){

            grp=2.7;
        }
        if(intro5.equals("C+")){

            grp=2.3;
        }
        if(intro5.equals("C")){

            grp=2.0;
        }
        if(intro5.equals("C-")){

            grp=1.7;
        }
        if(intro5.equals("D+")){

            grp=1.3;
        }
        if(intro5.equals("D")){

            grp=1.0;
        }
        if(intro5.equals("E")){

            grp=0.0;
        }

        //intro 6
        if(intro6.equals("A+")){

            grp= 4.0;
        }
        if(intro6.equals("A")){

            grp=4.0;
        }
        if(intro6.equals("A-")){

            grp=3.7;
        }
        if(intro6.equals("B+")){

            grp=3.3;
        }
        if(intro6.equals("B")){

            grp=3.0;
        }
        if(intro6.equals("B-")){

            grp=2.7;
        }
        if(intro6.equals("C+")){

            grp=2.3;
        }
        if(intro6.equals("C")){

            grp=2.0;
        }
        if(intro6.equals("C-")){

            grp=1.7;
        }
        if(intro6.equals("D+")){

            grp=1.3;
        }
        if(intro6.equals("D")){

            grp=1.0;
        }
        if(intro6.equals("E")){

            grp=0.0;
        }
        // intro 7
        if(intro7.equals("A+")){

            grp= 4.0;
        }
        if(intro7.equals("A")){

            grp=4.0;
        }
        if(intro7.equals("A-")){

            grp=3.7;
        }
        if(intro7.equals("B+")){

            grp=3.3;
        }
        if(intro7.equals("B")){

            grp=3.0;
        }
        if(intro7.equals("B-")){

            grp=2.7;
        }
        if(intro7.equals("C+")){

            grp=2.3;
        }
        if(intro7.equals("C")){

            grp=2.0;
        }
        if(intro7.equals("C-")){

            grp=1.7;
        }
        if(intro7.equals("D+")){

            grp=1.3;
        }
        if(intro7.equals("D")){

            grp=1.0;
        }
        if(intro7.equals("E")){

            grp=0.0;
        }

        //intro 8
        if(intro8.equals("A+")){

            grp= 4.0;
        }

        if(intro8.equals("A")){

            grp=4.0;
        }
        if(intro8.equals("A-")){

            grp=3.7;
        }
        if(intro8.equals("B+")){

            grp=3.3;
        }
        if(intro8.equals("B")){

            grp=3.0;
        }
        if(intro8.equals("B-")){

            grp=2.7;
        }
        if(intro8.equals("C+")){

            grp=2.3;
        }
        if(intro8.equals("C")){

            grp=2.0;
        }
        if(intro8.equals("C-")){

            grp=1.7;
        }
        if(intro8.equals("D+")){

            grp=1.3;
        }
        if(intro8.equals("D")){

            grp=1.0;
        }
        if(intro8.equals("E")){

            grp=0.0;
        }
        //intro 9
        if(intro9.equals("A")){

            grp=4.0;
        }
        if(intro9.equals("A-")){

            grp=3.7;
        }
        if(intro9.equals("B+")){

            grp=3.3;
        }
        if(intro9.equals("B")){

            grp=3.0;
        }
        if(intro9.equals("B-")){

            grp=2.7;
        }
        if(intro9.equals("C+")){

            grp=2.3;
        }
        if(intro9.equals("C")){

            grp=2.0;
        }
        if(intro9.equals("C-")){

            grp=1.7;
        }
        if(intro9.equals("D+")){

            grp=1.3;
        }
        if(intro9.equals("D")){

            grp=1.0;
        }
        if(intro9.equals("E")){

            grp=0.0;
        }

        // intro 10
        if(intro10.equals("A+")){

            grp= 4.0;
        }

        if(intro10.equals("A")){

            grp=4.0;
        }
        if(intro10.equals("A-")){

            grp=3.7;
        }
        if(intro10.equals("B+")){

            grp=3.3;
        }
        if(intro10.equals("B")){

            grp=3.0;
        }
        if(intro10.equals("B-")){

            grp=2.7;
        }
        if(intro10.equals("C+")){

            grp=2.3;
        }
        if(intro10.equals("C")){

            grp=2.0;
        }
        if(intro10.equals("C-")){

            grp=1.7;
        }
        if(intro10.equals("D+")){

            grp=1.3;
        }
        if(intro10.equals("D")){

            grp=1.0;
        }
        if(intro10.equals("E")){

            grp=0.0;
        }

        //intro 11
        if(intro11.equals("A+")){

            grp= 4.0;
        }
        if(intro11.equals("A")){

            grp=4.0;
        }
        if(intro11.equals("A-")){

            grp=3.7;
        }
        if(intro11.equals("B+")){

            grp=3.3;
        }
        if(intro11.equals("B")){

            grp=3.0;
        }
        if(intro11.equals("B-")){

            grp=2.7;
        }
        if(intro11.equals("C+")){

            grp=2.3;
        }
        if(intro11.equals("C")){

            grp=2.0;
        }
        if(intro11.equals("C-")){

            grp=1.7;
        }
        if(intro11.equals("D+")){

            grp=1.3;
        }
        if(intro11.equals("D")){

            grp=1.0;
        }
        if(intro11.equals("E")){

            grp=0.0;
        }

        //intro 12
        if(intro12.equals("A+")){

            grp= 4.0;
        }
        if(intro12.equals("A")){

            grp=4.0;
        }
        if(intro12.equals("A-")){

            grp=3.7;
        }
        if(intro12.equals("B+")){

            grp=3.3;
        }
        if(intro12.equals("B")){

            grp=3.0;
        }
        if(intro12.equals("B-")){

            grp=2.7;
        }
        if(intro12.equals("C+")){

            grp=2.3;
        }
        if(intro12.equals("C")){

            grp=2.0;
        }
        if(intro12.equals("C-")){

            grp=1.7;
        }
        if(intro12.equals("D+")){

            grp=1.3;
        }
        if(intro12.equals("D")){

            grp=1.0;
        }
        if(intro12.equals("E")){

            grp=0.0;
        }

        //intro 13
        if(intro13.equals("A+")){

            grp= 4.0;
        }

        if(intro13.equals("A")){

            grp=4.0;
        }
        if(intro13.equals("A-")){

            grp=3.7;
        }
        if(intro13.equals("B+")){

            grp=3.3;
        }
        if(intro13.equals("B")){

            grp=3.0;
        }
        if(intro13.equals("B-")){

            grp=2.7;
        }
        if(intro13.equals("C+")){

            grp=2.3;
        }
        if(intro13.equals("C")){

            grp=2.0;
        }
        if(intro13.equals("C-")){

            grp=1.7;
        }
        if(intro13.equals("D+")){

            grp=1.3;
        }
        if(intro13.equals("D")){

            grp=1.0;
        }
        if(intro13.equals("E")){

            grp=0.0;
        }

        // intro 14
        if(intro14.equals("A+")){

            grp= 4.0;
        }

        if(intro14.equals("A")){

            grp=4.0;
        }
        if(intro14.equals("A-")){

            grp=3.7;
        }
        if(intro14.equals("B+")){

            grp=3.3;
        }
        if(intro14.equals("B")){

            grp=3.0;
        }
        if(intro14.equals("B-")){

            grp=2.7;
        }
        if(intro14.equals("C+")){

            grp=2.3;
        }
        if(intro14.equals("C")){

            grp=2.0;
        }
        if(intro14.equals("C-")){

            grp=1.7;
        }
        if(intro14.equals("D+")){

            grp=1.3;
        }
        if(intro14.equals("D")){

            grp=1.0;
        }
        if(intro14.equals("E")){

            grp=0.0;
        }
        return grp;
    }
    public double multi(double c ,double g){

        mul=c*g;
        return mul;
    }

}
