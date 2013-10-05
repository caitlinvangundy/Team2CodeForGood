package com.example.handsonandroid;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

/**
 * 
 * @author Garrett
 * 
 * Class saves the users information so they don't
 * have to constantly log in when using the app.
 * 
 * Will connect to server when possible to get rest of information.
 */
public class SaveSharedPreference {

	public static final String USERNAME_KEY = "username";
	public static final String USER_PASS_KEY = "password";
	public static final String USER_NAME_KEY = "name";
	public static final String USER_ID_KEY = "ID";
	
	static SharedPreferences getSharedPreferences(Context ctx){
		return PreferenceManager.getDefaultSharedPreferences(ctx);
	}
	
	/**
	 * Set the data
	 * @param ctx : The context to use
	 * @param KEY : The key (See Constants)
	 * @param data: The data to save
	 */
	public static void setData(Context ctx, String KEY, String data){
		Editor editor = getSharedPreferences(ctx).edit();
		editor.putString(KEY, data);
		editor.commit();
	}

	/**
	 * Get a saved data
	 * @param ctx : The context to use
	 * @param KEY : The key (See Constants)
	 * @return : The data (emtpy string if non-existant)
	 */
	public static String getData(Context ctx, String KEY){
		return getSharedPreferences(ctx).getString(KEY, "");
	}
	
	
}
