package com.cv5.recibirintent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Usuarios> {


    public CustomAdapter(Context context, int resource, ArrayList<Usuarios> objects) {

        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Usuarios users = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView titulo = convertView.findViewById(R.id.textViewTitulo);
        ImageView img = convertView.findViewById(R.id.imageViewLista);

        titulo.setText(users.getName());
        img.setImageResource(users.getImg());


        return convertView;
    }
}
