package com.example.chanaka.gpa_cal;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Hdbis extends Activity implements AdapterView.OnItemSelectedListener {

    Double grp=0.0,grp1=0.0,grp2=0.0,grp3=0.0,grp4=0.0,grp5=0.0,grp6=0.0,
            grp7=0.0,grp8=0.0,grp9=0.0,grp10=0.0,grp11=0.0,grp12=0.0,grp13=0.0,grp14=0.0,
            crd1=0.0, crd2=0.0, crd3=0.0, crd4=0.0, crd5=0.0, crd6=0.0, crd7=0.0, crd8=0.0, crd9=0.0, crd10=0.0, crd11=0.0, crd12=0.0,
            crd13=0.0, crd14=0.0,mul=0.0,gpa=0.0,multot,crdtot;

    String intro1, intro2, intro3, intro4, intro5, intro6, intro7, intro8, intro9, intro10, intro11, intro12, intro13,intro14;
    Double grparr[]=new Double[14];
    Double crdarr[]=new Double[14];
    EditText e1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hdbis);

        Spinner spiner15 = (Spinner) findViewById(R.id.spin_bmp);
        ArrayAdapter<CharSequence> adapter15 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner15.setAdapter(adapter15);
        spiner15.setOnItemSelectedListener(this);

        Spinner spiner16 = (Spinner) findViewById(R.id.spin_bdsa);
        ArrayAdapter<CharSequence> adapter16 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner16.setAdapter(adapter16);
        spiner16.setOnItemSelectedListener(this);

        Spinner spiner17 = (Spinner) findViewById(R.id.spin_bse);
        ArrayAdapter<CharSequence> adapter17 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner17.setAdapter(adapter16);
        spiner17.setOnItemSelectedListener(this);

        Spinner spiner18 = (Spinner) findViewById(R.id.spin_bss);
        ArrayAdapter<CharSequence> adapter18 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner18.setAdapter(adapter18);
        spiner18.setOnItemSelectedListener(this);

        Spinner spiner19 = (Spinner) findViewById(R.id.spin_bad);
        ArrayAdapter<CharSequence> adapter19 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter19.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner19.setAdapter(adapter19);
        spiner19.setOnItemSelectedListener(this);

        Spinner spiner20 = (Spinner) findViewById(R.id.spin_bca);
        ArrayAdapter<CharSequence> adapter20 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner20.setAdapter(adapter20);
        spiner20.setOnItemSelectedListener(this);

        Spinner spiner21 = (Spinner) findViewById(R.id.spin_bea);
        ArrayAdapter<CharSequence> adapter21 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter21.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner21.setAdapter(adapter21);
        spiner21.setOnItemSelectedListener(this);

        Spinner spiner22 = (Spinner) findViewById(R.id.spin_bsq);
        ArrayAdapter<CharSequence> adapter22 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner22.setAdapter(adapter22);
        spiner22.setOnItemSelectedListener(this);

        Spinner spiner23 = (Spinner) findViewById(R.id.spin_bdw);
        ArrayAdapter<CharSequence> adapter23 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter23.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner23.setAdapter(adapter23);
        spiner23.setOnItemSelectedListener(this);

        Spinner spiner24 = (Spinner) findViewById(R.id.spin_bma);
        ArrayAdapter<CharSequence> adapter24 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter24.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner24.setAdapter(adapter24);
        spiner24.setOnItemSelectedListener(this);

        Spinner spiner25 = (Spinner) findViewById(R.id.spin_bs);
        ArrayAdapter<CharSequence> adapter25 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter25.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner25.setAdapter(adapter25);
        spiner25.setOnItemSelectedListener(this);

        Spinner spiner26 = (Spinner) findViewById(R.id.spin_bor);
        ArrayAdapter<CharSequence> adapter26 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter26.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner26.setAdapter(adapter26);
        spiner26.setOnItemSelectedListener(this);

        Spinner spiner27 = (Spinner) findViewById(R.id.spin_bsp);
        ArrayAdapter<CharSequence> adapter27 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter27.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner27.setAdapter(adapter27);
        spiner27.setOnItemSelectedListener(this);

        Spinner spiner28 = (Spinner) findViewById(R.id.spin_bit);
        ArrayAdapter<CharSequence> adapter28 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        adapter28.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner28.setAdapter(adapter28);
        spiner28.setOnItemSelectedListener(this);
    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {

        ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);

        Spinner spinner15 = (Spinner)parent;
        Spinner spinner16 = (Spinner)parent;
        Spinner spinner17 = (Spinner)parent;
        Spinner spinner18 = (Spinner)parent;
        Spinner spinner19 = (Spinner)parent;
        Spinner spinner20 = (Spinner)parent;
        Spinner spinner21 = (Spinner)parent;
        Spinner spinner22 = (Spinner)parent;
        Spinner spinner23 = (Spinner)parent;
        Spinner spinner24 = (Spinner)parent;
        Spinner spinner25 = (Spinner)parent;
        Spinner spinner26 = (Spinner)parent;
        Spinner spinner27 = (Spinner)parent;
        Spinner spinner28 = (Spinner)parent;

        if(spinner15.getId()==R.id.spin_bmp) {

            intro1 = parent.getItemAtPosition(position).toString();
            if (intro1.equals("")) {
                crd1 = 0.0;
                grp1 = 0.0;
            } else {
                crd1 = 2.0;
                grp1 = gredpoint(grp);
            }
        }
        if (spinner16.getId() == R.id.spin_bdsa) {

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
        if (spinner17.getId() == R.id.spin_bea) {

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

        if (spinner18.getId() == R.id.spin_bss) {

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
        if (spinner19.getId() == R.id.spin_bad) {

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
        if (spinner20.getId() == R.id.spin_bca) {

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
        if (spinner21.getId() == R.id.spin_bea) {

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
        if (spinner22.getId() == R.id.spin_bsq) {

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
        if (spinner23.getId() == R.id.spin_bdw) {

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
        if (spinner24.getId() == R.id.spin_bma) {

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
        if (spinner25.getId() == R.id.spin_bs) {

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
        if (spinner26.getId() == R.id.spin_bor) {

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
        if (spinner27.getId() == R.id.spin_bsp) {

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
        if (spinner28.getId() == R.id.spin_bit) {

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
    public void onNothingSelected(AdapterView<?> adapterView){

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

    public void calbisresult (View v) {

        if (v.getId() == R.id.btn_bcal) {
            // grade point /
            grparr[0] = grp1;
            grparr[1] = grp2;
            grparr[2] = grp3;
            grparr[3] = grp4;
            grparr[4] = grp5;
            grparr[5] = grp6;
            grparr[6] = grp7;
            grparr[7] = grp8;
            grparr[8] = grp9;
            grparr[9] = grp10;
            grparr[10] = grp11;
            grparr[11] = grp12;
            grparr[12] = grp13;
            grparr[13] = grp14;

            // number of credits /
            crdarr[0] = crd1;
            crdarr[1] = crd2;
            crdarr[2] = crd3;
            crdarr[3] = crd4;
            crdarr[4] = crd5;
            crdarr[5] = crd6;
            crdarr[6] = crd7;
            crdarr[7] = crd8;
            crdarr[8] = crd9;
            crdarr[9] = crd10;
            crdarr[10] = crd11;
            crdarr[11] = crd12;
            crdarr[12] = crd13;
            crdarr[13] = crd14;

            multot = 0.0;
            crdtot = 0.0;

            for (int i = 0; i <= 13; i++) {

                multot = multot + multi(grparr[i], crdarr[i]);
                crdtot = crdtot + crdarr[i];
                gpa = multot / crdtot;
            }

            e1 = (EditText) findViewById(R.id.btext);
            e1.setText(String.format("%.2f", gpa));
        }
    }
}