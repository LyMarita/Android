package com.rupp.mrt.ditionary;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

public class Emotion extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    static String estr;
    ListView lv;
    LinearLayout linearLayout;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation__drawer);
        ListView lst=(ListView)findViewById(R.id.MyListView);
        final String[] values=new String[]{getResources().getString(R.string.afraid),getResources().getString(R.string.angry),getResources().getString(R.string.bored),
                getResources().getString(R.string.cry),getResources().getString(R.string.happy),getResources().getString(R.string.hurt),
                getResources().getString(R.string.lonely),getResources().getString(R.string.sad),getResources().getString(R.string.tired)};
        Class_Emotion list=new Class_Emotion(this,values);
        lst.setAdapter(list);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(Family.this, values[i], Toast.LENGTH_LONG).show();
                if (values[i].equals(getResources().getString(R.string.angry)))
                    estr = "angry";
                else if (values[i].equals(getResources().getString(R.string.bored)))
                    estr = "bored";
                else if (values[i].equals(getResources().getString(R.string.cry)))
                    estr = "cry";
                else if (values[i].equals(getResources().getString(R.string.happy)))
                    estr = "happy";
                else if (values[i].equals(getResources().getString(R.string.hurt)))
                    estr = "hurt";
                else if (values[i].equals(getResources().getString(R.string.lonely)))
                    estr = "lonely";
                else if (values[i].equals(getResources().getString(R.string.afraid)))
                    estr = "afraid";
                else if (values[i].equals(getResources().getString(R.string.sad)))
                    estr = "sad";
                else if (values[i].equals(getResources().getString(R.string.tired)))
                    estr = "tired";
                Intent Img = new Intent(getApplication(), Image.class);
                startActivity(Img);
            }

        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        lv=(ListView)findViewById(R.id.nv_list);
        final String[] value=new String[]{"Afraid","Angry","Apple","Archery","Aunt","Banana","Basketball","Baseball","Bored","Bowling","Broccoli","Businessman",
                "Cabbage","Camcorder", "Camera","Carrot","Cat","Cauliflower","Chef","Chicken","Cleaner","Coffee","Computer","Cow",
                "Crocodile","Cry","Cucumber","Daughter","Doctor","Dog","Duck","Durian","Farmer","Father","Fish","Football","Garlic",
                "Golf","Grandmother","Grape","Guava","Happy","Horse racing","Hurt","Husband","Jackfruit","Jujube","Kiwi","Laptop","Lawyer","Lettuce",
                "Lonely","Lychee","Mango","Mangosteen","Milk","Mobile Phone","Mother","Mushroom","Orange","Orange Juice","Painter","Papaya", "Pepper",
                "Persimmon","Pineapple","Pomegranate","Printer","Programmer","Pure water","Rambutan","Sad","Sapodilla","Scientist","Sister","Smart watch","Snake",
                "Soda","Soldier","Son","Speaker","Strawberry","Sweetsop","Tablet","Telephone","Television","Tennis","Tiger","Tired","Tomato","Vet",
                "Volleyball","Watermelon","Weightlifting","Wife","Zebra"};
        SearchView inputsearch=(SearchView)findViewById(R.id.searchView);
        final ArrayAdapter<String> adapter;
        adapter=new ArrayAdapter<>(this,R.layout.list_search,R.id.lblSearch,value);
        lv.setAdapter(adapter);
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

                if (lv.getItemAtPosition(i).equals("Afraid")) {
                    List_Menu.main = "Emotion";
                    Emotion.estr = "afraid";
                } else if (lv.getItemAtPosition(i).equals("Angry")) {
                    List_Menu.main = "Emotion";
                    Emotion.estr = "angry";
                } else if (lv.getItemAtPosition(i).equals("Apple")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "apple";
                } else if (lv.getItemAtPosition(i).equals("Archery")) {
                    List_Menu.main = "Sport";
                    Sport.st = "archery";
                } else if (lv.getItemAtPosition(i).equals("Aunt")) {
                    List_Menu.main = "Family";
                    Family.fstr = "aunt";
                } else if (lv.getItemAtPosition(i).equals("Banana")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "banana";
                } else if (lv.getItemAtPosition(i).equals("Basketball")) {
                    List_Menu.main = "Sport";
                    Sport.st = "basketball";
                } else if (lv.getItemAtPosition(i).equals("Baseball")) {
                    List_Menu.main = "Sport";
                    Sport.st = "baseball";
                } else if (lv.getItemAtPosition(i).equals("Bored")) {
                    List_Menu.main = "Emotion";
                    Emotion.estr = "bored";
                } else if (lv.getItemAtPosition(i).equals("Bowling")) {
                    List_Menu.main = "Sport";
                    Sport.st = "bowling";
                } else if (lv.getItemAtPosition(i).equals("Broccoli")) {
                    List_Menu.main = "Vegetable";
                    Vegetable.vstr = "broccoli";
                }
                if (lv.getItemAtPosition(i).equals("Businessman")) {
                    List_Menu.main = "Occupation";
                    Occupation.stOcc = "businessman";
                } else if (lv.getItemAtPosition(i).equals("Cabbage")) {
                    List_Menu.main = "Vegetable";
                    Vegetable.vstr = "cabbage";
                } else if (lv.getItemAtPosition(i).equals("Camcorder")) {
                    List_Menu.main = "Electronic";
                    Electronic.stritem = "camcorder";
                } else if (lv.getItemAtPosition(i).equals("Camera")) {
                    List_Menu.main = "Electronic";
                    Electronic.stritem = "camera";
                } else if (lv.getItemAtPosition(i).equals("Carrot")) {
                    List_Menu.main = "Vegetable";
                    Vegetable.vstr = "carrot";
                } else if (lv.getItemAtPosition(i).equals("Cat")) {
                    List_Menu.main = "Animal";
                    Animal.astr = "cat";
                } else if (lv.getItemAtPosition(i).equals("Cauliflower")) {
                    List_Menu.main = "Vegetable";
                    Vegetable.vstr = "cauliflower";
                } else if (lv.getItemAtPosition(i).equals("Chef")) {
                    List_Menu.main = "Occupation";
                    Occupation.stOcc = "chef";
                } else if (lv.getItemAtPosition(i).equals("Chicken")) {
                    List_Menu.main = "Animal";
                    Animal.astr = "chicken";
                } else if (lv.getItemAtPosition(i).equals("Cleaner")) {
                    List_Menu.main = "Occupation";
                    Occupation.stOcc = "cleaner";
                } else if (lv.getItemAtPosition(i).equals("Coca Cola")) {
                    List_Menu.main = "Drink";
                    Drink.dstr = "coco_cola";
                } else if (lv.getItemAtPosition(i).equals("Coffee")) {
                    List_Menu.main = "Drink";
                    Drink.dstr = "coffee";
                } else if (lv.getItemAtPosition(i).equals("Computer")) {
                    List_Menu.main = "Electronic";
                    Electronic.stritem = "computer";
                } else if (lv.getItemAtPosition(i).equals("Cow")) {
                    List_Menu.main = "Animal";
                    Animal.astr = "cow";
                } else if (lv.getItemAtPosition(i).equals("Crocodile")) {
                    List_Menu.main = "Animal";
                    Animal.astr = "crocodile";
                } else if (lv.getItemAtPosition(i).equals("Cry")) {
                    List_Menu.main = "Emotion";
                    Emotion.estr = "cry";
                } else if (lv.getItemAtPosition(i).equals("Cucumber")) {
                    List_Menu.main = "Vegetable";
                    Vegetable.vstr = "cucumber";
                }
                if (lv.getItemAtPosition(i).equals("Daughter")) {
                    List_Menu.main = "Family";
                    Family.fstr = "daughter";
                } else if (lv.getItemAtPosition(i).equals("Doctor")) {
                    List_Menu.main = "Occupation";
                    Occupation.stOcc = "doctor";
                } else if (lv.getItemAtPosition(i).equals("Dog")) {
                    List_Menu.main = "Animal";
                    Animal.astr = "dog";
                } else if (lv.getItemAtPosition(i).equals("Duck")) {
                    List_Menu.main = "Animal";
                    Animal.astr = "duck";
                } else if (lv.getItemAtPosition(i).equals("Durian")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "durian";
                } else if (lv.getItemAtPosition(i).equals("Farmer")) {
                    List_Menu.main = "Occupation";
                    Occupation.stOcc = "farmer";
                } else if (lv.getItemAtPosition(i).equals("Father")) {
                    List_Menu.main = "Family";
                    Family.fstr = "father";
                } else if (lv.getItemAtPosition(i).equals("Fish")) {
                    List_Menu.main = "Animal";
                    Animal.astr = "fish";
                }
                if (lv.getItemAtPosition(i).equals("Football")) {
                    List_Menu.main = "Sport";
                    Sport.st = "football";
                } else if (lv.getItemAtPosition(i).equals("Fruit")) {
                    List_Menu.main = "Family";
                    Family.fstr = "daughter";
                } else if (lv.getItemAtPosition(i).equals("Garlic")) {
                    List_Menu.main = "Vegetable";
                    Vegetable.vstr = "garlic";
                } else if (lv.getItemAtPosition(i).equals("Golf")) {
                    List_Menu.main = "Sport";
                    Sport.st = "golf";
                } else if (lv.getItemAtPosition(i).equals("Grandmother")) {
                    List_Menu.main = "Family";
                    Family.fstr = "grandmother";
                } else if (lv.getItemAtPosition(i).equals("Grape")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "grape";
                } else if (lv.getItemAtPosition(i).equals("Guava")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "guava";
                } else if (lv.getItemAtPosition(i).equals("Happy")) {
                    List_Menu.main = "Emotion";
                    Emotion.estr = "happy";
                }
                if (lv.getItemAtPosition(i).equals("Horse racing")) {
                    List_Menu.main = "Sport";
                    Sport.st = "horse_racing";
                } else if (lv.getItemAtPosition(i).equals("Hurt")) {
                    List_Menu.main = "Emotion";
                    Emotion.estr = "hurt";
                } else if (lv.getItemAtPosition(i).equals("Husband")) {
                    List_Menu.main = "Family";
                    Family.fstr = "husband";
                } else if (lv.getItemAtPosition(i).equals("Jackfruit")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "jackfruit";
                } else if (lv.getItemAtPosition(i).equals("Jujube")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "jujube";
                } else if (lv.getItemAtPosition(i).equals("Kiwi")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "kiwi";
                } else if (lv.getItemAtPosition(i).equals("Laptop")) {
                    List_Menu.main = "Electronic";
                    Electronic.stritem = "laptop";
                } else if (lv.getItemAtPosition(i).equals("Lawyer")) {
                    List_Menu.main = "Occupation";
                    Occupation.stOcc = "lawyer";
                } else if (lv.getItemAtPosition(i).equals("Lettuce")) {
                    List_Menu.main = "Vegetable";
                    Vegetable.vstr = "lettuce";
                }
                if (lv.getItemAtPosition(i).equals("Lonely")) {
                    List_Menu.main = "Emotion";
                    Emotion.estr = "lonely";
                } else if (lv.getItemAtPosition(i).equals("Lychee")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "lychee";
                } else if (lv.getItemAtPosition(i).equals("Mango")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "mango";
                } else if (lv.getItemAtPosition(i).equals("Mangosteen")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "mangosteen";
                } else if (lv.getItemAtPosition(i).equals("Milk")) {
                    List_Menu.main = "Drink";
                    Drink.dstr = "milk";
                } else if (lv.getItemAtPosition(i).equals("Mobile Phone")) {
                    List_Menu.main = "Electronic";
                    Electronic.stritem = "mobile_phone";
                } else if (lv.getItemAtPosition(i).equals("Mother")) {
                    List_Menu.main = "Family";
                    Family.fstr = "mother";
                } else if (lv.getItemAtPosition(i).equals("Mushroom")) {
                    List_Menu.main = "Vegetable";
                    Vegetable.vstr = "mushroom";
                } else if (lv.getItemAtPosition(i).equals("Orange")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "orange";
                }
                if (lv.getItemAtPosition(i).equals("Orange Juice")) {
                    List_Menu.main = "Drink";
                    Drink.dstr = "orange_juice";
                } else if (lv.getItemAtPosition(i).equals("Painter")) {
                    List_Menu.main = "Occupation";
                    Occupation.stOcc = "painter";
                } else if (lv.getItemAtPosition(i).equals("Papaya")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "papaya";
                } else if (lv.getItemAtPosition(i).equals("Pepper")) {
                    List_Menu.main = "Vegetable";
                    Vegetable.vstr = "pepper";
                } else if (lv.getItemAtPosition(i).equals("Persimmon")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "persimmon";
                } else if (lv.getItemAtPosition(i).equals("Pineapple")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "pineapple";
                } else if (lv.getItemAtPosition(i).equals("Pomegranate")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "pomegranate";
                } else if (lv.getItemAtPosition(i).equals("Printer")) {
                    List_Menu.main = "Electronic";
                    Electronic.stritem = "printer";
                } else if (lv.getItemAtPosition(i).equals("Programmer")) {
                    List_Menu.main = "Occupation";
                    Occupation.stOcc = "programmer";
                } else if (lv.getItemAtPosition(i).equals("Pure water")) {
                    List_Menu.main = "Drink";
                    Drink.dstr = "pure_water";
                }
                if (lv.getItemAtPosition(i).equals("Rambutan")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "rambutan";
                } else if (lv.getItemAtPosition(i).equals("Sad")) {
                    List_Menu.main = "Emotion";
                    Emotion.estr = "sad";
                } else if (lv.getItemAtPosition(i).equals("Sapodilla")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "sapodilla";
                } else if (lv.getItemAtPosition(i).equals("Scientist")) {
                    List_Menu.main = "Occupation";
                    Occupation.stOcc = "scientist";
                } else if (lv.getItemAtPosition(i).equals("Sister")) {
                    List_Menu.main = "Family";
                    Family.fstr = "sister";
                } else if (lv.getItemAtPosition(i).equals("Smart watch")) {
                    List_Menu.main = "Electronic";
                    Electronic.stritem = "smart_watch";
                } else if (lv.getItemAtPosition(i).equals("Snake")) {
                    List_Menu.main = "Animal";
                    Animal.astr = "snake";
                } else if (lv.getItemAtPosition(i).equals("Soda")) {
                    List_Menu.main = "Drink";
                    Drink.dstr = "soda";
                } else if (lv.getItemAtPosition(i).equals("Soldier")) {
                    List_Menu.main = "Occupation";
                    Occupation.stOcc = "soldier";
                } else if (lv.getItemAtPosition(i).equals("Son")) {
                    List_Menu.main = "Family";
                    Family.fstr = "son";
                }
                if (lv.getItemAtPosition(i).equals("Speaker")) {
                    List_Menu.main = "Electronic";
                    Electronic.stritem = "speaker";
                } else if (lv.getItemAtPosition(i).equals("Strawberry")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "strawberry";
                } else if (lv.getItemAtPosition(i).equals("Sweetsop")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "sweetsop";
                } else if (lv.getItemAtPosition(i).equals("Tablet")) {
                    List_Menu.main = "Electronic";
                    Electronic.stritem = "tablet";
                } else if (lv.getItemAtPosition(i).equals("Telephone")) {
                    List_Menu.main = "Electronic";
                    Electronic.stritem = "telephone";
                } else if (lv.getItemAtPosition(i).equals("Television")) {
                    List_Menu.main = "Electronic";
                    Electronic.stritem = "television";
                } else if (lv.getItemAtPosition(i).equals("Tennis")) {
                    List_Menu.main = "Sport";
                    Sport.st = "tennis";
                } else if (lv.getItemAtPosition(i).equals("Tiger")) {
                    List_Menu.main = "Animal";
                    Animal.astr = "tiger";
                } else if (lv.getItemAtPosition(i).equals("Tired")) {
                    List_Menu.main = "Emotion";
                    Emotion.estr = "tired";
                } else if (lv.getItemAtPosition(i).equals("Tomato")) {
                    List_Menu.main = "Vegetable";
                    Vegetable.vstr = "tomato";
                } else if (lv.getItemAtPosition(i).equals("Vet")) {
                    List_Menu.main = "Occupation";
                    Occupation.stOcc = "vet";
                } else if (lv.getItemAtPosition(i).equals("Volleyball")) {
                    List_Menu.main = "Sport";
                    Sport.st = "volleyball";
                } else if (lv.getItemAtPosition(i).equals("Watermelon")) {
                    List_Menu.main = "Fruit";
                    Fruit.st = "watermelon";
                } else if (lv.getItemAtPosition(i).equals("Weightlifting")) {
                    List_Menu.main = "Sport";
                    Sport.st = "weightlifting";
                } else if (lv.getItemAtPosition(i).equals("Wife")) {
                    List_Menu.main = "Family";
                    Family.fstr = "wife";
                } else if (lv.getItemAtPosition(i).equals("Zebra")) {
                    List_Menu.main = "Animal";
                    Animal.astr = "zebra";
                }
                Intent img = new Intent(getApplication(), Image.class);
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
    public boolean onCreateOptionsMenu(Menu menu) {
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
