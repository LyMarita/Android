package com.rupp.mrt.ditionary;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Image extends AppCompatActivity {
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
             //Electronic
        if(List_Menu.main.equals("Electronic")) {
            if (Electronic.stritem.equals("camcorder")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.camcorder);
                add(getResources().getString(R.string.camcorder));

            }
            if (Electronic.stritem.equals("camera")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.camera);
                add(getResources().getString(R.string.camera));

            }

            if (Electronic.stritem.equals("computer")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.computer);
                add(getResources().getString(R.string.computer));

            }
            if (Electronic.stritem.equals("laptop")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.laptop);
                add(getResources().getString(R.string.laptop));

            }

            if (Electronic.stritem.equals("mobile_phone")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.mobile_phone);
                add(getResources().getString(R.string.mobile_phone));

            }
            if (Electronic.stritem.equals("printer")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.printer);
                add(getResources().getString(R.string.printer));
            }
            if (Electronic.stritem.equals("smart_watch")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.smart_watch);
                add(getResources().getString(R.string.smart_watch));
            }
            if (Electronic.stritem.equals("speaker")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.speaker);
                add(getResources().getString(R.string.speaker));
            }
            if (Electronic.stritem.equals("tablet")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.tablet);
                add(getResources().getString(R.string.tablet));
            }
            if (Electronic.stritem.equals("television")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.television);
                add(getResources().getString(R.string.television));
            }
            if (Electronic.stritem.equals("telephone")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.telephone);
                add(getResources().getString(R.string.telephone));
            }
        }
        else if(List_Menu.main.equals("Fruit")){

            if (Fruit.st.equals("apple")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.apple);
                add(getResources().getString(R.string.apple));
            }
            if (Fruit.st.equals("banana")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.banana);
                add(getResources().getString(R.string.banana));
            }
            if (Fruit.st.equals("durian")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.durian);
                add(getResources().getString(R.string.durian));
            }
            if (Fruit.st.equals("grape")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.grape);
                add(getResources().getString(R.string.grape));
            }
            if (Fruit.st.equals("guava")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.guava);
                add(getResources().getString(R.string.guava));
            }
            if (Fruit.st.equals("jackfruit")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.jackfruit);
                add(getResources().getString(R.string.jackfruit));
            }
            if (Fruit.st.equals("jujube")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.jujube);
                add(getResources().getString(R.string.jujube));
            }
            if (Fruit.st.equals("kiwi")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.kiwi);
                add(getResources().getString(R.string.kiwi));
            }
            if (Fruit.st.equals("lychee")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.lychee);
                add(getResources().getString(R.string.lychee));
            }
            if (Fruit.st.equals("mango")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.mango);
                add(getResources().getString(R.string.mango));
            }  if (Fruit.st.equals("mangosteen")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.mangosteen);
                add(getResources().getString(R.string.mangosteen));
            }
            if (Fruit.st.equals("orange")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.orange);
                add(getResources().getString(R.string.orange));
            }
            if (Fruit.st.equals("papaya")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.papaya);
                add(getResources().getString(R.string.papaya));
            }
            if (Fruit.st.equals("persimmon")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.persimmon);
                add(getResources().getString(R.string.persimmon));
            }
            if (Fruit.st.equals("pineapple")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.pineapple);
                add(getResources().getString(R.string.pineapple));
            }
            if (Fruit.st.equals("pomegranate")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.pomegranate);
                add(getResources().getString(R.string.pomegranate));
            }  if (Fruit.st.equals("rambutan")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.rambutan);
                add(getResources().getString(R.string.rambutan));
            }
            if (Fruit.st.equals("sapodilla")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.sapodilla);
                add(getResources().getString(R.string.sapodilla));
            }
            if (Fruit.st.equals("strawberry")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.strawberries);
                add(getResources().getString(R.string.strawberry));
            }
            if (Fruit.st.equals("sweetsop")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.sweetsop);
                add(getResources().getString(R.string.sweetsop));
            }
            if (Fruit.st.equals("watermelon")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.watermelon);
                add(getResources().getString(R.string.watermelon));
            }
        }
        else if(List_Menu.main.equals("Occupation"))
        {
            if (Occupation.stOcc.equals("businessman")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.businessman);
                add(getResources().getString(R.string.businessman));
            }
            if (Occupation.stOcc.equals("chef")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.chef);
                add(getResources().getString(R.string.chef));
            }
            if (Occupation.stOcc.equals("cleaner")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.cleaner);
                add(getResources().getString(R.string.cleaner));
            }
            if (Occupation.stOcc.equals("doctor")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.doctor);
                add(getResources().getString(R.string.doctor));
            }
            if (Occupation.stOcc.equals("farmer")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.farmer);
                add(getResources().getString(R.string.farmer));
            }
            if (Occupation.stOcc.equals("lawyer")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.lawyer);
                add(getResources().getString(R.string.lawyer));
            }
            if (Occupation.stOcc.equals("painter")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.painter);
                add(getResources().getString(R.string.painter));
            }
            if (Occupation.stOcc.equals("programmer")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.programmer);
                add(getResources().getString(R.string.programmer));
            }
            if (Occupation.stOcc.equals("scientist")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.scientist);
                add(getResources().getString(R.string.scientist));
            }
            if (Occupation.stOcc.equals("soldier")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.soldier);
                add(getResources().getString(R.string.soldier));
            }
            if (Occupation.stOcc.equals("vet")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.vet);
                add(getResources().getString(R.string.vet));
            }
        }
        else if(List_Menu.main.equals("Sport"))
        {
            if (Sport.st.equals("football")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.football);
                add(getResources().getString(R.string.football));
            }
            if (Sport.st.equals("baseball")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.baseball);
                add(getResources().getString(R.string.baseball));
            }
            if (Sport.st.equals("basketball")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.basketball);
                add(getResources().getString(R.string.basketball));
            }
            if (Sport.st.equals("volleyball")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.volleyball);
                add(getResources().getString(R.string.volleyball));
            }
            if (Sport.st.equals("bowling")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.bowling);
                add(getResources().getString(R.string.bowling));
            }
            if (Sport.st.equals("weightlifting")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.weightlifting);
                add(getResources().getString(R.string.weightlifting));
            }
            if (Sport.st.equals("horse_racing")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.horse_racing);
                add(getResources().getString(R.string.horse_racing));
            }
            if (Sport.st.equals("tennis")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.tennis);
                add(getResources().getString(R.string.tennis));
            }
            if (Sport.st.equals("golf")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.golf);
                add(getResources().getString(R.string.golf));
            }
            if (Sport.st.equals("archery")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.archery);
                add(getResources().getString(R.string.archery));
            }
        }
        else if(List_Menu.main.equals("Family"))
        {
            if (Family.fstr.equals("aunt")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.aunt);
                add(getResources().getString(R.string.aunt));
            }
            if (Family.fstr.equals("daughter")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.daugter);
                add(getResources().getString(R.string.daughter));
            }
            if (Family.fstr.equals("father")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.father);
                add(getResources().getString(R.string.father));
            }
            if (Family.fstr.equals("grandmother")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.grandmother);
                add(getResources().getString(R.string.grandmother));
            }
            if (Family.fstr.equals("husband")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.husband);
                add(getResources().getString(R.string.husband));
            }
            if (Family.fstr.equals("mother")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.mother);
                add(getResources().getString(R.string.mother));
            }
            if (Family.fstr.equals("sister")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.sister);
                add(getResources().getString(R.string.sister));
            }
            if (Family.fstr.equals("son")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.son);
                add(getResources().getString(R.string.son));
            }
            if (Family.fstr.equals("wife")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.wife);
                add(getResources().getString(R.string.wife));
            }
        }
        else if(List_Menu.main.equals("Animal"))
        {
            if (Animal.astr.equals("cat")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.cat);
                add(getResources().getString(R.string.cat));
            }
            if (Animal.astr.equals("chicken")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.chicken);
                add(getResources().getString(R.string.chicken));
            }
            if (Animal.astr.equals("cow")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.cow);
                add(getResources().getString(R.string.cow));
            }
            if (Animal.astr.equals("crocodile")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.crocodile);
                add(getResources().getString(R.string.crocodile));
            }
            if (Animal.astr.equals("dog")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.dog);
                add(getResources().getString(R.string.dog));
            }
            if (Animal.astr.equals("duck")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.duck);
                add(getResources().getString(R.string.duck));
            }
            if (Animal.astr.equals("fish")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.fish);
                add(getResources().getString(R.string.fish));
            }
            if (Animal.astr.equals("snake")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.snake);
                add(getResources().getString(R.string.snake));
            }
            if (Animal.astr.equals("tiger")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.tiger);
                add(getResources().getString(R.string.tiger));
            }
            if (Animal.astr.equals("zebra")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.zebra);
                add(getResources().getString(R.string.zebra));
            }
        }
        else if(List_Menu.main.equals("Drink"))
        {
            if (Drink.dstr.equals("coca_cola")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.cocacola);
                add(getResources().getString(R.string.coca_cola));
            }
            if (Drink.dstr.equals("coffee")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.coffee);
                add(getResources().getString(R.string.coffee));
            }
            if (Drink.dstr.equals("milk")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.milk);
                add(getResources().getString(R.string.milk));
            }
            if (Drink.dstr.equals("orange_juice")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.orange_juice);
                add(getResources().getString(R.string.orange_juice));
            }
            if (Drink.dstr.equals("soda")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.soda);
                add(getResources().getString(R.string.soda));
            }
            if (Drink.dstr.equals("pure_water")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.water);
                add(getResources().getString(R.string.pure_water));
            }
        }
        else if(List_Menu.main.equals("Vegetable"))
        {
            if (Vegetable.vstr.equals("broccoli")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.broccoli);
                add(getResources().getString(R.string.broccoli));
            }
            if (Vegetable.vstr.equals("cabbage")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.cabbage);
                add(getResources().getString(R.string.cabbage));
            }
            if (Vegetable.vstr.equals("carrot")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.carrot);
                add(getResources().getString(R.string.carrot));
            }
            if (Vegetable.vstr.equals("cauliflower")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.cauliflower);
                add(getResources().getString(R.string.cauliflower));
            }
            if (Vegetable.vstr.equals("cucumber")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.cucumber);
                add(getResources().getString(R.string.cucumber));
            }
            if (Vegetable.vstr.equals("garlic")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.garlic);
                add(getResources().getString(R.string.garlic));
            }
            if (Vegetable.vstr.equals("lettuce")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.lettuce);
                add(getResources().getString(R.string.lettuce));
            }
            if (Vegetable.vstr.equals("mushroom")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.musroom);
                add(getResources().getString(R.string.mushroom));
            }
            if (Vegetable.vstr.equals("pepper")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.peppers);
                add(getResources().getString(R.string.pepper));
            }
            if (Vegetable.vstr.equals("tomato")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.tomato);
                add(getResources().getString(R.string.tomato));
            }
        }
        else if(List_Menu.main.equals("Emotion"))
        {
            if (Emotion.estr.equals("angry")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.angry);
                add(getResources().getString(R.string.angry));
            }
            if (Emotion.estr.equals("bored")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.bored);
                add(getResources().getString(R.string.bored));
            }
            if (Emotion.estr.equals("cry")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.cry);
                add(getResources().getString(R.string.cry));
            }
            if (Emotion.estr.equals("happy")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.happy);
                add(getResources().getString(R.string.happy));
            }
            if (Emotion.estr.equals("hurt")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.hurt);
                add(getResources().getString(R.string.hurt));
            }
            if (Emotion.estr.equals("lonely")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.lonely);
                add(getResources().getString(R.string.lonely));
            }
            if (Emotion.estr.equals("afraid")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.nevorse);
                add(getResources().getString(R.string.afraid));
            }
            if (Emotion.estr.equals("sad")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.sad);
                add(getResources().getString(R.string.sad));
            }
            if (Emotion.estr.equals("tired")) {
                ((ImageView) findViewById(R.id.MImage)).setImageResource(R.drawable.tired);
                add(getResources().getString(R.string.tired));
            }
        }
    }

    public void add(String str) {
        ((TextView) findViewById(R.id.txtEN)).setText(str);
    }
    @Override
    protected void onStart() {
        super.onStart();
        if(Setting.color=="black")
        {
            linearLayout=(LinearLayout)findViewById(R.id.layout);
            linearLayout.setBackgroundColor(Color.BLACK);
        }
        else if(Setting.color=="white")
        {
            linearLayout=(LinearLayout)findViewById(R.id.layout);
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        else if(Setting.color=="cyan")
        {
            linearLayout=(LinearLayout)findViewById(R.id.layout);
            linearLayout.setBackgroundColor(Color.CYAN);
        }
        else if(Setting.color=="green")
        {
            linearLayout=(LinearLayout)findViewById(R.id.layout);
            linearLayout.setBackgroundColor(Color.GREEN);
        }
        if(Setting.color=="blue")
        {
            linearLayout=(LinearLayout)findViewById(R.id.layout);
            linearLayout.setBackgroundColor(Color.BLUE);
        }
        else if(Setting.color=="pink")
        {
            linearLayout=(LinearLayout)findViewById(R.id.layout);
            linearLayout.setBackgroundColor(getResources().getColor(R.color.pink));
        }
        else if(Setting.color=="red")
        {
            linearLayout=(LinearLayout)findViewById(R.id.layout);
            linearLayout.setBackgroundColor(Color.RED);
        }
        else if(Setting.color=="yellow")
        {
            linearLayout=(LinearLayout)findViewById(R.id.layout);
            linearLayout.setBackgroundColor(Color.YELLOW);
        }
        if(Setting.color=="gray")
        {
            linearLayout=(LinearLayout)findViewById(R.id.layout);
            linearLayout.setBackgroundColor(Color.GRAY);
        }
        else if(Setting.color=="purple")
        {
            linearLayout=(LinearLayout)findViewById(R.id.layout);
            linearLayout.setBackgroundColor(Color.MAGENTA);
        }
        else if(Setting.color=="orange")
        {
            linearLayout=(LinearLayout)findViewById(R.id.layout);
            linearLayout.setBackgroundColor(getResources().getColor(R.color.orange));
        }
    }

    }