package com.darklorddevil.pk_job;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.channels.InterruptedByTimeoutException;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.largerwidth);
        btn2=findViewById(R.id.smallerwidth);

        btn1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent inten1 = new Intent(MainActivity.this,largeractivity.class);
            startActivity(inten1);
        }
                                }
        );
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent inten1 = new Intent(MainActivity.this,smalleractivity.class);
                startActivity(inten1); }
        }
        );
    }
}
