package com.jasakreatif.bidkum.Tab;

/**
 * Created by Hadiana on 3/18/2018.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jasakreatif.bidkum.R;
import com.jasakreatif.bidkum.external.LembagaFragment;
import com.jasakreatif.bidkum.external.MasyarakatFragment;

public class MyExternalAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private String[] titles ={"MASYARAKAT","LEMBAGA"};
    int[] icon = new int[]{R.drawable.ic_home_white_24dp,R.drawable.ic_explore_white_24dp,R.drawable.ic_chat_white_24dp,R.drawable.ic_person_white_24dp};
    private int heightIcon;

    public MyExternalAdapter(FragmentManager fm, Context c){
        super(fm);
        mContext = c;
        double scale = c.getResources().getDisplayMetrics().density;
        heightIcon=(int)(14*scale+0.5f);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag= null;

        if(position ==0){
            frag = new MasyarakatFragment();
        }
        else if(position == 1){
            frag = new LembagaFragment();
        }

        Bundle b = new Bundle();
        b.putInt("position", position);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    // untuk tab text
        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }


 /// Untuk tab icon

//    public CharSequence getPageTitle(int position){
//        Drawable d = mContext.getResources().getDrawable(icon[position]);
//        d.setBounds(0,0,heightIcon,heightIcon);
//        ImageSpan is = new ImageSpan(d);
//
//        SpannableString sp = new SpannableString(" ");
//        sp.setSpan(is,0,sp.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        return sp;
//    }


}