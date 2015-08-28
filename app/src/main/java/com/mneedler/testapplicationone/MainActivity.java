package com.mneedler.testapplicationone;

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

    public void ClickMeOnClick(View view) {
        Toast.makeText(view.getContext(), "Mike is realy smart!", Toast.LENGTH_LONG).show();
    }

    public void NowClickMeOnClick(View view) {
        Toast.makeText(view.getContext(), "But Stephen is not very bright!", Toast.LENGTH_LONG).show();
    }

    public void ClickMeTooOnClick(View view) {
        Toast.makeText(view.getContext(), "Hello Lucas!", Toast.LENGTH_LONG).show();
    }
}
