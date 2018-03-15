package com.test.fragments.testing.test.fragmentstest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentFirst extends Fragment {

    public FragmentFirst() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_first, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        /* ***************************** */
    }

    public void setFieldFirst(String s) {
        TextView t1 = (TextView) getView().findViewById(R.id.textview_1);
        t1.setText(s);
    }

    public void setFieldSecond(String s) {
        TextView t2 = (TextView) getView().findViewById(R.id.textview_2);
        t2.setText(s);
    }
}
