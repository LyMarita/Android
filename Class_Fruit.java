package com.rupp.mrt.ditionary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 3/25/2016.
 */
public class Class_Fruit extends BaseAdapter {
    private final Activity context;
    private final String[] names;
    static class ViewHolder{
        public TextView text;
        public ImageView image;
    }
    public Class_Fruit(Activity context,String[] names){
        this.context=context;
        this.names=names;
    }
    @Override
    public int getCount() {
        return names.length;
    }


    @Override
    public Object getItem(int position) {
        return names[position];
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView=convertView;
        if(rowView==null){
            LayoutInflater inflater=context.getLayoutInflater();
            rowView=inflater.inflate(R.layout.list_item,null);
            ViewHolder viewHolder=new ViewHolder();
            viewHolder.text=(TextView) rowView.findViewById(R.id.label);
            viewHolder.image = (ImageView) rowView.findViewById(R.id.icon);
            rowView.setTag(viewHolder);
        }
        ViewHolder holder = (ViewHolder) rowView.getTag();
        String s = names[position];
        holder.text.setText(s);
        if(s.startsWith("Apple"))
            holder.image.setImageResource(R.drawable.apple);
        if(s.startsWith("Banana"))
            holder.image.setImageResource(R.drawable.banana);
        if(s.startsWith("Durian"))
            holder.image.setImageResource(R.drawable.durian);
        if(s.startsWith("Grape"))
            holder.image.setImageResource(R.drawable.grape);
        if(s.startsWith("Guava"))
            holder.image.setImageResource(R.drawable.guava);
        if(s.startsWith("Jackfruit"))
            holder.image.setImageResource(R.drawable.jackfruit);
        if(s.startsWith("Jujube"))
            holder.image.setImageResource(R.drawable.jujube);
        if(s.startsWith("Kiwi"))
            holder.image.setImageResource(R.drawable.kiwi);
        if(s.startsWith("Lychee"))
            holder.image.setImageResource(R.drawable.lychee);
        if(s.startsWith("Mango"))
            holder.image.setImageResource(R.drawable.mango);
        if(s.startsWith("Mangosteen"))
            holder.image.setImageResource(R.drawable.mangosteen);
        if(s.startsWith("Orange"))
            holder.image.setImageResource(R.drawable.orange);
        if(s.startsWith("Papaya"))
            holder.image.setImageResource(R.drawable.papaya);
        if(s.startsWith("Persimmon"))
            holder.image.setImageResource(R.drawable.persimmon);
        if(s.startsWith("Pineapple"))
            holder.image.setImageResource(R.drawable.pineapple);
        if(s.startsWith("Pomegranate"))
            holder.image.setImageResource(R.drawable.pomegranate);
        if(s.startsWith("Rambutan"))
            holder.image.setImageResource(R.drawable.rambutan);
        if(s.startsWith("Sapodilla"))
            holder.image.setImageResource(R.drawable.sapodilla);
        if(s.startsWith("Strawberry"))
            holder.image.setImageResource(R.drawable.strawberries);
        if(s.startsWith("Sweetsop"))
            holder.image.setImageResource(R.drawable.sweetsop);
        if(s.startsWith("Watermelon"))
            holder.image.setImageResource(R.drawable.watermelon);
        return rowView;
    }
}
