package com.test.fragments.testing.test.fragmentstest;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    // описываем переменные для доступа к экземплярам фрагментов
    public FragmentFirst f1;
    public FragmentSecond f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // получаем тип ориентации экрана
        int type = getOrientationType();

        if(type == 1) {
            LogInMyConsole("Vertical");
        }

        if(type == 2) {
            LogInMyConsole("Horizontal");
        }

        // получаем доступ к фрагментам
        f1 = (FragmentFirst) getSupportFragmentManager().findFragmentById(R.id.frag_first);
        f2 = (FragmentSecond) getSupportFragmentManager().findFragmentById(R.id.frag_second);

        // передаём во второй фрагмент доступ к данной активности (чтобы было можно вызывать её методы)
        f2.initMainActivity(this);

        // инициализируем список выбора значениями
        initPointsList();
    }

    // метод для инициализации списка выбора значениями
    public void initPointsList() {
        // создаём массив строк для хранения значений
        String arr [] = {"Пункт 1", "Пункт 2", "Пункт 3"};
        // создаём адаптер, который позволяет инициализировать список выбора значениями из массива
        ArrayAdapter <String> list_1_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        // передаём адаптер фрагменту
        f2.initArrList(list_1_adapter);
    }

    // метод для задания значений текстовым полям внутри фрагмента
    public void setValueOfMyTextBlock(String s) {
        // вызываем методы фрагмента, которые инициализируют текстовые поля значениями
        f1.setFieldFirst(s);
        f1.setFieldSecond(s + "\n" + s + "\n" + s + "\n" + s + "\n" + s + "\n" + s + "\n" + s + "\n" + s + "\n" + s);
    }

    // метод для вывода текста в консоль для отладки
    public void LogInMyConsole(String s) {
        Log.i(" Message ", "         " + s);
    }

    // получить ориентацию экрана
    public int getOrientationType() {
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) return 1;
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) return 2;
        return 0;
    }
}
