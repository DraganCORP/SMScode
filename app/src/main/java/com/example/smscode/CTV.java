package com.example.smscode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.smscode.Adapters.AutoBranddsSpinnerAdapter;
import com.example.smscode.AdditionalClasses.AutoBrandClass;

import java.util.ArrayList;

public class CTV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctv);

        ArrayList<AutoBrandClass> autoBrandList = new ArrayList<>();

        autoBrandList.add(new AutoBrandClass("CAM", "IRD5", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("6001", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("HD-5100", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("2040", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("4404", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("2304", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("3011", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("2204", "http:\\pima.ru", R.drawable.routers));


        Spinner spAutoBrands = (Spinner) findViewById(R.id.spinner);

        AutoBranddsSpinnerAdapter spinnerAdapter = new AutoBranddsSpinnerAdapter(this, autoBrandList);

        spAutoBrands.setAdapter(spinnerAdapter);
    }
}