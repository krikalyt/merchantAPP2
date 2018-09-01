package com.example.krika.merchantapp30;

import android.content.Context;
import android.content.Intent;
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
    Context context;

    public recyclerviewAdapter(String []data, Context context){
        this.data = data;
        this.context = context;
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
        final String title = data[position];
        final Context context = holder.view.getContext();
        holder.textView.setText(title +" ButterRoti with  Paneer Pizza");
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Class destination = finalactivity.class;
                Intent intent = new Intent(context,destination);
                intent.putExtra("info",title+" ButterRoti with  Paneer Pizza");
                intent.putExtra("quantity", "Quantity: 1");
                context.startActivity(intent);
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
