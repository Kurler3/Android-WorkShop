package com.example.coding_task_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

        try{
            String input = getIntent().getStringExtra("input");
            if(!input.isEmpty()){
                String itemToAdd = String.valueOf(attendantArray.size()) + ". " + input;
                attendantArray.add(0,itemToAdd);
            }
        }catch (Exception e){}
        listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,attendantArray);
        attendantListView.setAdapter(listAdapter);
    }
    private ArrayList<String> AddNamesToListView(ArrayList<String> attendantArray){
        attendantArray.add("Moon Cake, 6658773577");
        attendantArray.add("Enrique West, 8582700617");
        attendantArray.add("Damien Braun, 4113674062");
        attendantArray.add("Ellie Osborne, 8373122815");
        attendantArray.add("Cierra Vegae, 1622737449");
        attendantArray.add("Alden Cantrell, 0038341717");
        attendantArray.add("Kierra Gentry, 5071786790");
        attendantArray.add("Pierre Cox, 2446486879");
        attendantArray.add("张三, 8609412135");
        attendantArray.add("张一, 4694829054");
        attendantArray.add("Waneta Cripe, 6422532700");
        attendantArray.add("Laraine Bundrick, 5221099248");
        attendantArray.add("Cleotilde Seedorf, 4957209795");
        attendantArray.add("Lucius Fonte, 1900965047");
        attendantArray.add("Byron Rotolo, 0995559113");
        attendantArray.add("Lynell Cronin, 9679347496");
        attendantArray.add("Alejandro Russel, 6751113249");
        attendantArray.add("Tenesha Perkins, 2500204389");
        attendantArray.add("Emilee Marmolejo, 4113894342");
        attendantArray.add("Soraya Reily, 7862522427");
        attendantArray.add("Miriam Goodwyn, 6479771548");
        attendantArray.add("Dorsey Aaronson, 2744528464");
        attendantArray.add("Jeanice Prim, 4544205110");
        attendantArray.add("Staci Gomer, 2798540578");
        attendantArray.add("Nisha Feth, 4476399325");
        attendantArray.add("Debrah Mathes, 6807154666");
        attendantArray.add("Bunny Osuna, 5496979659");
        attendantArray.add("Earline Danks, 1137481706");

        for(int i=0;i<attendantArray.size();i++){
            String index = String.valueOf(attendantArray.size() - i);
            attendantArray.set(i,index + ". " + attendantArray.get(i));
        }
        return attendantArray;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.attendants_option_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.joinWorkshopOption:
                startActivity(new Intent(Attendants.this,JoinWorkShop.class));
                return true;
            case R.id.inviteOption:
                startActivity(new Intent(Attendants.this, InviteFriend.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}