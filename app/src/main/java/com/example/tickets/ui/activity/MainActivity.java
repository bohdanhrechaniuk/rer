package com.example.tickets.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.tickets.R;
import com.example.tickets.databinding.ActivityMainBinding;
import com.example.tickets.ui.fragment.HomeFragment;
import com.example.tickets.ui.fragment.ProfileFragment;
import com.example.tickets.ui.fragment.SettingsFragment;
import com.example.tickets.ui.fragment.TicketsFragment;

public class MainActivity extends AppCompatActivity {
   final int home = R.id.home;
    int tickets =  R.id.tickets;
    int profile =  R.id.profile;
    int settings = R.id.settings;
    ActivityMainBinding binding;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {


            if(item.getItemId() == R.id.home) {
                replaceFragment(new HomeFragment());
            }
            else if (item.getItemId() == R.id.profile){
                replaceFragment(new ProfileFragment());
            }else if(item.getItemId() == R.id.tickets){
                replaceFragment(new TicketsFragment());
            }else if(item.getItemId() == R.id.settings){
                replaceFragment(new SettingsFragment());
            }

return true;
        });

    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}