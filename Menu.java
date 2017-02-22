package com.rupp.mrt.ditionary;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button Us=(Button)findViewById(R.id.btnAboutUs);
        Button Dictionary=(Button)findViewById(R.id.btnDictionary);
        Button setting=(Button)findViewById(R.id.btnSetting);
        Button exit=(Button)findViewById(R.id.btnExit);

        Us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent About=new Intent(getApplication(),AboutUs.class);
                startActivity(About);
            }
        });
        Dictionary.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Dic=new Intent(getApplication(),List_Menu.class);
                startActivity(Dic);
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s=new Intent(getApplication(),Setting.class);
                startActivity(s);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            finish();
            }
        });
    }
}
