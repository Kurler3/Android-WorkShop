package com.example.coding_task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Attendants extends AppCompatActivity {
    ListView attendantListView;
    ArrayAdapter<String> listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendants);

        attendantListView = (ListView) findViewById(R.id.attendantsList);

        ArrayList<String> attendantArray = new ArrayList<>();
        attendantArray = AddNamesToListView(attendantArray);

        listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,attendantArray);

        attendantListView.setAdapter(listAdapter);
    }

    private ArrayList<String> AddNamesToListView(ArrayList<String> attendantArray){
        attendantArray.add("Moon Cake");
        attendantArray.add("Enrique West");
        attendantArray.add("Damien Braun");
        attendantArray.add("Ellie Osborne");
        attendantArray.add("Cierra Vegae");
        attendantArray.add("Alden Cantrell");
        attendantArray.add("Kierra Gentry");
        attendantArray.add("Pierre Cox");
        attendantArray.add("张三");
        attendantArray.add("张一");
        attendantArray.add("Waneta Cripe");
        attendantArray.add("Laraine Bundrick");
        attendantArray.add("Cleotilde Seedorf");
        attendantArray.add("Lucius Fonte");
        attendantArray.add("Byron Rotolo");
        attendantArray.add("Lynell Cronin");
        attendantArray.add("Alejandro Russel");
        attendantArray.add("Tenesha Perkins");
        attendantArray.add("Emilee Marmolejo");
        attendantArray.add("Soraya Reily");
        attendantArray.add("Miriam Goodwyn");
        attendantArray.add("Dorsey Aaronson");
        attendantArray.add("Jeanice Prim");
        attendantArray.add("Staci Gomer");
        attendantArray.add("Nisha Feth");
        attendantArray.add("Debrah Mathes");
        attendantArray.add("Bunny Osuna");
        attendantArray.add("Earline Danks");

        for(int i=0;i<attendantArray.size();i++){
            String index = String.valueOf(attendantArray.size() - i);
            attendantArray.set(i,index + ". " + attendantArray.get(i));
        }
        return attendantArray;
    }
}