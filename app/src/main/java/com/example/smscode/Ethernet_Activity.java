package com.example.smscode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.smscode.Adapters.AutoBranddsSpinnerAdapter;
import com.example.smscode.AdditionalClasses.AutoBrandClass;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Ethernet_Activity extends AppCompatActivity {

    String[] data = { "one", "two", "three" };
//Определение визуального интента.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ethernet);

        ArrayList<AutoBrandClass> autoBrandList = new ArrayList<>();

        autoBrandList.add(new AutoBrandClass("DIR-822", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("DIR-842", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("HD-5100", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("CAM", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("HD2040", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("7033", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("TR-70222", "http:\\pima.ru", R.drawable.routers));
        autoBrandList.add(new AutoBrandClass("TR-702222", "http:\\pima.ru", R.drawable.routers));

        Spinner spAutoBrands = (Spinner) findViewById(R.id.spinner);

        AutoBranddsSpinnerAdapter spinnerAdapter = new AutoBranddsSpinnerAdapter(this, autoBrandList);

        spAutoBrands.setAdapter(spinnerAdapter);



    }
}