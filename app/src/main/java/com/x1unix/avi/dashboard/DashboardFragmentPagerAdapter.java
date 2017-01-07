package com.x1unix.avi.dashboard;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.x1unix.avi.R;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private final int tabTitles[] = new int[] { R.string.favorites, R.string.viewed};
    private final List<Fragment> fragments = new ArrayList<>();
    private Context context;
    private Resources res;

    public DashboardFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        this.res = context.getResources();

        // Add two test fragments
        this.fragments.add(new PageFragment());
        this.fragments.add(new PageFragment());
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return res.getString(tabTitles[position]);
    }
}