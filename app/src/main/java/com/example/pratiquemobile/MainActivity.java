package com.example.pratiquemobile;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static final int APPEL_ACTIV2=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.validate);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText) findViewById(R.id.input);
                String text = myEditText.getText().toString();
                Intent i = new Intent(view.getContext(), DetailsActivity.class);
                i.putExtra("Name", text);
                i.putExtra("Hiddencopy", 55);
                startActivityForResult(i, APPEL_ACTIV2);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_CANCELED) {
            Toast toast = Toast.makeText(getApplicationContext(), "RETURN WITH A CANCEL", Toast.LENGTH_SHORT);
            toast.setMargin(70, 50);
            toast.show();
        } else if (requestCode == APPEL_ACTIV2) {
            TextView nameTV = (TextView) findViewById(R.id.ask_for_name);
            nameTV.setText("LE NOM A ETE ENREGISTRE AVEC SUCCES!");
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "ERROR ERROR !", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}