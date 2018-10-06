package com.example.stingg.notebook;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.viewhoder> {
ArrayList<Obj> data;
Context context;

    public adapter(ArrayList<Obj> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item,parent,false);
        return new viewhoder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewhoder holder, int position) {
    holder.tieude.setText(data.get(position).getTieuDe());
    holder.noidung.setText(data.get(position).getNoiDung());
    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    public class viewhoder extends RecyclerView.ViewHolder {
        TextView tieude,noidung;
        public viewhoder(final View itemView) {
            super(itemView);
            tieude = (TextView) itemView.findViewById(R.id.tieude);
            noidung = (TextView) itemView.findViewById(R.id.noidung);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
        }
    }

}
