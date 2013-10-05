package com.example.handsonandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class LoginActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public void onClick(View v) {

		switch(v.getId()){
		case R.id.register_from_login_button:
			break;
		case R.id.login_button:
			break;
		}
		
	}
	
	@Override
	public void onStart(){
		super.onStart();
		this.findViewById(R.id.register_from_login_button).setOnClickListener(this);
		this.findViewById(R.id.login_button).setOnClickListener(this);
	}

}
