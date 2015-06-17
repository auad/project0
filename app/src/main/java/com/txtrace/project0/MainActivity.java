package com.txtrace.project0;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*Spotify Button action*/
    public void callSpotify(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Spotify Streamer";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /*Scores Button action*/
    public void callScores(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Scores App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /*Library Button action*/
    public void callLibrary(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Library App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /*Build Button action*/
    public void callBuild(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Build it Bigger";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /*XYZ Button action*/
    public void callXYZ(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the XYZ Reader";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /*Capstone Button action*/
    public void callCapstone(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Capstone App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
