package com.example.omer3.omerrgrb;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup RG;
    Button btn1;
    Button btn2;
    RadioButton om1;
    RadioButton om2;
    RadioButton om3;
    LinearLayout OO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        om1 = (RadioButton) findViewById(R.id.om1);
        om2 = (RadioButton) findViewById(R.id.om2);
        om3 = (RadioButton) findViewById(R.id.om3);
        OO = (LinearLayout) findViewById(R.id.OO);
        RG = (RadioGroup) findViewById(R.id.RG);
        RG.getCheckedRadioButtonId();

    }

    public void nal1(View view) {


        if (om1.isChecked()) {
            OO.setBackgroundColor(Color.GREEN);
            RG.clearCheck();

        }
        if (om2.isChecked()) {
            OO.setBackgroundColor(Color.BLUE);
            RG.clearCheck();

        }
        if (om3.isChecked()) {
            OO.setBackgroundColor(Color.RED);
            RG.clearCheck();

        }
        if (!om1.isChecked() || !om2.isChecked() || !om3.isChecked()) {
            Toast.makeText(this, "please select one of the marks", Toast.LENGTH_LONG).show();
        }

    }

    public void nal2(View view) {
        if (view.getId() == R.id.btn2 && (om1.isChecked()) || (om2.isChecked()) || (om3.isChecked())) {

            Toast.makeText(this, "please cancel the check", Toast.LENGTH_LONG).show();
        }
        if (view.getId() == R.id.btn2 && (!om1.isChecked()) && (!om2.isChecked()) && (!om3.isChecked())) {


            OO.setBackgroundColor(Color.WHITE);

        }

    }

}




