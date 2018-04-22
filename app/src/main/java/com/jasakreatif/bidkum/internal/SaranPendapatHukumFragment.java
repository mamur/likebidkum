package com.jasakreatif.bidkum.internal;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.jasakreatif.bidkum.R;

 
public class SaranPendapatHukumFragment extends Fragment {

    private Spinner tujuanSpinner;

    public SaranPendapatHukumFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_saran_pendapat_hukum, container, false);
        tujuanSpinner = (Spinner)view.findViewById(R.id.listPerkara);

        return view;

    }


}
