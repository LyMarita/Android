package com.rupp.mrt.ditionary;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class Setting extends AppCompatActivity {
    RadioGroup rg;
    public static String color,font;
    RadioButton  black,white,cyan,green,blue,pink,red,yellow,gray,purple,orange;
    Button ok,cancel;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        black=(RadioButton)findViewById(R.id.black);
        white=(RadioButton)findViewById(R.id.white);
        cyan=(RadioButton)findViewById(R.id.cyan);
        green=(RadioButton)findViewById(R.id.green);
        blue=(RadioButton)findViewById(R.id.blue);
        pink=(RadioButton)findViewById(R.id.pink);
        red=(RadioButton)findViewById(R.id.red);
        yellow=(RadioButton)findViewById(R.id.yellow);
        gray=(RadioButton)findViewById(R.id.gray);
        purple=(RadioButton)findViewById(R.id.purple);
        orange=(RadioButton)findViewById(R.id.orange);
        ok=(Button)findViewById(R.id.ok);
        cancel=(Button)findViewById(R.id.cancel);
        relativeLayout=(RelativeLayout)findViewById(R.id.q);
//        RadioGroup  rg1 = (RadioGroup) findViewById(R.id.radioGroup);
//
//        int selected=rg1.getCheckedRadioButtonId(); rb1=(RadioButton)findViewById(selected);
//
//
//        -- rb.getText(): for get text what radio isSelected

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(black.isChecked()==true)
                    //relativeLayout.setBackgroundColor(getResources().getColor(R.color.Red));
                    color="black";
               else if(white.isChecked()==true)
                    //relativeLayout.setBackgroundColor(Color.GREEN);
                    color="white";
               else if(cyan.isChecked()==true)
                    //relativeLayout.setBackgroundColor(Color.CYAN);
                    color="cyan";
                else if(green.isChecked()==true)
                    //relativeLayout.setBackgroundColor(Color.BLUE);
                    color="green";
                else if(blue.isChecked()==true)
                    //relativeLayout.setBackgroundColor(Color.GREEN);
                    color="blue";
                else if(pink.isChecked()==true)
                    //relativeLayout.setBackgroundColor(Color.CYAN);
                    color="pink";
                else if(red.isChecked()==true)
                    //relativeLayout.setBackgroundColor(Color.BLUE);
                    color="red";
                else if(yellow.isChecked()==true)
                    //relativeLayout.setBackgroundColor(Color.GREEN);
                    color="yellow";
                else if(gray.isChecked()==true)
                    //relativeLayout.setBackgroundColor(Color.CYAN);
                    color="gray";
                else if(purple.isChecked()==true)
                    //relativeLayout.setBackgroundColor(Color.BLUE);
                    color="purple";
                else if(orange.isChecked()==true)
                    //relativeLayout.setBackgroundColor(Color.GREEN);
                    color="orange";
                finish();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
