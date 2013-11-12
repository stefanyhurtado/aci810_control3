package com.example.control3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;

@SuppressLint("NewApi")
public class CorreActivity extends Activity {
	
	
	 public final static String RADIOGROUP_VALUE = "com.example.control3.RADIOGROUP_VALUE";
     public final static String RADIOBUTTON0_VALUE = "com.example.control3.RADIOBUTTON0_VALUE";
     public final static String RADIOBUTTON1_VALUE = "com.example.control3.RADIOBUTTON1_VALUE";
     public final static String RADIOBUTTON2_VALUE = "com.example.control3.RADIOBUTTON2_VALUE";
     public final static String SEEKBAR_VALUE = "com.example.control3.SEEKBAR_VALUE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_corre);
	
		
		
	}
          
          

	

	@Override
	public boolean onCreateOptionsMenu(Menu m) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.corre, m);
		return true;
	}
	  public void onClickSubmit(View view){
          Intent intent = new Intent(this,SubmitActivity.class);
          
         
          RadioGroup rd= (RadioGroup)findViewById(R.id.radioGroup1);
          int radg =  rd.getCheckedRadioButtonId();
          RadioButton rbt0= (RadioButton)findViewById(R.id.radio10);
          boolean rbutton0 = rbt0.isChecked();
          RadioButton rbt1 = (RadioButton)findViewById(R.id.radio20);
          boolean rbutton1 = rbt1.isChecked();
          RadioButton rbt2 = (RadioButton)findViewById(R.id.radio30);
          boolean rbutton2 = rbt2.isChecked();
          SeekBar seekb = (SeekBar)findViewById(R.id.seekBar1);
          int SeekBar = seekb.getProgress();




          
               
          SharedPreferences sharedPref = getSharedPreferences("preferences",Context.MODE_PRIVATE);
          
          SharedPreferences.Editor editor = sharedPref.edit();
          
         
          editor.putInt(RADIOGROUP_VALUE, radg);
          editor.putBoolean(RADIOBUTTON0_VALUE, rbutton0);
          editor.putBoolean(RADIOBUTTON1_VALUE, rbutton1);
          editor.putBoolean(RADIOBUTTON2_VALUE, rbutton2);
          editor.putInt(SEEKBAR_VALUE, SeekBar);


        
          
          editor.commit();
          startActivity(intent);




          
          
          
  }




}


