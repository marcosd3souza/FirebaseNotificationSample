package com.mso.android.learning.service;

import android.content.ContextWrapper;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by marcos on 23/08/17.
 */

public class FirebaseService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.i("mso-not", "chegou!");
    }
}
