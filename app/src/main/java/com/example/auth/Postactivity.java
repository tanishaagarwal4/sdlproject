package com.example.auth;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class Postactivity extends AppCompatActivity {
     Button button;
     EditText editText2;
     Firebase mref;
     EditText editText3;
    EditText editText4;
     EditText editText5;
     EditText editText7;
     EditText editText;
     EditText editText6;
    long maxid = 0;
private FirebaseFirestore db = FirebaseFirestore.getInstance();
//private DocumentReference noteref = db.collection("events").document("first event ");
//private CollectionReference ev = db.collection("events");
private DocumentReference noteref = db.document("Events/first event");
private CollectionReference evref = db.collection("Events");

     DatabaseReference ref;
    Event event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postactivity);
        // Firebase.setAndroidContext(this);
        //mref = new Firebase("https://auth-6b3a3.firebaseio.com/");
        button = (Button) findViewById(R.id.button2);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText7 = (EditText) findViewById(R.id.editText7);
        editText = (EditText)findViewById(R.id.editText);
        editText6 = (EditText)findViewById(R.id.editText6);
        event = new Event();
       // mref.child("Event");
       /* mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists())
                    maxid = (dataSnapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });*/
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int volunteers = Integer.parseInt(editText3.getText().toString().trim());
                event.setName(editText7.getText().toString().trim());
                event.setDesc(editText2.getText().toString().trim());
                event.setVolunteers(volunteers);
                event.setEventdate(editText4.getText().toString().trim());
                event.setAdinfo(editText5.getText().toString().trim());
                int la = Integer.parseInt(editText.getText().toString().trim());
                event.setLat(la);
                int lo = Integer.parseInt(editText6.getText().toString().trim());
event.setLng(lo);

                evref.add(event);
//noteref.set(event);
               // mref.child(String.valueOf(maxid+1)).setValue(event);
                // mref.push().setValue(event);
                //   Firebase mrefchild = mref.child("Name");
                // mrefchild.setValue("tanisha");
            }
        });
    }

}
