package com.example.provaemptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName2);
        Log.d("msg", "VALORE " + getResources().getDisplayMetrics());;
        Log.d("msg", "VALORE " + editText.getText());
        Button button = (Button) findViewById(R.id.button);
        if (button != null && editText != null) {
            button.getLayoutParams().height=450;
            button.getLayoutParams().width=500;
            button.setTextColor(Color.BLUE);
            button.setBackgroundColor(Color.GREEN);
            button.setText("CLICK ME");
            button.setTextSize(25f);
            button.setOnClickListener(l -> {
                editText.setText("Cliccato qui");
            });
        }
    }
   @Override
    public boolean onCreateOptionsMenu(Menu menu){
       // getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
}