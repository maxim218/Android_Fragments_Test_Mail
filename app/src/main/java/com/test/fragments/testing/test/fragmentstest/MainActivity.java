package com.test.fragments.testing.test.fragmentstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public FragmentFirst f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = (FragmentFirst) getSupportFragmentManager().findFragmentById(R.id.frag_first);
        setContentToTextFields();
    }

    public void setContentToTextFields() {
        f1.setFieldFirst("Мой заголовок");
        f1.setFieldSecond("Строка 1\nСтрока 2\nСтрока 3\nСтрока 4\nСтрока 5\nСтрока 6\nСтрока 7\nСтрока 8\n");
    }
}
