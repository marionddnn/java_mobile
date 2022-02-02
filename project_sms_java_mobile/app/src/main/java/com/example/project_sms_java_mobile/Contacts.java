package com.example.project_sms_java_mobile;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Contacts extends Activity {
    private final int REQUEST_READ_CONTACTS = 0;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
        recyclerView = findViewById(R.id.recyclerView);
        getContacts();
    }


    public void requestContactPermission(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                this, android.Manifest.permission.READ_CONTACTS)) {
        } else {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.READ_CONTACTS},
                    REQUEST_READ_CONTACTS);}
    }


    public void getContacts() {
        requestContactPermission();
    }

    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        switch (requestCode) {
            case REQUEST_READ_CONTACTS: {
                ArrayList<Contact> contactList = new ArrayList<>();
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    ContentResolver resolver = getContentResolver();
                    Uri uri = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                    Cursor cr = resolver.query(uri, null, null, null, null);
                    cr.moveToFirst();
                    int columnName = cr.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);
                    int columnID = cr.getColumnIndex(ContactsContract.CommonDataKinds.Phone._ID);
                    int columnNumber = cr.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);

                    do {
                        Log.d("name", cr.getString(columnName));
                        Log.d("id", cr.getString(columnID));
                        Log.d("number", cr.getString(columnNumber));
                        Contact ContactNew = new Contact(cr.getString(columnName), cr.getString(columnNumber));
                        contactList.add(ContactNew);
                    } while (cr.moveToNext());
                    recyclerViewAdapter = new RecyclerViewAdapter(contactList);
                    recyclerView.setAdapter(recyclerViewAdapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(this));
                }
                Toast.makeText(getApplicationContext(), "Contacts récupérés",
                        Toast.LENGTH_LONG).show();
            }
        }
    }
}
