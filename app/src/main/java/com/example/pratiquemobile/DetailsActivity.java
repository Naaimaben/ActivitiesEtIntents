package com.example.pratiquemobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String myName = intent.getStringExtra("Name");
        Integer myHidden = intent.getIntExtra("hiddencopy", -1);
        TextView nameTV =(TextView) findViewById(R.id.output);
        nameTV.setText(myName);

        Button btn1 = (Button) findViewById(R.id.ok);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                setResult(RESULT_OK);
                finish();
            }





        });


    }


}