package com.darklorddevil.pk_job;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class smalleractivity extends AppCompatActivity {
    private TextView smallerinput;
    private Button smallarea;
    private Button smallweight;
    private TextView resultofsmall;
    private float breadthsmall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smalleractivity);
        smallerinput=(EditText)findViewById(R.id.smallinput);
        smallarea=(Button)findViewById(R.id.smallarea);
        smallweight=(Button)findViewById(R.id.smallweight);
        resultofsmall=(TextView) findViewById(R.id.smalloutput);

        smallarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lengthsmall=Integer.parseInt(smallerinput.getText().toString());
                float breadthsmall= (float) 0.670;
                float smallarea=lengthsmall*breadthsmall;
                resultofsmall.setText("Area: "+String.valueOf(smallarea));
            }

        });
        smallweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lengthsmall=Integer.parseInt(smallerinput.getText().toString());
                float breadthsmall= (float) 0.670;
                float smallarea=lengthsmall*breadthsmall;
                float smallweight= (float) (smallarea*0.388);
                resultofsmall.setText("Weight: "+String.valueOf(smallweight));

            }
        });
    }}
