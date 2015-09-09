package com.davidllorca.myapppreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class UsingPreferencesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_preferences);
    }

    public void onClickLoad(View view){
        Intent intent = new Intent("com.davidllorca.myapppreferences.AppPreferenceActivity");
        startActivity(intent);
    }

    public void onClickLoadDisplay(View view){
        // Acces file option a
        /*SharedPreferences appPrefs = getSharedPreferences("com.davidllorca.myapppreferences_preferences", MODE_PRIVATE);*/

        // Acces file option b
        SharedPreferences appPrefs = getSharedPreferences("appPreferences", MODE_PRIVATE);

        // Display example
        displayText(appPrefs.getString("editTextPref", ""));
    }

    public void onClickModify(View view){
        // Acces file option a
        /*SharedPreferences appPrefs = getSharedPreferences("com.davidllorca.myapppreferences_preferences", MODE_PRIVATE);*/

        // Acces file option b
        SharedPreferences appPrefs = getSharedPreferences("appPreferences", MODE_PRIVATE);
        
        // Manager for edit preferences
        SharedPreferences.Editor prefsEditor = appPrefs.edit();
        // Get String from EditText
        String text = ((EditText) findViewById(R.id.string_txt)).getText().toString();
        prefsEditor.putString("editTextPref", text);
        // Commit changes
        prefsEditor.commit();
    }
    private void displayText(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
