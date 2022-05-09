package com.kailas.adapters.array_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.kailas.adapters.R;
import com.kailas.adapters.base_adapters.CountryDataModel;

import java.util.ArrayList;

public class MyArrayAdapterActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_array_adapter);
        listView = findViewById(R.id.listView);
        ArrayList<MovieDataModel> arrayList = loadMoviesList();

        MyCustomArrayAdapter myCustomArrayAdapter = new MyCustomArrayAdapter(MyArrayAdapterActivity.this, arrayList);
        listView.setAdapter(myCustomArrayAdapter);
    }

    private ArrayList<MovieDataModel> loadMoviesList() {
        ArrayList<MovieDataModel> list = new ArrayList<>();
        list.add(new MovieDataModel("Shole", "10 June 2022", 4));
        list.add(new MovieDataModel("3 idiot", "10 Jully 2022", 5));
        list.add(new MovieDataModel("Ithihas", "10 August 2022", 3));
        list.add(new MovieDataModel("Full aur Katte", "10 September 2022", 2));
        list.add(new MovieDataModel("Tare Jamin par", "10 November 2022", 4));
        list.add(new MovieDataModel("Yaade", "10 December 2022", 1));
        list.add(new MovieDataModel("Shaudhagar", "10 January 2022", 4));
        list.add(new MovieDataModel("Kassam", "10 Febwary 2022", 2));
        list.add(new MovieDataModel("Tere naam", "10 March 2022", 2));
        return list;
    }
}