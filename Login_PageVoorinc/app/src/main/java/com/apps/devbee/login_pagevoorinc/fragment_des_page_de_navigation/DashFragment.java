package com.apps.devbee.login_pagevoorinc.fragment_des_page_de_navigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.devbee.login_pagevoorinc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashFragment extends Fragment {


    public DashFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dash, container, false);
    }

}
