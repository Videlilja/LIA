package com.videlilja.linda.lia.screen.categories;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.videlilja.linda.lia.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilisa on 2018-03-27.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {
    private List<Category> mData = new ArrayList<>();
    private OnCategoryClickedListener mEntityClickListener;
    public CategoryAdapter(OnCategoryClickedListener entityClickListener) {
        mEntityClickListener = entityClickListener;
    }
    public void setData(final List<Category> data) {
        mData = data;
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return mData.size();
    }
    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return CategoryViewHolder.newInstance(parent, mEntityClickListener);
    }
    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        holder.bind(mData.get(position));
    }
}