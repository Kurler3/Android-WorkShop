package com.example.coding_task_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_options_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.viewAttendantList:
                startActivity(new Intent(MainActivity.this, Attendants.class));
                return true;
            case R.id.infoOption:
                ShowInfoDialog();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void ShowInfoDialog(){
        final AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle("Android WorkShop")
        .setMessage("This is the Android WorkShop app, for joining and inviting friends to join the workshop")
        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
}