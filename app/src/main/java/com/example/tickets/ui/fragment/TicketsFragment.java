package com.example.tickets.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.tickets.R;
import com.example.tickets.data.model.Tickets;
import com.example.tickets.ui.adapter.TicketsAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TicketsFragment extends Fragment {

    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewTicketsList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_tickets, container, false);

        ImageSlider imageSlider=view.findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.smart_ticket, "Дорослі квитки" , ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.smart_ticket,"Дитячі квитки" , ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.smart_ticket,"Пільгові квитки" ,ScaleTypes.FIT));

        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
        recyclerViewTickets(view);
        return view;
    }
    private void recyclerViewTickets(View view) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerViewTicketsList=view.findViewById(R.id.recyclerViewTicketsList);
        recyclerViewTicketsList.setHasFixedSize(true);
        recyclerViewTicketsList=view.findViewById(R.id.recyclerViewTicketsList);
        recyclerViewTicketsList.setLayoutManager(linearLayoutManager);

        ArrayList<Tickets> ticketsList = new ArrayList<>();
        ticketsList.add(new Tickets("Дорослі квитки", "ticket" , 200));
        ticketsList.add(new Tickets("Дитячі квитки", "ticket" , 100));
        ticketsList.add(new Tickets("Пільгові квитки", "ticket" , 0));

        adapter=new TicketsAdapter(ticketsList);
        recyclerViewTicketsList.setAdapter(adapter);
    }
}