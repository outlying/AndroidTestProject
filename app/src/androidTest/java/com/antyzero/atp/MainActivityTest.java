package com.antyzero.atp;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super( MainActivity.class );
    }

    public void testCreation() throws Exception {
        getActivity();
    }
}