package com.example.tk100_000.partytoohard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

/**
 * Created by tk100_000 on 10/25/2015.
 */
public class RelevantActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_self);
    }

    public void stopPartyActivity(View v) {
        ExpandableListView test = (ExpandableListView) findViewById(R.id.listview1);
        super.finish();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}

