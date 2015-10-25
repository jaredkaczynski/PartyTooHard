package com.example.tk100_000.partytoohard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by tk100_000 on 10/25/2015.
 */
public class submitPartyActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submit_party);
    }

    public void stopPartyActivity(View v) {
        Toast.makeText(getApplicationContext(), "Party Submitted",
                Toast.LENGTH_LONG).show();
        super.finish();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
