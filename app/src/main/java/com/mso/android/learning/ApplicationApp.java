package com.mso.android.learning;

import android.app.Application;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by marcos on 23/08/17.
 */

public class ApplicationApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        String token = FirebaseInstanceId.getInstance().getToken();

        if(token != null){

            Log.i("my device Token",token);
        }
    }
}
