package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class Constructionapanel extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private Toolbar mtoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructionapanel);

        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);

        drawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.navigationdrawer);
        navigationView.setNavigationItemSelectedListener(this);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, mtoolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new Creatproject()).commit();
            navigationView.setCheckedItem(R.id.createproject);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.createproject:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new Creatproject()).commit();
                break;

            case R.id.list:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Projectlist()).commit();
                break;

            case R.id.conprogress:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ConstructionProject()).commit();
                break;

            case R.id.mainprogress:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Mainproject()).commit();
                break;

            case R.id.site:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SiteVisite()).commit();
                break;


            case R.id.form:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FillInspection()).commit();
                break;


            case R.id.chat:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Chat()).commit();
                break;



            case R.id.setting:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Setting()).commit();
                break;
        }

return true;

    }

    public void onBackPressed(){

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}
