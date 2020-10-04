package com.example.coding_task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button joinWorkShop;
    Button inviteFriend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinWorkShop = (Button) findViewById(R.id.joinWorkShopBtn);
        inviteFriend = (Button) findViewById(R.id.inviteFriendBtn);

        joinWorkShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,JoinWorkShop.class));
            }
        });

        inviteFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,InviteFriend.class));
            }
        });
    }

}