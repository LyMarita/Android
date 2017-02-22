package com.rupp.mrt.ditionary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 3/24/2016.
 */
public class Class_Sport extends BaseAdapter {
    private final Activity context;
    private final String[] names;
    static class ViewHolder{
        public TextView text;
        public ImageView image;
    }
    public Class_Sport(Activity context,String[] names){
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
        if(s.startsWith("Football"))
            holder.image.setImageResource(R.drawable.football);
        if(s.startsWith("Baseball"))
            holder.image.setImageResource(R.drawable.baseball);
        if(s.startsWith("Basketball"))
            holder.image.setImageResource(R.drawable.basketball);
        if(s.startsWith("Volleyball"))
            holder.image.setImageResource(R.drawable.volleyball);
        if(s.startsWith("Bowling"))
            holder.image.setImageResource(R.drawable.bowling);
        if(s.startsWith("Weightlifting"))
            holder.image.setImageResource(R.drawable.weightlifting);
        if(s.startsWith("Horse Racing"))
            holder.image.setImageResource(R.drawable.horse_racing);
        if(s.startsWith("Tennis"))
            holder.image.setImageResource(R.drawable.tennis);
        if(s.startsWith("Golf"))
            holder.image.setImageResource(R.drawable.golf);
        if(s.startsWith("Archery"))
            holder.image.setImageResource(R.drawable.archery);
        return rowView;
    }
}
