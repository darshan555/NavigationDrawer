package com.example.navigation_drawer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentHome extends Fragment {
    
    public static final String Arg1 = "Arg1";
    public static final String Arg2 = "Arg2";

    public FragmentHome() {
        // Required empty public constructor
    }
    
    public static FragmentHome getInstance(String val1,int val2){
        FragmentHome fh = new FragmentHome();

        Bundle bundle = new Bundle();
        bundle.putString(Arg1,val1);
        bundle.putInt(Arg2,val2);

        fh.setArguments(bundle);

        return fh;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if(getArguments()!=null){
            String name = getArguments().getString(Arg1);
            int rollNo = getArguments().getInt(Arg2);

            Log.d("Data","Name is "+name+" and roll no is "+rollNo);
            ((MainActivity)getActivity()).callFragment();

        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);

    }
}