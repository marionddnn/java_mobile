package com.example.project_sms_java_mobile;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;


import android.provider.ContactsContract;
import android.telephony.SmsManager;

import android.util.Log;
import android.view.Menu;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends Activity {
    Button sendBtn;
    Button statsContactsBtn;
    Button parametersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBtn = (Button) findViewById(R.id.btnSendSMS);
        statsContactsBtn = (Button) findViewById(R.id.btnStatsContacts);
        parametersBtn = (Button) findViewById(R.id.btnParameters);


        sendBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goToSendMessageActivity = new Intent(MainActivity.this, smsSend.class);
                startActivity(goToSendMessageActivity);
            }
        });

        statsContactsBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent goToContactsActivity = new Intent(MainActivity.this, Contacts.class);
                startActivity(goToContactsActivity);
            }
        });
    }
}