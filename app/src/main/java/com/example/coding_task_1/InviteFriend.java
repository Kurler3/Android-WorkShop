package com.example.coding_task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
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
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"));
                if(i1.resolveActivity(getPackageManager())!=null) {
                    startActivity(i1);
                }
                break;
            case R.id.smsBtn:
                Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("sms:"));
                i2.addCategory(Intent.CATEGORY_APP_MESSAGING);
                if(i2.resolveActivity(getPackageManager())!=null)
                    startActivity(i2);
                break;
            case R.id.callBtn:
                Intent i3 = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:"));
                if(i3.resolveActivity(getPackageManager())!=null)
                    startActivity(i3);
                break;
        }
    }
}