package com.videlilja.linda.lia.screen.categories;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.videlilja.linda.lia.R;
import com.videlilja.linda.lia.model.Category;

/**
 * Created by ilisa on 2018-03-27.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder {
    private TextView mLabel;
    private Category mEntity;
    public CategoryViewHolder(View itemView, final OnCategoryClickedListener listener) {
        super(itemView);
        mLabel = itemView.findViewById(R.id.category_label);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                listener.onCategoryClicked(mEntity);
            }
        });
    }
    public void bind(Category entity) {
        mEntity = entity;
        mLabel.setText(entity.getLabel());
    }
    public static CategoryViewHolder newInstance(final ViewGroup parent,
                                                 OnCategoryClickedListener listener) {
        return new CategoryViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.category_item,
                        parent,
                        false
                ),
                listener
        );
    }
}
