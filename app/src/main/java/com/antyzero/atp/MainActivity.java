package com.antyzero.atp;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.antyzero.atp.base.BaseActivity;
import com.antyzero.atp.network.Api;
import com.antyzero.atp.network.model.Post;
import com.trello.rxlifecycle.RxLifecycle;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import rx.android.schedulers.AndroidSchedulers;

import static android.support.v7.widget.LinearLayoutManager.VERTICAL;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    /*@Inject
    Api api;*/

    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;

    private final List<Post> posts = new ArrayList<>();
    private PostAdapter adapter = new PostAdapter( posts );

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        //AtpApplication.get( this ).getApplicationComponent().plus().inject( this );

        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( new LinearLayoutManager( this, VERTICAL, false ) );
        recyclerView.setAdapter( adapter );
    }

    @Override
    protected void onStart() {
        super.onStart();

        /*
        api.getJsonplaceholder().posts()
                .compose( RxLifecycle.bindActivity( lifecycle() ) )
                .observeOn( AndroidSchedulers.mainThread() )
                .subscribe( postsResponse -> {
                            posts.clear();
                            posts.addAll( postsResponse );
                            adapter.notifyDataSetChanged();
                        },
                        throwable -> Log.e( TAG, "Unable to get posts", throwable ) );
                        */
    }
}
