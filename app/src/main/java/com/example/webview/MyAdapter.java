package com.example.webview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CustomViewHolder>{
    private List<RetroUsers> dataList;
    public MyAdapter(List<RetroUsers> dataList){

        this.dataList = dataList;
    }
    class CustomViewHolder extends RecyclerView.ViewHolder {

//Get a reference to the Views in our layout//

        public final View myView;

        TextView textUser;

        CustomViewHolder(View itemView) {
            super(itemView);
            myView = itemView;

            textUser = myView.findViewById(R.id.user);

        }
    }


    @Override
    public MyAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row, parent, false);
        return new CustomViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyAdapter.CustomViewHolder holder, int position) {
        holder.textUser.setText(dataList.get(position).getUser());


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
