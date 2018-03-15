package com.test.fragments.testing.test.fragmentstest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentFirst extends Fragment {

    // этот метод НЕ надо трогать
    public FragmentFirst() {
        // Required empty public constructor
    }

    // этот метод НЕ надо трогать
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_first, container, false);
    }

    // перегружаем стандартный метод, вызывающийся при старте активности
    @Override
    public void onStart() {
        super.onStart();
        /* ***************************** */
    }

    // метод для задания значения первого текстового поля
    public void setFieldFirst(String s) {
        TextView t1 = (TextView) getView().findViewById(R.id.textview_1);
        t1.setText(s);
    }

    // метод для задания значения второго текстового поля
    public void setFieldSecond(String s) {
        TextView t2 = (TextView) getView().findViewById(R.id.textview_2);
        t2.setText(s);
    }

    // получить значение первого поля
    public String getFieldFirstValue() {
        TextView t1 = (TextView) getView().findViewById(R.id.textview_1);
        return t1.getText().toString();
    }

    // получить значение второго поля
    public String getFieldsSecondValue() {
        TextView t2 = (TextView) getView().findViewById(R.id.textview_2);
        return  t2.getText().toString();
    }
}
