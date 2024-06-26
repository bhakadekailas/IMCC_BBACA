package com.kailas.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kailas.adapters.array_adapter.MyArrayAdapterActivity;
import com.kailas.adapters.base_adapters.MyBaseAdapterActivity;
import com.kailas.adapters.gridViewUsingAdapter.GridViewActivity;
import com.kailas.adapters.listViewUsingAdapter.ListViewActivity;
import com.kailas.adapters.photoGalleryUsingAdapter.PhotoGalleryActivity;

public class MainActivity extends AppCompatActivity {
    Button buttonBaseAdapter, buttonArrayAdapter, buttonGridViewUsingAdapter,
            buttonListViewUsingAdapter, buttonPhotoGalleryUsingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBaseAdapter = findViewById(R.id.buttonBaseAdapter);
        buttonArrayAdapter = findViewById(R.id.buttonArrayAdapter);
        buttonGridViewUsingAdapter = findViewById(R.id.buttonGridViewUsingAdapter);
        buttonListViewUsingAdapter = findViewById(R.id.buttonListViewUsingAdapter);
        buttonPhotoGalleryUsingAdapter = findViewById(R.id.buttonPhotoGalleryUsingAdapter);

        buttonBaseAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyBaseAdapterActivity.class);
                startActivity(intent);
            }
        });

        buttonArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyArrayAdapterActivity.class);
                startActivity(intent);
            }
        });

        buttonGridViewUsingAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });

        buttonListViewUsingAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        buttonPhotoGalleryUsingAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PhotoGalleryActivity.class);
                startActivity(intent);
            }
        });
    }
}