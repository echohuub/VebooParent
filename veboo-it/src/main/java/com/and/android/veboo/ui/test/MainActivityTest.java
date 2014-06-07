package com.and.android.veboo.ui.test;

import android.test.ActivityInstrumentationTestCase2;

import com.and.android.veboo.ui.MainActivity;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testActivity() {
		MainActivity activity = getActivity();
        assertNotNull(activity);
    }
}

