package com.tct.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tct.myapplication.adapter.CategoryAdapter;
import com.tct.myapplication.adapter.PopularAdapter;
import com.tct.myapplication.mode.CategoriesDomain;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewCategoryList;
    private RecyclerView.Adapter adapterPopular;
    private RecyclerView recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        recyclerViewPopular();

    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularList = findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoriesDomain> categoriesDomainArray = new ArrayList();
        categoriesDomainArray.add(new CategoriesDomain("Pizza", "cart_1"));
        categoriesDomainArray.add(new CategoriesDomain("Burger", "cart_2"));
        categoriesDomainArray.add(new CategoriesDomain("Hotdog", "cart_3"));
        categoriesDomainArray.add(new CategoriesDomain("Drink", "cart_4"));
        categoriesDomainArray.add(new CategoriesDomain("Donut", "cart_5"));

        adapterPopular = new PopularAdapter(categoriesDomainArray);
        recyclerViewPopularList.setAdapter(adapterPopular);
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoriesDomain> categoriesDomainArray = new ArrayList();
        categoriesDomainArray.add(new CategoriesDomain("Pizza", "cart_1"));
        categoriesDomainArray.add(new CategoriesDomain("Burger", "cart_2"));
        categoriesDomainArray.add(new CategoriesDomain("Hotdog", "cart_3"));
        categoriesDomainArray.add(new CategoriesDomain("Drink", "cart_4"));
        categoriesDomainArray.add(new CategoriesDomain("Donut", "cart_5"));

        adapter = new CategoryAdapter(categoriesDomainArray);
        recyclerViewCategoryList.setAdapter(adapter);
    }
}