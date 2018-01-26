package com.example.khansaahsan.project;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import com.example.khansaahsan.Model.Record;



public class Adapter extends RecyclerView.Adapter {
    ArrayList<Record> data_arrayList = null;

    public Adapter(ArrayList<Record> list) {
        this.data_arrayList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater infalter = LayoutInflater.from(parent.getContext());
        View view = infalter.inflate(R.layout.view,parent,false);
        return new _ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        holder = (_ViewHolder)holder;
        String record = (data_arrayList.get(position).getId()+" "+data_arrayList.get(position).getOprnd1())+" "+(data_arrayList.get(position).getOperation())+" "+(data_arrayList.get(position).getOprnd2())+" = "+(data_arrayList.get(position).getResult());
        ((_ViewHolder) holder).tv.setText(record);
    }

    @Override
    public int getItemCount() {
        return data_arrayList.size();
    }

    public class _ViewHolder extends RecyclerView.ViewHolder{
        TextView tv;
        public _ViewHolder(View itemView) {
            super(itemView);
            tv =itemView.findViewById(R.id.finalTextView);
        }
    }
}
