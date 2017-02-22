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
public class Class_Occupation extends BaseAdapter{
    private final Activity context;
    private final String[] names;
    static class ViewHolder{
        public TextView text;
        public ImageView image;
    }
    public Class_Occupation(Activity context,String[] names){
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
        if(s.startsWith("Businessman"))
            holder.image.setImageResource(R.drawable.businessman);
        if(s.startsWith("Chef"))
            holder.image.setImageResource(R.drawable.chef);
        if(s.startsWith("Cleaner"))
            holder.image.setImageResource(R.drawable.cleaner);
        if(s.startsWith("Doctor"))
            holder.image.setImageResource(R.drawable.doctor);
        if(s.startsWith("Farmer"))
            holder.image.setImageResource(R.drawable.farmer);
        if(s.startsWith("Lawyer"))
            holder.image.setImageResource(R.drawable.lawyer);
        if(s.startsWith("Painter"))
            holder.image.setImageResource(R.drawable.painter);
        if(s.startsWith("Programmer"))
            holder.image.setImageResource(R.drawable.programmer);
        if(s.startsWith("Scientist"))
            holder.image.setImageResource(R.drawable.scientist);
        if(s.startsWith("Soldier"))
            holder.image.setImageResource(R.drawable.soldier);
        if(s.startsWith("Vet"))
            holder.image.setImageResource(R.drawable.vet);
        return rowView;
    }
}
