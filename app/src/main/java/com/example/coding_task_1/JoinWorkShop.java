package com.example.coding_task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class JoinWorkShop extends AppCompatActivity {
    Button joinBtn;
    EditText name, number;
    RadioGroup programExperience;
    CheckBox terms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_work_shop);

        InitializingViews();
    }
    private void InitializingViews(){
        joinBtn = (Button) findViewById(R.id.joinNowBtn);
        name = (EditText) findViewById(R.id.nameEdit);
        number = (EditText) findViewById(R.id.stdNumbEdit);
        programExperience = (RadioGroup) findViewById(R.id.programmingExperienceRadio);
        terms = (CheckBox) findViewById(R.id.termsCheckBox);
    }
    public void WSAttendantListLaunch(View view) {
       if(CheckData()) {
           String nameInputed = name.getText().toString();
           String numberInputed = number.getText().toString();
           String stringToSend = nameInputed + ", " + numberInputed;

           Intent i = new Intent(this, Attendants.class);
           i.putExtra("input",stringToSend);
           startActivity(i);
       }
    }
    private boolean CheckData(){
        if(name.getText().toString().isEmpty()){
            Toast.makeText(JoinWorkShop.this, "Please Enter Name", Toast.LENGTH_SHORT).show();
            return false;
        }else if(number.getText().toString().isEmpty()){
            Toast.makeText(JoinWorkShop.this, "Please Enter Student Number", Toast.LENGTH_SHORT).show();
            return false;
        }else if(programExperience.getCheckedRadioButtonId()==-1){ //this returns -1 if there isn't any RadioButton checked in the group
            Toast.makeText(JoinWorkShop.this, "Please Select Programming Experience", Toast.LENGTH_SHORT).show();
            return false;
        }else if(!terms.isChecked()){
            Toast.makeText(JoinWorkShop.this, "You need to agree to the terms and conditions before continuing", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
    
}