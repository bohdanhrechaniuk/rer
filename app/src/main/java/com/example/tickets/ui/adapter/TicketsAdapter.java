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
        String picUrl="";

        holder.ticketCategory.setText(ticketsDomain.get(position).getCategory());
        holder.ticketPrice.setText(String.valueOf(ticketsDomain.get(position).getPrice()));


        picUrl = "smart_ticket";
        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());
       Glide.with(holder.itemView.getContext())
             .load(drawableResourceId)
             .into(holder.ticketPicture);
    }
    @Override
    public int getItemCount() {return ticketsDomain.size();}

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView ticketCategory,ticketPrice,uahSign;
        ImageView ticketPicture;
        ConstraintLayout menuLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ticketCategory=itemView.findViewById(R.id.ticketCategory);
            ticketPicture=itemView.findViewById(R.id.ticketPicture);
            menuLayout=itemView.findViewById(R.id.menuLayout);
            ticketPrice=itemView.findViewById(R.id.ticketPrice);
            uahSign=itemView.findViewById(R.id.uahSign);
        }
    }
}