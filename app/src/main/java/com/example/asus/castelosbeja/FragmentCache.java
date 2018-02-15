package com.example.asus.castelosbeja;

/**
 * Created by Asus on 09/02/2018.
 */

public class FragmentCache {
    static CastlesFragment castlesFragment1;
    static CastlesFragment castlesFragment2;
    static DetailsFragment detailsFragment1;
    static DetailsFragment detailsFragment2;

    public static CastlesFragment getCastlesFragment1(){
        if (null == castlesFragment1) castlesFragment1 = new CastlesFragment();
        return castlesFragment1;
    }

    public static CastlesFragment getCastlesFragment2(){
        if (null == castlesFragment2) castlesFragment2 = new CastlesFragment();
        return castlesFragment2;
    }

    public static DetailsFragment getDetailsFragment1(){
        if (null == detailsFragment1) detailsFragment1 = new DetailsFragment();
        return detailsFragment1;
    }

    public static DetailsFragment getDetailsFragment2(){
        if (null == detailsFragment2) detailsFragment2 = new DetailsFragment();
        return detailsFragment2;
    }
}
