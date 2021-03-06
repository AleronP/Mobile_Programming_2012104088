package com.example.aleron.mpmpmpmpmpmp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ExerciseTabPagerAdapter extends FragmentStatePagerAdapter {

    // 탭 넘버
    private int tabCount;

    public ExerciseTabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabFragment1 tabFragment1 = new TabFragment1();
                return tabFragment1;
            case 1:
                TabFragment2 tabFragment2 = new TabFragment2();
                return tabFragment2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
