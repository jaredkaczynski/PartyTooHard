package com.example.tk100_000.partytoohard;

/**
 * Created by tk100_000 on 10/24/2015.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;


public class SplashScreen extends Activity {
    private final OkHttpClient client = new OkHttpClient();




    protected int sendUserData() throws IOException {
        // if(checkPermission(LOCATION_SERVICE,))
        String android_id = Settings.Secure.getString(this.getContentResolver(),
                Settings.Secure.ANDROID_ID);
        LocationManager locationManager = (LocationManager)
                getSystemService(Context.LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        String bestProvider = locationManager.getBestProvider(criteria, false);
        RequestBody formBody = new FormEncodingBuilder()
                .add("uid", android_id)
                .add("location", "test")
                .build();

        Log.w("request", formBody.toString());
        final Request request = new Request.Builder()
                //.url("http://partyhardy.cloudapp.net/smart/api/v1/user"+"?uid="+android_id+"&location=test")
                .url("http://partyhardy.cloudapp.net/smart/api/v1/user/")
                .post(formBody)
                .build();
        Log.v("print", request.toString());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //Your code goes here
                    Response response = client.newCall(request).execute();
                    //Response response = client.newCall(request).execute();
                    //if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

                    System.out.println("sent");
                    Log.w("sent", response.body().string());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        // Location location = locationManager.getLastKnownLocation(bestProvider);
        /*
        Request.Post("http://partyhardy.cloudapp.net/smart/api/v1/user")
                .bodyForm(Form.form().add("uid", android_id).add("location", "test").build())
                .execute().returnContent().asString();*/
        return 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        //todo send post to server
        try {
            sendUserData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}