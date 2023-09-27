package com.conversation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.conversation.conversion.CustomAdapter;
import com.conversation.conversion.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customAdapter = new CustomAdapter();

        List<Data> list = new ArrayList<>();

        list.add(new Data("LEFT", "EXPIRED"));
        list.add(new Data("RIGHT", "SUCCESS"));
        list.add(new Data("LEFT", "PENDING"));

        list.add(new Data("LEFT", "EXPIRED"));
        list.add(new Data("RIGHT", "SUCCESS"));
        list.add(new Data("LEFT", "PENDING"));

        customAdapter.update(list);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setAdapter(customAdapter);


    }
}