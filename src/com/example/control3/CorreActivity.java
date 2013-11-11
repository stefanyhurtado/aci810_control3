package com.example.control3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

@SuppressLint("NewApi")
public class CorreActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_corre);
	
		SharedPreferences sharedPref = getSharedPreferences("preferences",Context.MODE_PRIVATE);
		
		  String name = sharedPref.getString(MainActivity.NAME_VALUE, "not set");
          Boolean swit_value = sharedPref.getBoolean(MainActivity.SWITCH_VALUE, false);
          Boolean rButton1 = sharedPref.getBoolean(MainActivity.RADIOBUTTON0_VALUE, false);
          Boolean rButton2 = sharedPref.getBoolean(MainActivity.RADIOBUTTON1_VALUE, false);
          Boolean rButton3 = sharedPref.getBoolean(MainActivity.RADIOBUTTON2_VALUE, false);
          int SeekBar = sharedPref.getInt(MainActivity.SEEKBAR_VALUE,0);  

          TextView name1 = (TextView)findViewById (R.id.textView1);
          name1.setText(name);
          Switch swit1 = (Switch)findViewById(R.id.switch2);
          swit1.setChecked(swit_value);
          RadioButton rButs = (RadioButton)findViewById(R.id.radio10);
          rButs.setChecked(rButton1);
          RadioButton rButs1 = (RadioButton)findViewById(R.id.radio20);
          rButs1.setChecked(rButton2);
          RadioButton rButs2 = (RadioButton)findViewById(R.id.radio30);
          rButs2.setChecked(rButton3);
          SeekBar seekb = (SeekBar)findViewById(R.id.seekBar2);
          seekb.setProgress(SeekBar);

	
          setupActionBar();
          
          
          
    }


    private void setupActionBar() {


            getActionBar().setDisplayHomeAsUpEnabled(true);


    }

	

	@Override
	public boolean onCreateOptionsMenu(Menu m) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.corre, m);
		return true;
	}

}
