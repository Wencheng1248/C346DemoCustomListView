package com.myapplicationdev.android.c346democustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<contacts> alContactList;
    customAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();
        contacts item1 = new contacts("mary",65, 12345678,'f');
        contacts item2 = new contacts("ken" , 65 , 87654321 , 'm');
        alContactList.add(item1);
        alContactList.add(item2);

        caContact = new customAdapter(this,R.layout.row,alContactList);
        lvContact.setAdapter(caContact);
    }
}
