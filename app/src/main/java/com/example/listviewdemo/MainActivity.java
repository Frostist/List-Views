package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String TAG = "Project";
    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Allowing the list view to be found in the activity
        myListView = findViewById(R.id.myListView);
        //Creating an array list
        final ArrayList<String> familyNames = new ArrayList<>();
        //Added names to the array list
        familyNames.add("William");
        familyNames.add("Nick");
        familyNames.add("Dad");
        familyNames.add("Mom");
        familyNames.add("Toby");

        //Creating an array adapter and telling it to use said template to displace in the listView
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, familyNames);
        //setting the listview to use the above array adapter
        myListView.setAdapter(arrayAdapter);
        //Sets up an On Clikc Listener for when someone clicks on one of the names
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Prints to the Log.w when someone is clicked
                Log.w(TAG, "Person Selected: " + familyNames.get(position));
            }
        });


    }
}
