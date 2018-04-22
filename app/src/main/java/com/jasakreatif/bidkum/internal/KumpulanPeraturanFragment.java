package com.jasakreatif.bidkum.internal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jasakreatif.bidkum.R;
import com.jasakreatif.bidkum.fragment.ExploreFragment;
import com.jasakreatif.bidkum.fragment.FriendFragment;

public class KumpulanPeraturanFragment extends Fragment {

    private FragmentTabHost mTabHost;
    public KumpulanPeraturanFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_kumpulan_peraturan, container, false);

        mTabHost=(FragmentTabHost)view.findViewById(android.R.id.tabhost);
        mTabHost.setup(getActivity(),getChildFragmentManager(),R.id.realtabcontent);
        mTabHost.addTab(mTabHost.newTabSpec("Perundang-undangan").setIndicator("Perundang-Undangan"),PerundangUndanganFragment.class,null);
        mTabHost.addTab(mTabHost.newTabSpec("Peraturan Kapolri").setIndicator("Peraturan Kapolri"),PeraturanKapolriFragment.class,null);

//        mTabHost.addTab(mTabHost.newTabSpec("post").setIndicator("Post"),FriendFragment.class,null);
//        mTabHost.addTab(mTabHost.newTabSpec("search").setIndicator("Search"),ExploreFragment.class,null);

        return view;
    }

}
