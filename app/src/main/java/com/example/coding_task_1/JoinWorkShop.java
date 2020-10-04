package com.example.coding_task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JoinWorkShop extends AppCompatActivity {
    Button joinBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_work_shop);

        joinBtn = (Button) findViewById(R.id.joinNowBtn);
    }

    public void WSAttendantListLaunch(View view) {
         startActivity(new Intent(this,Attendants.class));
    }
}