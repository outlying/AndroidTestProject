package com.antyzero.atp.network.mock;

import com.antyzero.atp.network.Api;
import com.antyzero.atp.network.model.Post;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.mockwebserver.MockResponse;
import com.squareup.okhttp.mockwebserver.MockWebServer;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import rx.observers.TestSubscriber;

/**
 *
 */
public class JsonPlaceHolderTest {

    private MockWebServer server;
    private Api api;

    @Before
    public void setUp() throws Exception {
        server = new MockWebServer();
        server.start();

        api = new Api( HttpUrl.get( server.url( "/" ).uri() ) );
    }

    @Test
    public void testPosts() throws Exception {

        // given
        String response = "[\n" +
                "  {\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 1,\n" +
                "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
                "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 2,\n" +
                "    \"title\": \"qui est esse\",\n" +
                "    \"body\": \"est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla\"\n" +
                "  }]";
        server.enqueue( new MockResponse().setBody( response ) );
        TestSubscriber<List<Post>> testSubscriber = new TestSubscriber<>();

        // when
        api.getJsonplaceholder().posts().subscribe( testSubscriber );

        // then
        testSubscriber.assertNoErrors();
        testSubscriber.assertCompleted();
    }
}