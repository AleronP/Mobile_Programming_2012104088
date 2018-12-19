package com.example.aleron.mpmpmpmpmpmp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.aleron.mpmpmpmpmpmp.R.id.fragment_container2;


public class MyExerciseFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public MyExerciseFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_my_exercise, null);

        //Toolbar toolbar = v.findViewById(R.id.toolbar);


        tabLayout = (TabLayout)v.findViewById(R.id.toolbar);
        tabLayout.addTab(tabLayout.newTab().setText("대시 보드"));
        tabLayout.addTab(tabLayout.newTab().setText("수강 중인 강좌"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager)v.findViewById(fragment_container2);

        ExerciseTabPagerAdapter pagerAdapter = new ExerciseTabPagerAdapter(getChildFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return v;
    }
}
