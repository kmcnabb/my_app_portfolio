package org.mcnabbs.myappportfolio;

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

    public void toastButton(View v){
        Toast.makeText(getApplicationContext(),"This will launch my Spotify Streamer App",Toast.LENGTH_SHORT).show();
    }

    public void toastButton2(View v){
        Toast.makeText(getApplicationContext(),"This will launch my Scores App",Toast.LENGTH_SHORT).show();
    }

    public void toastButton3(View v){
        Toast.makeText(getApplicationContext(),"This will launch my Library App!",Toast.LENGTH_SHORT).show();
    }

    public void toastButton4(View v){
        Toast.makeText(getApplicationContext(),"This will launch my Build It Bigger App!",Toast.LENGTH_SHORT).show();
    }

    public void toastButton5(View v){
        Toast.makeText(getApplicationContext(),"This will launch my XYZ reader!",Toast.LENGTH_SHORT).show();
    }

    public void toastButton6(View v){
        Toast.makeText(getApplicationContext(),"This will launch my capstone app!",Toast.LENGTH_SHORT ).show();
    }
}
