package com.example.myapplication.activities;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {
    @Override
        public void onNewToken (@NonNull String token) {
        super.onNewToken(token);
        Log.d("FCM", "token: " + token);
    }

    @Override
        public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived((remoteMessage));
        Log.d("FCM", "Message" + remoteMessage.getNotification().getBody());
    }
}
