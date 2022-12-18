package com.repasolistview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<com.example.ej_listview.InfoDescargaF> {

    Activity activity;
    int layout;
    ArrayList<com.example.ej_listview.InfoDescargaF> items;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<com.example.ej_listview.InfoDescargaF> objects) {
        super(context, resource, objects);
        activity = (Activity) context;
        layout = resource;
        items = (ArrayList<com.example.ej_listview.InfoDescargaF>) objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    Refs refs;

        if(convertView == null) {
            convertView = activity.getLayoutInflater().inflate(layout, null);
            TextView text_mes = convertView.findViewById(R.id.mes);
            TextView text_anho = convertView.findViewById(R.id.anho);
            ImageView icon = convertView.findViewById(R.id.icon);
            refs = new Refs(text_mes, text_anho, icon);
            convertView.setTag(refs);
        } else {
            refs = (Refs) convertView.getTag();
        }

        com.example.ej_listview.InfoDescargaF info = items.get(position);

        refs.text_mes.setText(info.getMes());
        refs.text_anho.setText(info.getAnho());

        if(info.estaDescargada()) {
            refs.icon.setImageResource(R.drawable.descarga_si);
            refs.text_mes.setTextColor(Color.rgb(115,158, 57));
        } else {
            refs.icon.setImageResource(R.drawable.descarga_no);
            refs.text_mes.setTextColor(Color.rgb(0, 0, 0));
        }

        return convertView;
    }

    class Refs {
        TextView text_mes;
        TextView text_anho;
        ImageView icon;

        public Refs(TextView text_mes, TextView text_anho, ImageView icon) {
            this.text_mes = text_mes;
            this.text_anho = text_anho;
            this.icon = icon;
        }
    }


}
