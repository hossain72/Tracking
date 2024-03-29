package com.example.myapplication.ui.place;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

public class PlaceFragment extends Fragment {

    private PlaceViewModel placeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        placeViewModel =
                ViewModelProviders.of(this).get(PlaceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_place, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        placeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}