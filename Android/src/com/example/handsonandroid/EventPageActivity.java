package com.example.handsonandroid;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


/**
 * 
 * @author Garrett
 *
 * Event page that will list all the events currently being used.
 */
public class EventPageActivity extends Activity implements OnClickListener{
	private String eventUrl;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event);
	}
	
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.shareButton:
			Intent shareIntent = new Intent(Intent.ACTION_SEND);
      	  	shareIntent.setType("text/plain");
      	  	shareIntent.putExtra(Intent.EXTRA_TEXT, eventUrl);
      	  	startActivity(Intent.createChooser(shareIntent, "Share"));
			break;
		case R.id.expressInterestButton:
			break;
		case R.id.signUpButton:
			break;
		}
	}
		
}
