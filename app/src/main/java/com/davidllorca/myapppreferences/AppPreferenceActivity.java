package com.davidllorca.myapppreferences;

import android.app.Activity;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class AppPreferenceActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_app_preference);

        // Define name to file SharedPreferences
        PreferenceManager prefManager = getPreferenceManager();
        prefManager.setSharedPreferencesName("appPreferences");

        addPreferencesFromResource(R.xml.preferences);
    }
}
