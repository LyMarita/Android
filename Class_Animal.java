package com.rupp.mrt.ditionary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 3/29/2016.
 */
public class Class_Animal extends BaseAdapter {
    private final Activity context;
    private final String[] names;
    static class ViewHolder{
        public TextView text;
        public ImageView image;
    }
    public Class_Animal(Activity context,String[] names){
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
        if(s.startsWith("Cat"))
            holder.image.setImageResource(R.drawable.cat);
        else if(s.startsWith("Chicken"))
            holder.image.setImageResource(R.drawable.chicken);
        else if(s.startsWith("Cow"))
            holder.image.setImageResource(R.drawable.cow);
        else if(s.startsWith("Crocodile"))
            holder.image.setImageResource(R.drawable.crocodile);
        else if(s.startsWith("Dog"))
            holder.image.setImageResource(R.drawable.dog);
        else if(s.startsWith("Duck"))
            holder.image.setImageResource(R.drawable.duck);
        else if(s.startsWith("Fish"))
            holder.image.setImageResource(R.drawable.fish);
        else if(s.startsWith("Snake"))
            holder.image.setImageResource(R.drawable.snake);
        else if(s.startsWith("Tiger"))
            holder.image.setImageResource(R.drawable.tiger);
        else if(s.startsWith("Zebra"))
            holder.image.setImageResource(R.drawable.zebra);
        return rowView;
    }
}
