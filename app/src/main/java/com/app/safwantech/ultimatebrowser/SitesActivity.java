package com.app.safwantech.ultimatebrowser;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hashimkh on 7/11/2017.
 */

public class SitesActivity extends Fragment  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView_sites = inflater.inflate(R.layout.fragment_sites, container, false);
        return rootView_sites;
    }

}
