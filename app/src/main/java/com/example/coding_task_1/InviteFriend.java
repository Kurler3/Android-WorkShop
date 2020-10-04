package com.example.coding_task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class InviteFriend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_friend);
    }

    public void InviteLaunch(View view) {
        switch(view.getId()){
            case R.id.emailBtn:
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:")));
                break;
            case R.id.smsBtn:
                Intent i2 = new Intent(Intent.ACTION_MAIN);
                i2.addCategory(Intent.CATEGORY_APP_MESSAGING);
                startActivity(i2);
                break;
            case R.id.callBtn:
                startActivity(new Intent(Intent.ACTION_DIAL));
                break;
        }
    }
}