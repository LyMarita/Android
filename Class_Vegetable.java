package com.rupp.mrt.ditionary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 3/31/2016.
 */
public class Class_Vegetable extends BaseAdapter {
    private final Activity context;
    private final String[] names;
    static class ViewHolder{
        public TextView text;
        public ImageView image;
    }
    public Class_Vegetable(Activity context,String[] names){
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
        if(s.startsWith("Broccoli"))
            holder.image.setImageResource(R.drawable.broccoli);
        else if(s.startsWith("Cabbage"))
            holder.image.setImageResource(R.drawable.cabbage);
        else if(s.startsWith("Carrot"))
            holder.image.setImageResource(R.drawable.carrot);
        else if(s.startsWith("Cauliflower"))
            holder.image.setImageResource(R.drawable.cauliflower);
        else if(s.startsWith("Cucumber"))
            holder.image.setImageResource(R.drawable.cucumber);
        else if(s.startsWith("Garlic"))
            holder.image.setImageResource(R.drawable.garlic);
        else if(s.startsWith("Lettuce"))
            holder.image.setImageResource(R.drawable.lettuce);
        else if(s.startsWith("Mushroom"))
            holder.image.setImageResource(R.drawable.musroom);
        else if(s.startsWith("Pepper"))
            holder.image.setImageResource(R.drawable.peppers);
        else if(s.startsWith("Tomato"))
            holder.image.setImageResource(R.drawable.tomato);
        return rowView;
    }
}
