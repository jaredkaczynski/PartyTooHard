package com.example.tk100_000.partytoohard;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by tk100_000 on 10/25/2015.
 */
public class submitPartyActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submit_noise);
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
