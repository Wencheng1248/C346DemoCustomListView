package com.myapplicationdev.android.c346democustomlistview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class customAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<contacts>contactList;

    public customAdapter(Context context, int resource, ArrayList<contacts> objects){
        super(context, resource,objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    public View getView(int position , View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCode = rowView.findViewById(R.id.textViewCode);
        TextView tvPhone = rowView.findViewById(R.id.textViewPhoneNum);
        ImageView ivGender = rowView.findViewById(R.id.imageView);

        contacts currentItem = contactList.get(position);
        tvName.setText(currentItem.getName());
        tvCode.setText("+" + currentItem.getCountryCode());
        tvPhone.setText(currentItem.getPhoneNum() + "");
        if(currentItem.getGender() == 'f'){
            ivGender.setImageResource(R.drawable.female);
        }else if(currentItem.getGender() == 'm'){
            ivGender.setImageResource(R.drawable.male);
        }
        return rowView;
    }
}
