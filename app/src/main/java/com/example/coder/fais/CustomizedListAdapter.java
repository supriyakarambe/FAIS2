package com.example.coder.fais;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import com.example.coder.fais.models.Categories;

import java.util.ArrayList;

/**
 * Created by Supriya on 11/19/17.
 */

class CustomizedListAdapter extends ArrayAdapter<Categories>{

    private final Activity context;
    private final ArrayList <Categories>categories;


    public CustomizedListAdapter(Activity context,

                      ArrayList<Categories> categories) {
        super(context, R.layout.list_row, categories);
        this.context = context;
        this.categories = categories;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_row, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        txtTitle.setText(categories.get(position).getCategoryName());

        return rowView;
    }
}
