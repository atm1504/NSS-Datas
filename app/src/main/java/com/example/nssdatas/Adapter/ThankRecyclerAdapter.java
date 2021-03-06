package com.example.nssdatas.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nssdatas.Models.ThankModel;
import com.example.nssdatas.R;

import java.util.ArrayList;
import java.util.List;

public class ThankRecyclerAdapter extends RecyclerView.Adapter<ThankRecyclerAdapter.MyHoder> {

    ArrayList<ThankModel> thankList;
    Context context;

    public ThankRecyclerAdapter(ArrayList<ThankModel> thankList, Context context) {
        this.thankList = thankList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHoder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.thank_item_card,viewGroup,false);//try put for parent
        MyHoder myHoder = new MyHoder(view);

        return myHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHoder myHoder, int position) {
        ThankModel feedbackList=thankList.get(position);
        myHoder.name.setText(feedbackList.getName());
        myHoder.email.setText(feedbackList.getEmail());
        myHoder.feedback.setText(feedbackList.getThought());
        myHoder.phone.setText(feedbackList.getPhone());
    }

    @Override
    public int getItemCount() {
        return thankList.size();
    }

    class MyHoder extends RecyclerView.ViewHolder{
        TextView name,email,phone, feedback;


        public MyHoder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            email= (TextView) itemView.findViewById(R.id.email);
            phone= (TextView) itemView.findViewById(R.id.phone);
            feedback= (TextView) itemView.findViewById(R.id.feedback);

        }
    }
}
