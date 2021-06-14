package ru.ds.app_notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
//создаю фрагменты
    public void onClickMain(View view) {
        //создаю инстанс фрагмента
        FragmentMain fMain = new FragmentMain();
        //метод будет заменять одни фрагмент на другой
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //указываем изначальный изначальный  и через запяту фрагмент, который хотим получить
        ft.replace(R.id.cont, fMain);
        //запускаем
        ft.commit();

        Intent intent = new Intent(MainActivity.this,FragmentMain.class);

    }

    public void onClickPhoto(View view) {
        FragmentPhoto fPhoto = new FragmentPhoto();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.cont, fPhoto);
        ft.commit();
    }

    public void onClickDescr(View view) {
        FragmentDescription fDescr = new FragmentDescription();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.cont, fDescr);
        ft.commit();
    }

    public void onClickSettings(View view) {
        FragmentSettings fSettings = new FragmentSettings();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.cont, fSettings);
    }
}