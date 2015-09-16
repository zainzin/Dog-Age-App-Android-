package com.example.dogage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.scnd);
	    
	    TextView tv = (TextView) findViewById(R.id.textView1);
	    Bundle bun = getIntent().getExtras();
	    
	    int dogAge = bun.getInt("dogAge");
	    
	    tv.setText("Your dog age in human age is " + dogAge * 7);
	  
	}

}
