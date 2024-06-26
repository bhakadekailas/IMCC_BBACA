package com.kailas.adapters.gridViewUsingAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.kailas.adapters.R;
import com.kailas.adapters.base_adapters.CountryDataModel;

import java.util.ArrayList;

public class MyCustomAdapterForGridView extends BaseAdapter {
    ArrayList<CountryDataModel> countryList;
    Context context;

    public MyCustomAdapterForGridView(Context context, ArrayList<CountryDataModel> countryList) {
        this.context = context;
        this.countryList = countryList;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int position) {
        return countryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.row_layout_for_base_adapter, viewGroup, false);
        }
        CountryDataModel countryDataModel = countryList.get(position);

        TextView textViewItemName = view.findViewById(R.id.textViewCountryName);
        TextView textViewItemDescription = view.findViewById(R.id.textViewCountryCode);

        textViewItemName.setText(countryDataModel.getName());
        textViewItemDescription.setText(String.valueOf(countryDataModel.getCode()));

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, countryDataModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
