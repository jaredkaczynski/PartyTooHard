package com.example.tk100_000.partytoohard;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter<String> listAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //LinearLayout ll = (LinearLayout) findViewById(R.id.view); // get the parent layout view
        //ListView tv = (ListView) ll.findViewById(R.id.listView); // get the child text view
        //final String text = tv.getText().toString();
        //CardView cardView = ((CardView) findViewById(R.id.cardList));
        //RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);
        String[] strings = new String[] { "Report Noise Complaint","Add Party to Database","Your Reports"};
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.addAll(Arrays.asList(strings));

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this,R.layout.cards, planetList);
        /*TextView t = (TextView) findViewById(R.id.info_text1);
        t.setText("Report Noise Complaint");
        t = (TextView) findViewById(R.id.info_text2);
        t.setText("Add Party to Database");
        t = (TextView) findViewById(R.id.info_text3);
        t.setText("Your Reports");
        t = (TextView) findViewById(R.id.info_text4);
        t.setText("Report Noise Complaint");*/
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
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
}
