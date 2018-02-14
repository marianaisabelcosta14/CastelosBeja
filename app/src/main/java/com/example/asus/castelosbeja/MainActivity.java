package com.example.asus.castelosbeja;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.fragment_container) != null){
            if (FragmentCache.castlesFragment1 != null || FragmentCache.detailsFragment1 != null){
                return;
            }
            setPortraitFragment(FragmentCache.getCastlesFragment1());
        }

        else{
            if(FragmentCache.castlesFragment2 != null || FragmentCache.detailsFragment2 != null) {
                return;
            }
            setLandscapeFragments(FragmentCache.getCastlesFragment2(), FragmentCache.getDetailsFragment2());
        }
    }

    private void setPortraitFragment(CastlesFragment castlesFragment){
        castlesFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, castlesFragment).commit();
    }

    private void setLandscapeFragments(CastlesFragment castlesFragment, DetailsFragment detailsFragment){
        castlesFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_castles, castlesFragment).commit();

        detailsFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_details, detailsFragment).commit();
    }
}
