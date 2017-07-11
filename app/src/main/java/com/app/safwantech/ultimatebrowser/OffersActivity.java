package com.app.safwantech.ultimatebrowser;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by hashimkh on 7/11/2017.
 */

public class OffersActivity extends Fragment  {

    TextView section_label;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView_offers = inflater.inflate(R.layout.fragment_offers, container, false);



        return rootView_offers;
    }

    @Override
    public void onViewCreated(View view,Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);
     //   getActivity().findViewById(R.id.section_label).setTex
        section_label = (TextView) getActivity().findViewById(R.id.section_label);
        section_label.setText("Hello Sir");
    }
    private void upd_txt(){

    }
}
