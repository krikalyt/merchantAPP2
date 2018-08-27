package com.example.krika.merchantapp30;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class recyclerviewAdapter extends RecyclerView.Adapter<recyclerviewAdapter.recyclerviewViewholder> {

    private  String[] data;
    Typeface tf2;

    public recyclerviewAdapter(String []data){
        this.data = data;
    }
    @NonNull
    @Override
    public recyclerviewViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_view, parent, false);
        return new recyclerviewViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewViewholder holder, final int position) {
        String title = data[position];
        final Context context = holder.view.getContext();
        holder.textView.setText(title +" ButterRoti with  Paneer Pizza");
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "you clicked on "+(position + 1),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class recyclerviewViewholder extends  RecyclerView.ViewHolder {


        TextView textView;
        View view;
        public recyclerviewViewholder(View itemView) {
            super(itemView);
            view =  itemView.findViewById(R.id.list_view_main);
            textView = itemView.findViewById(R.id.fooddescription);
        }
    }
}
