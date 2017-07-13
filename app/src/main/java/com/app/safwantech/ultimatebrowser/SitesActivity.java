package com.app.safwantech.ultimatebrowser;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

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

    @Override
    public void onViewCreated(View view,Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);
        //   getActivity().findViewById(R.id.section_label).setTex
        TextView section_label = (TextView) getActivity().findViewById(R.id.section_label1);
        section_label.setText("Testing");
        RelativeLayout relLay0 =  (RelativeLayout) getActivity().findViewById(R.id.linLay_sites_parent);

        //1st Row Start//

        //Add Icons
        LinearLayout LinLay1 = new LinearLayout(getContext());
        LinLay1.setOrientation(LinearLayout.HORIZONTAL);
        LinLay1.setId(View.generateViewId());
        int firtRowid = LinLay1.getId();


        RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params1.addRule(RelativeLayout.BELOW,LinLay1.getId());

/*
        ViewGroup.LayoutParams params_LinLay1 = view.getLayoutParams();
        params_LinLay1.width= 200;
        params_LinLay1.height=200;
*/


        LinearLayout.LayoutParams params_img = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params_img.width= 1000;
        params_img.height=120;
        params_img.weight = 1.0f;

        LinearLayout.LayoutParams params_txtvw = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT,1f);

        params_txtvw.width= 520;
        params_txtvw.height=50;
        //params_txtvw.weight = 1.0f;

        LinLay1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        for (int i=0;i<4;i++){
            ImageView imgvw = new ImageView(getContext());
            imgvw.setImageResource(R.drawable.amazon);
            imgvw.setLayoutParams(params_img);
            LinLay1.addView(imgvw);

        }

        relLay0.addView(LinLay1);

        //Add Text
        LinLay1 = new LinearLayout(getContext());
        LinLay1.setOrientation(LinearLayout.HORIZONTAL);
        LinLay1.setId(View.generateViewId());

        int secondRowid = LinLay1.getId();
        for (int i=0;i<4;i++){
            TextView txtvw = new TextView(getContext());
            txtvw.setText("Amazon jklsdfjklf jkljklfjklf jjklsfjklsdf");
            txtvw.setTextSize(10);
            txtvw.setLayoutParams(params_txtvw);
            txtvw.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            LinLay1.addView(txtvw);

        }
        relLay0.addView(LinLay1,params1);

        //2 Row Start//

        //Add Icons
        params1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params1.addRule(RelativeLayout.BELOW,LinLay1.getId());  //add previous row's id to params
        params1.setMargins(0,30,0,0);
        LinLay1 = new LinearLayout(getContext());
        LinLay1.setOrientation(LinearLayout.HORIZONTAL);
        LinLay1.setId(View.generateViewId());

        LinLay1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        for (int i=0;i<4;i++){
            ImageView imgvw = new ImageView(getContext());
            imgvw.setImageResource(R.drawable.amazon);
            imgvw.setLayoutParams(params_img);
            LinLay1.addView(imgvw);

        }

        relLay0.addView(LinLay1,params1);

        //Add Text
        params1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params1.addRule(RelativeLayout.BELOW,LinLay1.getId());  //add previous row's id to params

        LinLay1 = new LinearLayout(getContext());
        LinLay1.setOrientation(LinearLayout.HORIZONTAL);
        LinLay1.setId(View.generateViewId());


        for (int i=0;i<4;i++){
            TextView txtvw = new TextView(getContext());
            txtvw.setText("Amazon jklsdfjklf jkljklfjklf jjklsfjklsdf");
            txtvw.setTextSize(10);
            txtvw.setLayoutParams(params_txtvw);
            txtvw.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            LinLay1.addView(txtvw);

        }
        relLay0.addView(LinLay1,params1);

    }
}
