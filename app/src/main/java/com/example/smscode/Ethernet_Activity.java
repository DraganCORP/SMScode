package com.example.smscode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.smscode.Adapters.AutoBranddsSpinnerAdapter;
import com.example.smscode.AdditionalClasses.AutoBrandClass;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Ethernet_Activity extends AppCompatActivity {

    private EditText lsInput, sninput;
    private Button joinbutton;




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

        lsInput = (EditText) findViewById(R.id.ls_input);
        sninput = (EditText) findViewById(R.id.hard_text);
        joinbutton = (Button) findViewById(R.id.join_button);

        joinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Join(); }
        });

    }

    private void Join() {
        String ls = lsInput.getText().toString();
        String sn = sninput.getText().toString();
        String SmsCompiled;
        SmsCompiled = "CTV" + " " +  ls + " " + sn;
        System.out.println(SmsCompiled);
    }
}