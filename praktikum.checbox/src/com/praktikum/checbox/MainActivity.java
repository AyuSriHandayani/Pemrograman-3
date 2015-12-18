package com.praktikum.checbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private CheckBox chkIos, chkAndroid, chkWindows;
	private Button btnDisplay;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    addListenerOnChkIos();
    addListenerOnButton();
    }

public void addListenerOnChkIos(){
	chkIos = (CheckBox) findViewById(R.id.chkIos);
	chkIos.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			if(((CheckBox) v).isChecked())
			Toast.makeText(AndroidCheckboxActivity.this, "Hi, try Android ._.", Toast.LENGTH_LONG).show();
			}
		}	
	}); 
	
}

public void addListenerOnButton(){
	chkIos = (CheckBox) findViewById(R.id.chkIos);
	
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
