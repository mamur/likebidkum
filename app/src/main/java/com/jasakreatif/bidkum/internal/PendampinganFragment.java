package com.jasakreatif.bidkum.internal;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jasakreatif.bidkum.R;


public class PendampinganFragment extends Fragment {

    public PendampinganFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_pendampingan, container, false);
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab_add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PendampinganActivity.class);
                startActivity(intent);
            }
        });

         return view;
    }


}



//    View myView;
//    ViewGroup parent;
//    LinearLayout formLayout;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main);
//    }
//
//
//    @RequiresApi(api = Build.VERSION_CODES.M)
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//         View view = inflater.inflate(R.layout.fragment_pendampingan, container, false);
//
//
//        myView = view.findViewById(R.id.custom_view);
//        parent = (ViewGroup) myView.getParent();
//        parent.removeView(myView);
//
//        formLayout = (LinearLayout)view.findViewById(R.id.formLayout);
//        formLayout.removeAllViews();
//        formLayout.setOrientation(LinearLayout.VERTICAL);
//        formLayout.setPadding(MyDynamicFields.dpToPx(16), MyDynamicFields.dpToPx(16), MyDynamicFields.dpToPx(16), MyDynamicFields.dpToPx(16));
//
//        MyDynamicFields.setEditText(formLayout,this,"Enter Name");
//        setSpinnerAdapter(MyDynamicFields.setSpinner(formLayout,this,"Location"));
//        MyDynamicFields.setEditText(formLayout,this,"Exact Location");
//        setSpinnerAdapter(MyDynamicFields.setSpinner(formLayout,this,"Department"));
//        MyDynamicFields.setButton(formLayout,this,"Submit");
//        return view;
//    }
//
//
//    @RequiresApi(api = Build.VERSION_CODES.M)
//    public void setSpinnerAdapter(BetterSpinner locationSpinner){
//        List<String> locationList = new ArrayList<>();
//        locationList.add("Dhaka");
//        locationList.add("Comilla");
//        locationList.add("Chittagong");
////        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, locationList);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(PendampinganFragment.this,android.R.layout.select_dialog_item,locationList);
//        locationSpinner.setAdapter(arrayAdapter);
//    }
//
//}
//
