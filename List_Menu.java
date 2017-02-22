package com.rupp.mrt.ditionary;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
public class List_Menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    static String main;
    static String nv;
    TextView tv;
    LinearLayout linearLayout;
    SearchView inputsearch;
    ListView lv;
    ArrayAdapter<String> adapter;
    ArrayList<HashMap<String,String>> PList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation__drawer);

        ListView lst=(ListView)findViewById(R.id.MyListView);
        final String[] values=new String[]{getResources().getString(R.string.sport),getResources().getString(R.string.electronic),
        getResources().getString(R.string.fruit),getResources().getString(R.string.family),getResources().getString(R.string.occupation),
                getResources().getString(R.string.animal),getResources().getString(R.string.drink),getResources().getString(R.string.vegetable)
                ,getResources().getString(R.string.Emotion)};
        Class_List_Menu listFamily=new Class_List_Menu(this,values);
        lst.setAdapter(listFamily);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(List_Menu.this, values[i], Toast.LENGTH_LONG).show();
                if (values[i].equals(getResources().getString(R.string.electronic))) {
                    main = "Electronic";
                    Intent Ele = new Intent(getApplicationContext(), Electronic.class);
                    startActivity(Ele);
                } else if (values[i].equals(getResources().getString(R.string.sport))) {
                    main = "Sport";
                    Intent Spo = new Intent(getApplicationContext(), Sport.class);
                    startActivity(Spo);
                } else if (values[i].equals(getResources().getString(R.string.fruit))) {
                    main = "Fruit";
                    Intent fr = new Intent(getApplicationContext(), Fruit.class);
                    startActivity(fr);
                } else if (values[i].equals(getResources().getString(R.string.occupation))) {
                    main = "Occupation";
                    Intent Occ = new Intent(getApplicationContext(), Occupation.class);
                    startActivity(Occ);
                } else if (values[i].equals(getResources().getString(R.string.family))) {
                    main = "Family";
                    Intent Occ = new Intent(getApplicationContext(), Family.class);
                    startActivity(Occ);
                } else if (values[i].equals(getResources().getString(R.string.animal))) {
                    main = "Animal";
                    Intent Occ = new Intent(getApplicationContext(), Animal.class);
                    startActivity(Occ);
                } else if (values[i].equals(getResources().getString(R.string.drink))) {
                    main = "Drink";
                    Intent Occ = new Intent(getApplicationContext(), Drink.class);
                    startActivity(Occ);
                } else if (values[i].equals(getResources().getString(R.string.vegetable))) {
                    main = "Vegetable";
                    Intent v = new Intent(getApplicationContext(), Vegetable.class);
                    startActivity(v);
                } else if (values[i].equals(getResources().getString(R.string.Emotion))) {
                    main = "Emotion";
                    Intent v = new Intent(getApplicationContext(), Emotion.class);
                    startActivity(v);
                }
            }
        });
        lv=(ListView)findViewById(R.id.nv_list);
       final String[] value=new String[]{"Afraid","Angry","Apple","Archery","Aunt","Banana","Basketball","Baseball","Bored","Bowling","Broccoli","Businessman",
               "Cabbage","Camcorder", "Camera","Carrot","Cat","Cauliflower","Chef","Chicken","Cleaner","Coffee","Computer","Cow",
               "Crocodile","Cry","Cucumber","Daughter","Doctor","Dog","Duck","Durian","Farmer","Father","Fish","Football","Garlic",
               "Golf","Grandmother","Grape","Guava","Happy","Horse racing","Hurt","Husband","Jackfruit","Jujube","Kiwi","Laptop","Lawyer","Lettuce",
               "Lonely","Lychee","Mango","Mangosteen","Milk","Mobile Phone","Mother","Mushroom","Orange","Orange Juice","Painter","Papaya", "Pepper",
               "Persimmon","Pineapple","Pomegranate","Printer","Programmer","Pure water","Rambutan","Sad","Sapodilla","Scientist","Sister","Smart watch","Snake",
               "Soda","Soldier","Son","Speaker","Strawberry","Sweetsop","Tablet","Telephone","Television","Tennis","Tiger","Tired","Tomato","Vet",
               "Volleyball","Watermelon","Weightlifting","Wife","Zebra"};
        inputsearch=(SearchView)findViewById(R.id.searchView);
        final ArrayAdapter<String> adapter;
        adapter=new ArrayAdapter<>(this,R.layout.list_search,R.id.lblSearch,value);
        lv.setAdapter(adapter);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.setDrawerListener(toggle);
            toggle.syncState();
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);

            inputsearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    adapter.getFilter().filter(newText);
                    return true;
                }
            });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(lv.getItemAtPosition(i).equals("Afraid"))
                {
                    main = "Emotion";
                  Emotion.estr = "afraid";
                }
                else if(lv.getItemAtPosition(i).equals("Angry"))
                {
                    main = "Emotion";
                       Emotion.estr = "angry";
                }
                else if(lv.getItemAtPosition(i).equals("Apple"))
                {
                    main = "Fruit";
                    Fruit.st = "apple";
                }
                else if(lv.getItemAtPosition(i).equals("Archery"))
                {
                    main = "Sport";
                        Sport.st = "archery";
                }
                else if(lv.getItemAtPosition(i).equals("Aunt"))
                {
                    main = "Family";
                       Family.fstr = "aunt";
                }
                else if(lv.getItemAtPosition(i).equals("Banana"))
                {
                    main = "Fruit";
                    Fruit.st = "banana";
                }
                else if(lv.getItemAtPosition(i).equals("Basketball"))
                {
                    main = "Sport";
                    Sport.st = "basketball";
                }
                else if(lv.getItemAtPosition(i).equals("Baseball"))
                {
                    main = "Sport";
                    Sport.st = "baseball";
                }
                else if(lv.getItemAtPosition(i).equals("Bored"))
                {
                    main = "Emotion";
                    Emotion.estr = "bored";
                }
                else if(lv.getItemAtPosition(i).equals("Bowling"))
                {
                    main = "Sport";
                    Sport.st = "bowling";
                }
                else if(lv.getItemAtPosition(i).equals("Broccoli"))
                {
                    main = "Vegetable";
                    Vegetable.vstr = "broccoli";
                }
                if(lv.getItemAtPosition(i).equals("Businessman"))
                {
                    main = "Occupation";
                    Occupation.stOcc = "businessman";
                }
                else if(lv.getItemAtPosition(i).equals("Cabbage"))
                {
                    main = "Vegetable";
                    Vegetable.vstr = "cabbage";
                }
                else if(lv.getItemAtPosition(i).equals("Camcorder"))
                {
                    main = "Electronic";
                    Electronic.stritem = "camcorder";
                }

                else if(lv.getItemAtPosition(i).equals("Camera"))
                {
                    main = "Electronic";
                    Electronic.stritem = "camera";
                }
                else if(lv.getItemAtPosition(i).equals("Carrot"))
                {
                    main = "Vegetable";
                    Vegetable.vstr = "carrot";
                }
                else if(lv.getItemAtPosition(i).equals("Cat"))
                {
                    main = "Animal";
                    Animal.astr = "cat";
                }
                else if(lv.getItemAtPosition(i).equals("Cauliflower"))
                {
                    main = "Vegetable";
                    Vegetable.vstr = "cauliflower";
                }
                else if(lv.getItemAtPosition(i).equals("Chef"))
                {
                    main = "Occupation";
                    Occupation.stOcc = "chef";
                }
                else if(lv.getItemAtPosition(i).equals("Chicken"))
                {
                    main = "Animal";
                    Animal.astr = "chicken";
                }
                else if(lv.getItemAtPosition(i).equals("Cleaner"))
                {
                    main = "Occupation";
                    Occupation.stOcc = "cleaner";
                }
                else if(lv.getItemAtPosition(i).equals("Coca Cola"))
                {
                    main = "Drink";
                    Drink.dstr = "coco_cola";
                }
                else if(lv.getItemAtPosition(i).equals("Coffee"))
                {
                    main = "Drink";
                    Drink.dstr = "coffee";
                }
                else if(lv.getItemAtPosition(i).equals("Computer"))
                {
                    main = "Electronic";
                    Electronic.stritem = "computer";
                }
                else if(lv.getItemAtPosition(i).equals("Cow"))
                {
                    main = "Animal";
                    Animal.astr = "cow";
                }
                else if(lv.getItemAtPosition(i).equals("Crocodile"))
                {
                    main = "Animal";
                    Animal.astr = "crocodile";
                }
                else if(lv.getItemAtPosition(i).equals("Cry"))
                {
                    main = "Emotion";
                    Emotion.estr = "cry";
                }
                else if(lv.getItemAtPosition(i).equals("Cucumber"))
                {
                    main = "Vegetable";
                    Vegetable.vstr = "cucumber";
                }
                if(lv.getItemAtPosition(i).equals("Daughter"))
                {
                    main = "Family";
                    Family.fstr = "daughter";
                }
                else if(lv.getItemAtPosition(i).equals("Doctor"))
                {
                    main = "Occupation";
                    Occupation.stOcc = "doctor";
                }
                else if(lv.getItemAtPosition(i).equals("Dog"))
                {
                    main = "Animal";
                    Animal.astr = "dog";
                }
                else if(lv.getItemAtPosition(i).equals("Duck"))
                {
                    main = "Animal";
                    Animal.astr = "duck";
                }
                else if(lv.getItemAtPosition(i).equals("Durian"))
                {
                    main = "Fruit";
                    Fruit.st = "durian";
                }
                else if(lv.getItemAtPosition(i).equals("Farmer"))
                {
                    main = "Occupation";
                    Occupation.stOcc = "farmer";
                }
                else if(lv.getItemAtPosition(i).equals("Father"))
                {
                    main = "Family";
                    Family.fstr = "father";
                }
                else if(lv.getItemAtPosition(i).equals("Fish"))
                {
                    main = "Animal";
                    Animal.astr = "fish";
                }
                if(lv.getItemAtPosition(i).equals("Football"))
                {
                    main = "Sport";
                    Sport.st = "football";
                }
                else if(lv.getItemAtPosition(i).equals("Fruit"))
                {
                    main = "Family";
                    Family.fstr = "daughter";
                }
                else if(lv.getItemAtPosition(i).equals("Garlic"))
                {
                    main = "Vegetable";
                    Vegetable.vstr = "garlic";
                }
                else if(lv.getItemAtPosition(i).equals("Golf"))
                {
                    main = "Sport";
                    Sport.st = "golf";
                }

                else if(lv.getItemAtPosition(i).equals("Grandmother"))
                {
                    main = "Family";
                    Family.fstr = "grandmother";
                }
                else if(lv.getItemAtPosition(i).equals("Grape"))
                {
                    main = "Fruit";
                    Fruit.st = "grape";
                }
                else if(lv.getItemAtPosition(i).equals("Guava"))
                {
                    main = "Fruit";
                    Fruit.st = "guava";
                }
                else if(lv.getItemAtPosition(i).equals("Happy"))
                {
                    main = "Emotion";
                    Emotion.estr = "happy";
                }
                if(lv.getItemAtPosition(i).equals("Horse racing"))
                {
                    main = "Sport";
                    Sport.st = "horse_racing";
                }
                else if(lv.getItemAtPosition(i).equals("Hurt"))
                {
                    main = "Emotion";
                    Emotion.estr = "hurt";
                }
                else if(lv.getItemAtPosition(i).equals("Husband"))
                {
                    main = "Family";
                    Family.fstr = "husband";
                }
                else if(lv.getItemAtPosition(i).equals("Jackfruit"))
                {
                    main = "Fruit";
                    Fruit.st = "jackfruit";
                }
                else if(lv.getItemAtPosition(i).equals("Jujube"))
                {
                    main = "Fruit";
                    Fruit.st = "jujube";
                }
                else if(lv.getItemAtPosition(i).equals("Kiwi"))
                {
                    main = "Fruit";
                    Fruit.st = "kiwi";
                }
                else if(lv.getItemAtPosition(i).equals("Laptop"))
                {
                    main = "Electronic";
                    Electronic.stritem = "laptop";
                }
                else if(lv.getItemAtPosition(i).equals("Lawyer"))
                {
                    main = "Occupation";
                    Occupation.stOcc = "lawyer";
                }
                else if(lv.getItemAtPosition(i).equals("Lettuce"))
                {
                    main = "Vegetable";
                    Vegetable.vstr = "lettuce";
                }
                if(lv.getItemAtPosition(i).equals("Lonely"))
                {
                    main = "Emotion";
                    Emotion.estr = "lonely";
                }
                else if(lv.getItemAtPosition(i).equals("Lychee"))
                {
                    main = "Fruit";
                    Fruit.st = "lychee";
                }
                else if(lv.getItemAtPosition(i).equals("Mango"))
                {
                    main = "Fruit";
                    Fruit.st = "mango";
                }
                else if(lv.getItemAtPosition(i).equals("Mangosteen"))
                {
                    main = "Fruit";
                    Fruit.st = "mangosteen";
                }
                else if(lv.getItemAtPosition(i).equals("Milk"))
                {
                    main = "Drink";
                    Drink.dstr = "milk";
                }
                else if(lv.getItemAtPosition(i).equals("Mobile Phone")) {
                    main = "Electronic";
                    Electronic.stritem = "mobile_phone";
                }
                else if(lv.getItemAtPosition(i).equals("Mother"))
                {
                    main = "Family";
                    Family.fstr = "mother";
                }
                else if(lv.getItemAtPosition(i).equals("Mushroom"))
                {
                    main = "Vegetable";
                    Vegetable.vstr = "mushroom";
                }
                else if(lv.getItemAtPosition(i).equals("Orange"))
                {
                    main = "Fruit";
                    Fruit.st = "orange";
                }
                if(lv.getItemAtPosition(i).equals("Orange Juice"))
                {
                    main = "Drink";
                    Drink.dstr= "orange_juice";
                }
                else if(lv.getItemAtPosition(i).equals("Painter"))
                {
                    main = "Occupation";
                    Occupation.stOcc = "painter";
                }
                else if(lv.getItemAtPosition(i).equals("Papaya"))
                {
                    main = "Fruit";
                    Fruit.st = "papaya";
                }
                else if(lv.getItemAtPosition(i).equals("Pepper"))
                {
                    main = "Vegetable";
                    Vegetable.vstr = "pepper";
                }
                else if(lv.getItemAtPosition(i).equals("Persimmon"))
                {
                    main = "Fruit";
                    Fruit.st = "persimmon";
                }
                else if(lv.getItemAtPosition(i).equals("Pineapple"))
                {
                    main = "Fruit";
                    Fruit.st = "pineapple";
                }
                else if(lv.getItemAtPosition(i).equals("Pomegranate"))
                {
                    main = "Fruit";
                    Fruit.st = "pomegranate";
                }
                else if(lv.getItemAtPosition(i).equals("Printer"))
                {
                    main = "Electronic";
                    Electronic.stritem = "printer";
                }
                else if(lv.getItemAtPosition(i).equals("Programmer"))
                {
                    main = "Occupation";
                    Occupation.stOcc = "programmer";
                }
                else if(lv.getItemAtPosition(i).equals("Pure water")) {
                    main = "Drink";
                    Drink.dstr = "pure_water";
                }
                if(lv.getItemAtPosition(i).equals("Rambutan"))
                {
                    main = "Fruit";
                    Fruit.st = "rambutan";
                }
                else if(lv.getItemAtPosition(i).equals("Sad"))
                {
                    main = "Emotion";
                    Emotion.estr = "sad";
                }
                else if(lv.getItemAtPosition(i).equals("Sapodilla"))
                {
                    main = "Fruit";
                    Fruit.st = "sapodilla";
                }
                else if(lv.getItemAtPosition(i).equals("Scientist"))
                {
                    main = "Occupation";
                    Occupation.stOcc = "scientist";
                }
                else if(lv.getItemAtPosition(i).equals("Sister"))
                {
                    main = "Family";
                    Family.fstr = "sister";
                }
                else if(lv.getItemAtPosition(i).equals("Smart watch"))
                {
                    main = "Electronic";
                    Electronic.stritem = "smart_watch";
                }

                else if(lv.getItemAtPosition(i).equals("Snake"))
                {
                    main = "Animal";
                    Animal.astr = "snake";
                }
                else if(lv.getItemAtPosition(i).equals("Soda"))
                {
                    main = "Drink";
                    Drink.dstr = "soda";
                }
                else if(lv.getItemAtPosition(i).equals("Soldier"))
                {
                    main = "Occupation";
                    Occupation.stOcc = "soldier";
                }
                else if(lv.getItemAtPosition(i).equals("Son"))
                {
                    main = "Family";
                    Family.fstr = "son";
                }
                if(lv.getItemAtPosition(i).equals("Speaker"))
                {
                    main = "Electronic";
                    Electronic.stritem = "speaker";
                }
                else if(lv.getItemAtPosition(i).equals("Strawberry"))
                {
                    main = "Fruit";
                    Fruit.st = "strawberry";
                }
                else if(lv.getItemAtPosition(i).equals("Sweetsop"))
                {
                    main = "Fruit";
                    Fruit.st = "sweetsop";
                }
                else if(lv.getItemAtPosition(i).equals("Tablet"))
                {
                    main = "Electronic";
                    Electronic.stritem = "tablet";
                }
                else if(lv.getItemAtPosition(i).equals("Telephone"))
                {
                    main = "Electronic";
                    Electronic.stritem = "telephone";
                }
                else if(lv.getItemAtPosition(i).equals("Television"))
                {
                    main = "Electronic";
                    Electronic.stritem = "television";
                }
                else if(lv.getItemAtPosition(i).equals("Tennis"))
                {
                    main = "Sport";
                    Sport.st = "tennis";
                }
                else if(lv.getItemAtPosition(i).equals("Tiger"))
                {
                    main = "Animal";
                    Animal.astr = "tiger";
                }
                else if(lv.getItemAtPosition(i).equals("Tired"))
                {
                    main = "Emotion";
                    Emotion.estr = "tired";
                }
                else if(lv.getItemAtPosition(i).equals("Tomato"))
                {
                    main = "Vegetable";
                    Vegetable.vstr = "tomato";
                }
                else if(lv.getItemAtPosition(i).equals("Vet"))
                {
                    main = "Occupation";
                    Occupation.stOcc = "vet";
                }
                else if(lv.getItemAtPosition(i).equals("Volleyball"))
                {
                    main = "Sport";
                    Sport.st = "volleyball";
                }
                else if(lv.getItemAtPosition(i).equals("Watermelon"))
                {
                    main = "Fruit";
                    Fruit.st = "watermelon";
                }
                else if(lv.getItemAtPosition(i).equals("Weightlifting"))
                {
                    main = "Sport";
                    Sport.st = "weightlifting";
                }
                else if(lv.getItemAtPosition(i).equals("Wife"))
                {
                    main = "Family";
                    Family.fstr = "wife";
                }
                else if(lv.getItemAtPosition(i).equals("Zebra"))
                {
                    main = "Animal";
                    Animal.astr = "zebra";
                }
                Intent img=new Intent(getApplication(),Image.class);
                startActivity(img);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(Setting.color=="black")
        {
            linearLayout=(LinearLayout)findViewById(R.id.main);
            linearLayout.setBackgroundColor(Color.BLACK);
        }
        else if(Setting.color=="white")
        {
            linearLayout=(LinearLayout)findViewById(R.id.main);
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        else if(Setting.color=="cyan")
        {
            linearLayout=(LinearLayout)findViewById(R.id.main);
            linearLayout.setBackgroundColor(Color.CYAN);
        }
        else if(Setting.color=="green")
        {
            linearLayout=(LinearLayout)findViewById(R.id.main);
            linearLayout.setBackgroundColor(Color.GREEN);
        }
        if(Setting.color=="blue")
        {
            linearLayout=(LinearLayout)findViewById(R.id.main);
            linearLayout.setBackgroundColor(Color.BLUE);
        }
        else if(Setting.color=="pink")
        {
            linearLayout=(LinearLayout)findViewById(R.id.main);
            linearLayout.setBackgroundColor(getResources().getColor(R.color.pink));
        }
        else if(Setting.color=="red")
        {
            linearLayout=(LinearLayout)findViewById(R.id.main);
            linearLayout.setBackgroundColor(Color.RED);
        }
        else if(Setting.color=="yellow")
        {
            linearLayout=(LinearLayout)findViewById(R.id.main);
            linearLayout.setBackgroundColor(Color.YELLOW);
        }
        if(Setting.color=="gray")
        {
            linearLayout=(LinearLayout)findViewById(R.id.main);
            linearLayout.setBackgroundColor(Color.GRAY);
        }
        else if(Setting.color=="purple")
        {
            linearLayout=(LinearLayout)findViewById(R.id.main);
            linearLayout.setBackgroundColor(Color.MAGENTA);
        }
        else if(Setting.color=="orange")
        {
            linearLayout=(LinearLayout)findViewById(R.id.main);
            linearLayout.setBackgroundColor(getResources().getColor(R.color.orange));
        }

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation__drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent setting=new Intent(getApplicationContext(),Setting.class);
            startActivity(setting);
            return true;
        }
        if(id==R.id.about)
        {
            Intent about=new Intent(getApplicationContext(),AboutUs.class);
            startActivity(about);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
