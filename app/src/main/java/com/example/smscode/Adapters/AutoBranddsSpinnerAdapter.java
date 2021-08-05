package com.example.smscode.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smscode.AdditionalClasses.AutoBrandClass;
import com.example.smscode.R;

import java.util.ArrayList;

public class AutoBranddsSpinnerAdapter extends BaseAdapter
{
    private LayoutInflater layoutInflater;
    private ArrayList<AutoBrandClass> autoBrandsList;

    public AutoBranddsSpinnerAdapter(Context context, ArrayList<AutoBrandClass> autoBrandsList)
    {
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.autoBrandsList = autoBrandsList;

    }

    @Override
    public int getCount()
    {
        return autoBrandsList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return autoBrandsList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View view = layoutInflater.inflate(R.layout.spiner_item, parent, false);

        AutoBrandClass autoBrand = (AutoBrandClass) getItem(position);

        TextView tvBrandName = (TextView) view.findViewById(R.id.tvBrandName);
        tvBrandName.setText(autoBrand.getBrandName());

        TextView tvBrandSite = (TextView) view.findViewById(R.id.tvBrandSite);
        tvBrandSite.setText(autoBrand.getofficialSite());

        ImageView ivBrandLogo = (ImageView) view.findViewById(R.id.ivBrandLogo);
        ivBrandLogo.setImageResource(autoBrand.getBrandLogo());

        return view;
    }
}


