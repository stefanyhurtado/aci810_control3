package com.example.control3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

@SuppressLint("NewApi")
public class MainActivity extends Activity {
	
	 public final static String NAME_VALUE = "com.example.control3.NAME_VALUE";
     public final static String SWITCH_VALUE = "com.example.control3.SWITCH_VALUE";
     public final static String RADIOGROUP_VALUE = "com.example.control3.RADIOGROUP_VALUE";
     public final static String RADIOBUTTON0_VALUE = "com.example.control3.RADIOBUTTON0_VALUE";
     public final static String RADIOBUTTON1_VALUE = "com.example.control3.RADIOBUTTON1_VALUE";
     public final static String RADIOBUTTON2_VALUE = "com.example.control3.RADIOBUTTON2_VALUE";
     public final static String SEEKBAR_VALUE = "com.example.control3.SEEKBAR_VALUE";
     


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	   public void onClickNext(View view){
           Intent intent = new Intent(this,CorreActivity.class);
           
           EditText nameEditText = (EditText) findViewById(R.id.editText1);
           String name = nameEditText.getText().toString();
           Switch swit1 = (Switch)findViewById(R.id.switch1);
           boolean swit_value = swit1.isChecked();
           

           
                
           SharedPreferences sharedPref = getSharedPreferences("preferences",Context.MODE_PRIVATE);
           
           SharedPreferences.Editor editor = sharedPref.edit();
           
           editor.putString(NAME_VALUE,name);
           editor.putBoolean(SWITCH_VALUE,swit_value);
          
         
           
           editor.commit();
           startActivity(intent);


           
           
           
   }


}



