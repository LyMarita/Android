package com.rupp.mrt.ditionary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class Class_Emotion extends BaseAdapter {
    private final Activity context;
    private final String[] names;
    static class ViewHolder{
        public TextView text;
        public ImageView image;
    }
    public Class_Emotion(Activity context,String[] names){
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
        if(s.startsWith("Angry"))
            holder.image.setImageResource(R.drawable.angry);
        else if(s.startsWith("Bored"))
            holder.image.setImageResource(R.drawable.bored);
        else if(s.startsWith("Cry"))
            holder.image.setImageResource(R.drawable.cry);
        else if(s.startsWith("Happy"))
            holder.image.setImageResource(R.drawable.happy);
        else if(s.startsWith("Hurt"))
            holder.image.setImageResource(R.drawable.hurt);
        else if(s.startsWith("Lonely"))
            holder.image.setImageResource(R.drawable.lonely);
        else if(s.startsWith("Afraid"))
            holder.image.setImageResource(R.drawable.nevorse);
        else if(s.startsWith("Sad"))
            holder.image.setImageResource(R.drawable.sad);
        else if(s.startsWith("Tired"))
            holder.image.setImageResource(R.drawable.tired);
        return rowView;
    }

}

