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
        import com.jasakreatif.bidkum.fragment.ChatFragment;
        import com.jasakreatif.bidkum.fragment.ExploreFragment;
        import com.jasakreatif.bidkum.fragment.FriendFragment;
        import com.jasakreatif.bidkum.fragment.HomeFragment;
        import com.jasakreatif.bidkum.internal.AdvokasiFragment;
        import com.jasakreatif.bidkum.internal.KumpulanPeraturanFragment;
        import com.jasakreatif.bidkum.internal.PembuatanSopMouFragment;
        import com.jasakreatif.bidkum.internal.PendampinganFragment;
        import com.jasakreatif.bidkum.internal.SaranPendapatHukumFragment;

public class MyAdapter extends FragmentPagerAdapter {
//    Fragment one, two, three;
//    public MyAdapter(FragmentManager fm) {
//        super(fm);
//    }

//    FragmentPagerAdapter adapterViewPager;

    private Context mContext;
    private String[] titles ={"PENDAMPINGAN","SARAN PENDAPAT UMUM","ADVOKASI","PEMBUATAN SOP/MOU","KUMPULAN PERATURAN"};
    int[] icon = new int[]{R.drawable.ic_home_white_24dp,R.drawable.ic_explore_white_24dp,R.drawable.ic_chat_white_24dp,R.drawable.ic_person_white_24dp};
    private int heightIcon;

    public MyAdapter(FragmentManager fm, Context c){
        super(fm);
        mContext = c;
        double scale = c.getResources().getDisplayMetrics().density;
        heightIcon=(int)(24*scale+0.5f);
    }


    @Override
    public Fragment getItem(int position) {
        Fragment frag= null;

        if(position ==0){
            frag = new PendampinganFragment();
        }
        else if(position == 1){
            frag = new SaranPendapatHukumFragment();
        }
        else if(position == 2){
            frag = new AdvokasiFragment();
        }else if(position == 3){
            frag = new PembuatanSopMouFragment();
        }else if(position == 4){
            frag = new KumpulanPeraturanFragment();
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