package com.example.smscode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import org.w3c.dom.ls.LSInput;

public class MainActivity extends AppCompatActivity //наследование
{
    //Определение визуального интента.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //  объявление кноки Ethernet
        Button btn_int = findViewById(R.id.btn_int);  //Идентификатор кнопки Активация ШПД
        Button btn_ctv = findViewById(R.id.button2); //Идентификатор кнопки активации ЦТВ


// Метод перехода к экрану активации ШПД(Смена Интента)
        btn_int.setOnClickListener(v -> {
            Intent ethernetIntent = new Intent(MainActivity.this, Ethernet_Activity.class);
            startActivity(ethernetIntent);
        });

        btn_ctv.setOnClickListener(v -> {
            Intent CTVIntent = new Intent(MainActivity.this, CTV.class);
            startActivity(CTVIntent);
        });




    }
}