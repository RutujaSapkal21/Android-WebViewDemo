package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   GridView gridView;
   Logo logo;
   ImageView imageView;
   int[] logos={R.drawable.jayma,R.drawable.abp,R.drawable.bbc,R.drawable.india,R.drawable.lok,R.drawable.saam,
           R.drawable.zee};
   String[] links={"https://www.jaimaharashtranews.com/","https://marathi.abplive.com/","https://www.bbc.com/news",
           "https://www.indiatoday.in/","https://www.lokmat.com/",
           "https://www.saamtv.com/","https://zeenews.india.com/marathi/live"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);
        imageView=findViewById(R.id.logo);

        logo=new Logo(MainActivity.this,logos,links);
        gridView.setAdapter(logo);
        gridView.setColumnWidth(50);


    }
}