package com.example.khansaahsan.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.khansaahsan.DB.RecordDBHandler;
import com.example.khansaahsan.Model.Record;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class showRecordActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecordDBHandler _refRecord;

    ArrayList<Record> data_arrayList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_record);

        _refRecord = new RecordDBHandler(this);

        data_arrayList = new ArrayList<>();


        recyclerView = (RecyclerView) findViewById(R.id.RV);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        data_arrayList = _refRecord.read();

        recyclerView.setAdapter(new Adapter(data_arrayList));

    }

}
