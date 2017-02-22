package com.rupp.mrt.ditionary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 3/23/2016.
 */
public class Class_List_Menu extends BaseAdapter {
    private final Activity context;
    private final String[] names;
    static class ViewHolder{
        public TextView text;
        public ImageView image;
    }
    public Class_List_Menu(Activity context,String[] names){
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
        if(s.startsWith("Sport"))
            holder.image.setImageResource(R.drawable.sport);
        if(s.startsWith("Electronic"))
            holder.image.setImageResource(R.drawable.electronic);
        if(s.startsWith("Family"))
            holder.image.setImageResource(R.drawable.family);
        if(s.startsWith("Fruit"))
            holder.image.setImageResource(R.drawable.fruit);
        if(s.startsWith("Occupation"))
           holder.image.setImageResource(R.drawable.occupation);
        if(s.startsWith("Animal"))
            holder.image.setImageResource(R.drawable.cat);
        if(s.startsWith("Beverage"))
            holder.image.setImageResource(R.drawable.drink);
        if(s.startsWith("Vegetable"))
            holder.image.setImageResource(R.drawable.vegetables);
        if(s.startsWith("Emotion"))
            holder.image.setImageResource(R.drawable.emotion);
        return rowView;
    }
}
