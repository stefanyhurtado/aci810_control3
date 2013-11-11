package com.example.control3;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class CorreActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_corre);
	
		SharedPreferences sharedPref = getSharedPreferences("preferences",Context.MODE_PRIVATE);
		
		  String name = sharedPref.getString(MainActivity.NAME_VALUE, "not set");
          Boolean swit_value = sharedPref.getBoolean(MainActivity.SWITCH_VALUE, false);
          int radg = sharedPref.getInt(MainActivity.RADIOGROUP_VALUE,0);
          Boolean rButton1 = sharedPref.getBoolean(MainActivity.RADIOBUTTON0_VALUE, false);
          Boolean rButton2 = sharedPref.getBoolean(MainActivity.RADIOBUTTON1_VALUE, false);
          Boolean rButton3 = sharedPref.getBoolean(MainActivity.RADIOBUTTON2_VALUE, false);
          int seekbar = sharedPref.getInt(MainActivity.SEEKBAR_VALUE,0);  

          TextView name = (TextView)findViewById (R.id.texView2);
          name.setText(name);
          
          Switch swit = (Switch)findViewById(R.id.switch2);
          swit.setChecked(swit_value);
          
          RadioGroup radg = (RadioGroup)findViewById(R.id.radioGroup2);
          radg = check (RadioGroup);
          RadioButton rbut0 = (RadioButton)findViewById(R.id.radio10);
          rbut0 = setChecked(rButton1);
          RadioButton rbut1 = (RadioButton)findViewById(R.id.radio20);
          rbut1 = setChecked(rButton2);
          RadioButton rbut2 = (RadioButton)findViewById(R.id.radio30);
          rbut2 = setChecked(rButton3);
          SeekBar seekb = (SeekBar)findViewById(R.id.seekBar2);
          seekb= setProgress(SeekBar); 

	
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
