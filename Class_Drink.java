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
public class Class_Drink extends BaseAdapter {
    private final Activity context;
    private final String[] names;
    static class ViewHolder{
        public TextView text;
        public ImageView image;
    }
    public Class_Drink(Activity context,String[] names){
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
        if(s.startsWith("Coca Cola"))
            holder.image.setImageResource(R.drawable.cocacola);
        else if(s.startsWith("Coffee"))
            holder.image.setImageResource(R.drawable.coffee);
        else if(s.startsWith("Milk"))
            holder.image.setImageResource(R.drawable.milk);
        else if(s.startsWith("Orange juice"))
            holder.image.setImageResource(R.drawable.orange_juice);
        else if(s.startsWith("Soda"))
            holder.image.setImageResource(R.drawable.soda);
        else if(s.startsWith("Pure water"))
            holder.image.setImageResource(R.drawable.water);
        return rowView;
    }
}
