package com.example.asus.castelosbeja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.asus.castelosbeja.model.Castelo;

import java.util.List;

/**
 * Created by Asus on 06/02/2018.
 */

public class CastelosAdapter extends BaseAdapter {
    private List<Castelo> casteloList;
    private Context context;

    public CastelosAdapter(Context context, List<Castelo> casteloList) {
        this.context = context;
        this.casteloList = casteloList;
    }

    @Override
    public int getCount() {
        return this.casteloList.size();
    }

    @Override
    public Castelo getItem(int i) {
        return this.casteloList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.context).inflate(R.layout.list_row_castelos, viewGroup, false);
        }

        TextView textView = view.findViewById(R.id.textViewNameList);

        Castelo castelo = getItem(i);
        textView.setText(castelo.getName());

        ImageView imageCastelo = (ImageView) view.findViewById(R.id.imageViewList);
        Glide.with(context).load(castelo.getImage()).into(imageCastelo);

        return view;
    }

    public void updateList(List<Castelo> castelos) {
        this.casteloList = castelos;
        notifyDataSetChanged();
    }
}
