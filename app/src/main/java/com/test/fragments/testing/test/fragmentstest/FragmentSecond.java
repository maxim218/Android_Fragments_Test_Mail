package com.test.fragments.testing.test.fragmentstest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class FragmentSecond extends Fragment {
    // переменная для хранения активности (чтобы можно было вызывать её методы)
    public MainActivity mainActivity;

    // этот метод НЕ надо трогать
    public FragmentSecond() {
        // Required empty public constructor
    }

    // этот метод НЕ надо трогать
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_second, container, false);
    }

    // перегружаем стандартный метод, вызывающийся при старте активности
    @Override
    public void onStart() {
        super.onStart();
        /* ***************************** */

        // добавляем событие щелчка к элементу ListView
        addEventsToElements();
    }

    // метод для инициализации активности
    public void initMainActivity(MainActivity mainActivityParam) {
        mainActivity = mainActivityParam;
    }

    // метод добавления события щелчка к ListView
    public void addEventsToElements() {
        AdapterView.OnItemClickListener itemClickListener_1 = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView <?> listView, View v, int position, long id){

                // получаем текст внутри элемента, по которому был произведён щелчок
                String s = ((TextView) v).getText().toString();
                // вызываем метод активности, который меняет содержимое текстовых полей внутри другого фрагмента
                mainActivity.setValueOfMyTextBlock(s);
            }
        };
        ListView listView_1 = (ListView) getView().findViewById(R.id.listview_1);
        listView_1.setOnItemClickListener(itemClickListener_1);
    }

    // метод для инициализации содержимого ListView
    public void initArrList(ArrayAdapter <String> list_1_adapter) {
        ListView listView_1 = (ListView) getView().findViewById(R.id.listview_1);
        listView_1.setAdapter(list_1_adapter);
    }
}
