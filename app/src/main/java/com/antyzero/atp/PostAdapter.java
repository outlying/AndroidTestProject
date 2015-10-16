package com.antyzero.atp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.antyzero.atp.network.model.Post;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder> {

    private final List<Post> posts;

    public PostAdapter( List<Post> posts ) {
        this.posts = posts;
    }

    @Override
    public PostHolder onCreateViewHolder( ViewGroup parent, int viewType ) {
        return new PostHolder( LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_post, parent, false ) );
    }

    @Override
    public void onBindViewHolder( PostHolder holder, int position ) {
        Post post = posts.get( position );
        holder.textViewTitle.setText( post.getTitle() );
        holder.textViewContent.setText( post.getBody() );
    }

    @Override
    public long getItemId( int position ) {
        return posts.get( position ).getId();
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class PostHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.textViewTitle)
        TextView textViewTitle;
        @Bind(R.id.textViewContent)
        TextView textViewContent;

        public PostHolder( View itemView ) {
            super( itemView );
            ButterKnife.bind( this, itemView );
        }
    }
}
