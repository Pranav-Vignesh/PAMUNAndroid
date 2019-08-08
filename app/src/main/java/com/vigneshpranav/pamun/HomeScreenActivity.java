package com.vigneshpranav.pamun;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class HomeScreenActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        HomeFragment homeFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, homeFragment).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
        /*

        int count = getSupportFragmentManager().getBackStackEntryCount();

        if (count == 1) {
            super.onBackPressed();
            Intent intent = new Intent(getBaseContext(), HomeScreenActivity.class);
            startActivity(intent);
        }
        else {
            getSupportFragmentManager().popBackStack();
        }*/
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            HomeFragment homeFragment = new HomeFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, homeFragment).addToBackStack(null).commit();

        } else if (id == R.id.pamun2018) {
            PAMUN2018Fragment pamun2018Fragment = new PAMUN2018Fragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, pamun2018Fragment).addToBackStack(null).commit();
        } else if (id == R.id.rop) {
            RulesOfProceduresFragment rulesOfProceduresFragment = new RulesOfProceduresFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, rulesOfProceduresFragment).addToBackStack(null).commit();

        } else if (id == R.id.cw) {
            ClauseWritingFragment clauseWritingFragment = new ClauseWritingFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, clauseWritingFragment).addToBackStack(null).commit();

        } else if (id == R.id.rci) {
            Intent intent = new Intent(this, RelevantCountryInfoActivity.class);
            startActivity(intent);
           /* RelevantCountryInformationFragment relevantCountryInformationFragment = new RelevantCountryInformationFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame,relevantCountryInformationFragment).commit();*/
        } else if (id == R.id.idr) {
            ImportantDocumentResourcesFragment importantDocumentResourcesFragment = new ImportantDocumentResourcesFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame,importantDocumentResourcesFragment).commit();

        } else if (id == R.id.snap) {
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://snapchat.com/add/pamun2018"));
                intent.setPackage("com.snapchat.android");
                startActivity(intent);
            }catch (Exception e){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://snapchat.com/add/pamun2018")));
            }
        }
        else if (id == R.id.contactus) {
            ContactUsFragment contactUsFragment = new ContactUsFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame,contactUsFragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
