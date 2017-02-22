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
public class Class_Electronic extends BaseAdapter{
    private final Activity context;
    private final String[] names;
    static class ViewHolder{
        public TextView text;
        public ImageView image;
    }
    public Class_Electronic(Activity context,String[] names){
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
        if(s.startsWith("Mobile Phone"))
            holder.image.setImageResource(R.drawable.mobile_phone);
       if(s.startsWith("Television"))
            holder.image.setImageResource(R.drawable.television);
        if(s.startsWith("Telephone"))
            holder.image.setImageResource(R.drawable.telephone);
        if(s.startsWith("Camcorder"))
            holder.image.setImageResource(R.drawable.camcorder);
        if(s.startsWith("Camera"))
            holder.image.setImageResource(R.drawable.camera);
        if(s.startsWith("Computer"))
            holder.image.setImageResource(R.drawable.computer);
        if(s.startsWith("Laptop"))
            holder.image.setImageResource(R.drawable.laptop);
        if(s.startsWith("Printer"))
            holder.image.setImageResource(R.drawable.printer);
        if(s.startsWith("Tablet"))
            holder.image.setImageResource(R.drawable.tablet);
        if(s.startsWith("Smart Watch"))
            holder.image.setImageResource(R.drawable.smart_watch);
        if(s.startsWith("Speaker"))
            holder.image.setImageResource(R.drawable.speaker);
        return rowView;
    }

}
