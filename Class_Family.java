package com.rupp.mrt.ditionary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class Class_Family extends BaseAdapter {
    private final Activity context;
    private final String[] names;
    static class ViewHolder{
        public TextView text;
        public ImageView image;
    }
    public Class_Family(Activity context,String[] names){
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
        if(s.startsWith("Aunt"))
            holder.image.setImageResource(R.drawable.aunt);
        else if(s.startsWith("Daughter"))
            holder.image.setImageResource(R.drawable.daugter);
        else if(s.startsWith("Father"))
            holder.image.setImageResource(R.drawable.father);
        else if(s.startsWith("Grandmother"))
            holder.image.setImageResource(R.drawable.grandmother);
        else if(s.startsWith("Husband"))
            holder.image.setImageResource(R.drawable.husband);
        else if(s.startsWith("Mother"))
            holder.image.setImageResource(R.drawable.mother);
        else if(s.startsWith("Sister"))
            holder.image.setImageResource(R.drawable.sister);
        else if(s.startsWith("Son"))
            holder.image.setImageResource(R.drawable.son);
        else if(s.startsWith("Wife"))
            holder.image.setImageResource(R.drawable.wife);
        return rowView;
    }

}

