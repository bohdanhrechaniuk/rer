package com.example.tickets.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tickets.R;
import com.example.tickets.data.model.Tickets;

import java.util.ArrayList;


public class TicketsAdapter extends RecyclerView.Adapter<TicketsAdapter.ViewHolder> {
    ArrayList<Tickets> ticketsDomain;

    public TicketsAdapter(ArrayList<Tickets> ticketsDomain)
    {
        this.ticketsDomain=ticketsDomain;
    }
    @Override
    public TicketsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.ticket_viewholder, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull TicketsAdapter.ViewHolder holder, int position) {
        //holder.categoryName.setText(ticketsDomain.get(position).getTitle());
        String picUrl = "";
        switch (position) {
            case 0: {
                picUrl = "smart_ticket";
                holder.menuLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.smart_ticket));
                break;
            }

            case 1: {
                picUrl = "cat_2";
                holder.menuLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.smart_ticket));
                break;
            }
            case 2: {
                picUrl = "cat_3";
                holder.menuLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.smart_ticket));
                break;
            }
            case 3: {
                picUrl = "cat_4";
                holder.menuLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.smart_ticket));
                break;
            }
            case 4 : {
                picUrl="cat_5";
                holder.menuLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.smart_ticket));
                break;
            }
        }
        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.categoryPic);
    }
    @Override
    public int getItemCount() {return ticketsDomain.size();}

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView categoryName;
        ImageView categoryPic;
        ConstraintLayout menuLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //categoryName=itemView.findViewById(R.id.categoryName);
           // categoryPic=itemView.findViewById(R.id.categoryPic);
            //menuLayout=itemView.findViewById(R.id.menuLayout);
        }
    }
}