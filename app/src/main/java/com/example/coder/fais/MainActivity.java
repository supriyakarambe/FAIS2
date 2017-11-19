package com.example.coder.fais;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.AdapterView;

import com.example.coder.fais.models.Categories;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView catergoryListView;
    CustomizedListAdapter adapter;
    ArrayList<Categories> categoriesList = new ArrayList<Categories>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        catergoryListView = (ListView) findViewById(R.id.lv_category_list);

        Categories c1= new Categories();
        c1.setCategoryid(1);
        c1.setCategoryName("temp");

        Categories c2= new Categories();
        c2.setCategoryid(2);
        c2.setCategoryName("temp2");

        Categories c3= new Categories();
        c3.setCategoryid(3);
        c3.setCategoryName("temp3");

        categoriesList.add(c1);
        categoriesList.add(c2);
        categoriesList.add(c3);




        CustomizedListAdapter listAdapter = new
                CustomizedListAdapter(MainActivity.this, categoriesList);

        catergoryListView.setAdapter(listAdapter);

    }

    }



