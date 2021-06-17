package ru.ds.app_notes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class NavDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_drawable);

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.app_name,
                R.string.app_name

        );
        drawerLayout.addDrawerListener(toggle);
        //для сцепления шторки с toolbar
        toggle.syncState();

        NavigationView navigationView  = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.option_one){
                    getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.cont,new FragmentMain())
                    .commit();

                    return true;
                }
                if(item.getItemId() == R.id.option_two) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.cont, new FragmentPhoto())
                            .commit();

                    return true;

                }
                if(item.getItemId() == R.id.option_three) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.cont, new FragmentDescription())
                            .commit();

                    return true;

                }return false;
            }

        });
    }
}