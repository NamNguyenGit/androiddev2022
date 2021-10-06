package com.example.practical3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ForecastFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public ForecastFragment() {

    }

    public static ForecastFragment newInstance(String param1, String param2){
        ForecastFragment ff = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1,param1);
        args.putString(ARG_PARAM2,param2);
        ff.setArguments(args);
        return ff;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout ll1 = new LinearLayout(getActivity());
        ll1.setBackgroundResource(R.color.purple_200);
        ll1.setOrientation(ll1.VERTICAL);
        TextView tv1 = new TextView(getActivity());
        tv1.setText("Thursday the weather like:");
        ImageView snoww = new ImageView(getActivity());
        snoww.setImageResource(R.drawable.snow);
        ll1.addView(snoww);
        ll1.addView(tv1);

        TextView tv2 = new TextView(getActivity());
        tv2.setText("Sunday the weather like:");
        ImageView sunny = new ImageView(getActivity());
        snoww.setImageResource(R.drawable.sunny);
        ll1.addView(sunny);
        ll1.addView(tv2);

        return ll1;
    }
}