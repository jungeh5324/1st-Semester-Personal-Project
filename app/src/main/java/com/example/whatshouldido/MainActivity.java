package com.example.whatshouldido;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    FoodFragment fragment1;
    GameFragment fragment2;
    StudyFragment fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new FoodFragment();
        fragment2 = new GameFragment();
        fragment3 = new StudyFragment();
        
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,fragment1).commit();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListenar());
    }
    class ItemSelectedListenar implements BottomNavigationView.OnNavigationItemSelectedListener{
        @SuppressLint("NonConstantResourceId")
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            switch (menuItem.getItemId()){
                case R.id.page_food:
                    transaction.replace(R.id.fragment_container,fragment1).commit();
                    return true;
                case R.id.page_study:
                    transaction.replace(R.id.fragment_container,fragment3).commit();
                    return true;
                case R.id.page_game:
                    transaction.replace(R.id.fragment_container,fragment2).commit();
                    return true;
            }
            return false;
        }
    }
}