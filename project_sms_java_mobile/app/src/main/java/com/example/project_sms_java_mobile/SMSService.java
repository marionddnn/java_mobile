package com.example.project_sms_java_mobile;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class SMSService  extends Service {
        private static final String TAG = "SMSService";
        private static final String SMS_RECEIVED =
                "android.provider.Telephony.SMS_RECEIVED";
        private boolean active;
        private int countSMSReceived;
        public void onCreate() {
            super.onCreate();
            //IntentFilter filter = new IntentFilter(SMS_RECEIVED);
            //registerReceiver(new SMSReceiver(), filter);
        }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
