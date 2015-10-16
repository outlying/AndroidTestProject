package com.antyzero.atp;

import android.test.ApplicationTestCase;

public class ApplicationTest extends ApplicationTestCase<AtpApplication> {

    public ApplicationTest() {
        super( AtpApplication.class );
    }

    public void testCreation() throws Exception {
        createApplication();
    }
}