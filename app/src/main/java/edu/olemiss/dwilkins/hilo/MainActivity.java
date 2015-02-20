package edu.olemiss.dwilkins.hilo;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity
{

    int startNum;
    TextView TV_number;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        doStart(null);
    }

    public void doStart(View v)
    {
        Random RN = new Random();
        startNum = RN.nextInt(99)+1;
        TV_number = (TextView) findViewById(R.id.TV_number);
        TV_number.setTextColor(Color.BLACK);
        TV_number.setText("" + startNum);
    }

    public void doIncrement(View v)
    {
        startNum += 1;
        TV_number = (TextView) findViewById(R.id.TV_number);
        TV_number.setTextColor(Color.BLUE);
        TV_number.setText("" + startNum);
    }

    public void doDecrement(View v)
    {
        startNum -= 1;
        TV_number = (TextView) findViewById(R.id.TV_number);
        TV_number.setTextColor(Color.WHITE);
        TV_number.setText("" + startNum);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
