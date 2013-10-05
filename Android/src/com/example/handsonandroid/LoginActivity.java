package com.example.handsonandroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/**
 * 
 * @author Garrett
 *
 * The activity that shows the Log-in Screen, and uses the webservices to login as well.
 */
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
			Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
			startActivity(i);
			break;
		case R.id.login_button:
			EditText userName = (EditText) findViewById(R.id.editText1);
			EditText userPass = (EditText) findViewById(R.id.editText2);
			
			WebMethods web = new WebMethods(this);
			WebMethods.login(userName.getText().toString(), userPass.getText().toString());
			break;
		}
		
	}
	
	/**
	 * OnStart, registers all the buttons listeners as this activity
	 */
	@Override
	public void onStart(){
		super.onStart();
		this.findViewById(R.id.register_from_login_button).setOnClickListener(this);
		this.findViewById(R.id.login_button).setOnClickListener(this);
	}

}
