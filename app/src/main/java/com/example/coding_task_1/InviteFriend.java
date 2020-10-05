package com.example.coding_task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InviteFriend extends AppCompatActivity {
    EditText invName, invNumber, invEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_friend);

        invName = (EditText) findViewById(R.id.inviteNameInput);
        invNumber = (EditText) findViewById(R.id.inviteNumberInput);
        invEmail = (EditText) findViewById(R.id.inviteEmailInput);
    }
    public void InviteLaunch(View view) {
        //add checkdata function here
        switch(view.getId()){
            case R.id.emailBtn:
                if(invName.getText().toString().isEmpty()){
                    Toast.makeText(InviteFriend.this,"Please Enter Name",Toast.LENGTH_SHORT).show();
                    break;
                }else if(invEmail.getText().toString().isEmpty()){
                    Toast.makeText(InviteFriend.this,"Please Enter Email",Toast.LENGTH_SHORT).show();
                    break;
                }
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + invEmail.getText().toString()));
                i1.setType("text/html");
                i1.putExtra(Intent.EXTRA_SUBJECT, "Invitation to the Android WorkShop");
                i1.putExtra(Intent.EXTRA_TEXT, "hey " + invName.getText().toString() + " , come and join the Android workshop scheduled October \n" +
                        "1st to 8th. By the way it is fully online.");
                if(i1.resolveActivity(getPackageManager())!=null) {
                    startActivity(i1);
                }
                break;
            case R.id.smsBtn:
                if(invName.getText().toString().isEmpty()){
                    Toast.makeText(InviteFriend.this,"Please Enter Name",Toast.LENGTH_SHORT).show();
                    break;
                }else if(invNumber.getText().toString().isEmpty()){
                    Toast.makeText(InviteFriend.this,"Please Enter Number",Toast.LENGTH_SHORT).show();
                    break;
                }
                Intent i2 = new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:" + invNumber.getText().toString()));
                i2.putExtra("sms_body", "hey " + invName.getText().toString() + " , come and join the Android workshop scheduled October \n" +
                        "1st to 8th. By the way it is fully online.");
                if(i2.resolveActivity(getPackageManager())!=null)
                    startActivity(i2);
                break;
            case R.id.callBtn:
                if(invNumber.getText().toString().isEmpty()){
                    Toast.makeText(InviteFriend.this,"Please Enter Number",Toast.LENGTH_SHORT).show();
                    break;
                }
                Intent i3 = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:" + invNumber.getText().toString()));
                if(i3.resolveActivity(getPackageManager())!=null)
                    startActivity(i3);
                break;
        }
    }
}