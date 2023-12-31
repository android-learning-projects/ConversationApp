package com.conversation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.conversation.conversion.ConversationalAdapter;
import com.conversation.conversion.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ConversationalAdapter conversationalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conversationalAdapter = new ConversationalAdapter();

        List<Data> list = new ArrayList<>();


        list.add(new Data("LEFT", "PENDING"));
        list.add(new Data("RIGHT", "SUCCESS"));
        list.add(new Data("LEFT", "EXPIRED"));

        list.add(new Data("LEFT", "PENDING"));
        list.add(new Data("RIGHT", "SUCCESS"));
        list.add(new Data("LEFT", "EXPIRED"));



        conversationalAdapter.update(list);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setAdapter(conversationalAdapter);
        recyclerView.scrollToPosition(0);


    }
}