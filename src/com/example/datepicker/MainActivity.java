package com.example.datepicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends Activity
{
DatePicker dp;
Button b;

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        dp=(DatePicker)findViewById(R.id.datePicker1);
        b=(Button)findViewById(R.id.button1);
        
        b.setOnClickListener(new OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				
//				int day = dp.getDayOfMonth();
//				int month=dp.getMonth();
//				int year= dp.getYear();
				
				String day = String.valueOf(dp.getDayOfMonth());
				String month=String.valueOf(dp.getMonth());
				String year= String.valueOf(dp.getYear());
				
				Toast.makeText(MainActivity.this, "The Current day is " +day +" : " +month+" : "+ year, Toast.LENGTH_LONG).show();
				
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
