package com.example.abhinav.dialogexample;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button5);
        button5=(Button)findViewById(R.id.button6);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button)
        {
            DialogFragment1 dialogFragment1=new DialogFragment1();
            dialogFragment1.show(getSupportFragmentManager(),"DialogFragment1");
        }
        else if(v.getId()==R.id.button2)
        {
            DialogFragment2 dialogFragment2=new DialogFragment2();
            dialogFragment2.show(getSupportFragmentManager(),"DialogFragment2");
        }
        else if(v.getId()==R.id.button3)
        {
            CustomDialog customDialog=new CustomDialog(this);
            customDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            customDialog.show();
        }
        else if(v.getId()==R.id.button5)
        {
            TimePickerFragment timePickerFragment=new TimePickerFragment();
            timePickerFragment.show(getSupportFragmentManager(),"TIme Picker Fragment");
        }
        else if(v.getId()==R.id.button6)
        {
            DialogFragment3 dialogFragment3=new DialogFragment3();
            getSupportFragmentManager().beginTransaction().add(R.id.rl,dialogFragment3).addToBackStack(null).commit();
        }
    }
}
