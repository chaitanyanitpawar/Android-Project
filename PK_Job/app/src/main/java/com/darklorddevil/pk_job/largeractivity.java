package com.darklorddevil.pk_job;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class largeractivity extends AppCompatActivity {
    private TextView largerinput;
    private Button largearea;
    private Button largeweight;
    private TextView resultoflarge;
    private int breadthlarge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.largeractivity);
        largerinput=(EditText)findViewById(R.id.largeinput);
        largearea=(Button)findViewById(R.id.largearea);
        largeweight=(Button)findViewById(R.id.largeweight);
        resultoflarge=(TextView) findViewById(R.id.largeoutput);

        largearea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lengthlarge=Integer.parseInt(largerinput.getText().toString());
                float breadthlarge= (float) 0.995;
                float largearea=lengthlarge*breadthlarge;
                resultoflarge.setText("Area: "+String.valueOf(largearea));
        }

    });
        largeweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lengthlarge=Integer.parseInt(largerinput.getText().toString());
                float breadthlarge=(float)0.995;
                float largearea=lengthlarge*breadthlarge;
                float largeweight= (float) (largearea*0.361);
                resultoflarge.setText("Weight: "+String.valueOf(largeweight));

            }
        });
    }}

