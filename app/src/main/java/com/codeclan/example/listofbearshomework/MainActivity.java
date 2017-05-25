package com.codeclan.example.listofbearshomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopBears topBears = new TopBears();
        ArrayList<Bear> list = topBears.getList();

        TopBearsAdapter bearsAdapter = new TopBearsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(bearsAdapter);

    }

}
