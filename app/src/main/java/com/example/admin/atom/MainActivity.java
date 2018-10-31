package com.example.admin.atom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioButton r1,r2;
    //EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.radioButton2);
        r2 = findViewById(R.id.radioButton3);
        button = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                RadioGroup grp=(RadioGroup)findViewById(R.id.rg);
                RadioButton answer=(RadioButton)findViewById(grp.getCheckedRadioButtonId());

                if(answer.equals("yes"))
                {


                    Log.d("score", "Your score");
                }
                else {
                    Intent i = new Intent(MainActivity.this, CamActivity.class);
                    startActivity(i);
                }

            }
        });




    }
}
