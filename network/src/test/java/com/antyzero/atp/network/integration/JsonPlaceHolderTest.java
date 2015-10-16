package com.antyzero.atp.network.integration;

import com.antyzero.atp.network.Api;
import com.antyzero.atp.network.model.Post;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import rx.observers.TestSubscriber;

/**
 *
 */
public class JsonPlaceHolderTest {

    private Api api;

    @Before
    public void setUp() throws Exception {
        api = new Api();
    }

    @Test
    public void testPosts() throws Exception {

        // given
        TestSubscriber<List<Post>> testSubscriber = new TestSubscriber<>();

        // when
        api.getJsonplaceholder().posts().subscribe( testSubscriber );

        // then
        testSubscriber.assertNoErrors();
        testSubscriber.assertCompleted();
    }
}