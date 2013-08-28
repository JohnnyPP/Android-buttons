package com.example.buttons;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

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
    
    public void buttonClick(View v)
    {
    	CharSequence temp;
    	TextView textView = (TextView)findViewById(R.id.textView); //textView is the ID added to the Hello World! string
    	TextView tw = (TextView)findViewById(R.id.textView1);
    	EditText editText = (EditText) findViewById(R.id.editText1);
    	
    	String message = editText.getText().toString();
    	
    	//temp=tw.getText();
    	tw.setText(message + "94584");
    	textView.setText(message);
    }
}
