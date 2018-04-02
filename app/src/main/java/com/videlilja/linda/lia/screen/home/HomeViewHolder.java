package com.videlilja.linda.lia.screen.home;

import android.content.Entity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.videlilja.linda.lia.R;
import com.videlilja.linda.lia.model.Home;

/**
 * Created by ilisa on 2018-03-27.
 */

public class HomeViewHolder extends RecyclerView.ViewHolder {
    private TextView mLabel;
    private Home mEntity;
    public HomeViewHolder(View itemView, final OnHomeClickedListener listener) {
        super(itemView);
        mLabel = itemView.findViewById(R.id.home_label);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                listener.onHomeClicked(mEntity);
            }
        });
    }
    public void bind(Home entity) {
        mEntity = entity;
        mLabel.setText(entity.getLabel());
    }
    public static HomeViewHolder newInstance(final ViewGroup parent,
                                             OnHomeClickedListener listener) {
        return new HomeViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.home_item,
                        parent,
                        false
                ),
                listener
        );
    }
}