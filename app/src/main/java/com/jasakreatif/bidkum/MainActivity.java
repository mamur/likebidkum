package com.jasakreatif.bidkum;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.jasakreatif.bidkum.Tab.MyAdapter;
import com.jasakreatif.bidkum.Tab.SlidingTabLayout;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeader;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.roughike.bottombar.BottomBar;


public class MainActivity extends AppCompatActivity {
    //declare for tab and sliding
    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;
    //declare for drawer navigation
    private Drawer.Result navigationDraweLeft;
    private AccountHeader.Result headerNavigationleft;

    // declare bottom bar

    private BottomBar bottomBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // for sliding tab =====================
        mViewPager = (ViewPager) findViewById(R.id.vp_tabs);
        mViewPager.setAdapter(new MyAdapter(getSupportFragmentManager(), this));

        mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.stl_tabs);
        mSlidingTabLayout.setDistributeEvenly(true);
        mSlidingTabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        mSlidingTabLayout.setTabTextColors(getResources().getColor(R.color.white));
        //mSlidingTabLayout.setSelectedTabIndicatorHeight((int) (5 * getResources().getDisplayMetrics().density));
        // mSlidingTabLayout.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#ffffff"));
        mSlidingTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.colorAccent));
        mSlidingTabLayout.setCustomTabView(R.layout.tab_view, R.id.tv_tab);
        mSlidingTabLayout.setViewPager(mViewPager);


        // for navigation drawer =========================

        headerNavigationleft = new AccountHeader()
                .withActivity(this)
                .withCompactStyle(false)
                .withSavedInstance(savedInstanceState)
                .withHeaderBackground(R.color.colorPrimary)
                .addProfiles(new ProfileDrawerItem()
                        .withName("Like Bidkum").withEmail("Sarana Konsultasi Bidang Hukum").withIcon(getResources().getDrawable(R.drawable.bid))
                ).build();

        navigationDraweLeft = new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withDisplayBelowToolbar(false)
                .withActionBarDrawerToggleAnimated(false)
                .withDrawerGravity(Gravity.LEFT)
                .withSavedInstance(savedInstanceState)
                .withAccountHeader(headerNavigationleft)
                .withSelectedItem(0)
                .build();
        navigationDraweLeft.addItem(new PrimaryDrawerItem().withName("Beranda").withIcon(getResources().getDrawable(R.drawable.homee)));
        navigationDraweLeft.addItem(new PrimaryDrawerItem().withName("Tentang Kami").withIcon(getResources().getDrawable(R.drawable.about)));
        navigationDraweLeft.addItem(new PrimaryDrawerItem().withName("Pengaturan").withIcon(getResources().getDrawable(R.drawable.setting)));
        navigationDraweLeft.addItem(new PrimaryDrawerItem().withName("Keluar").withIcon(getResources().getDrawable(R.drawable.logoute)));


        //         bottom bar

//       bottomBar=(BottomBar)findViewById(R.id.bottomBar);
//       bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
//           android.support.v4.app.Fragment fragment = null;
//           @Override
//           public void onTabSelected(@IdRes int tabId) {
//               if (tabId == R.id.tab_home){
//                   fragment = new HomeFragment();
//               }else if (tabId == R.id.tab_explore){
//                   fragment = new ExploreFragment();
//
//               }else if(tabId == R.id.tab_chat){
//                   fragment = new ChatFragment();
//
//               }else if (tabId == R.id.tab_friend){
//                   fragment = new FriendFragment();
//
//               }
//               getSupportFragmentManager()
//                       .beginTransaction()
//                       .replace(R.id.content,fragment)
//                       .commit();
//           }
//       });


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
