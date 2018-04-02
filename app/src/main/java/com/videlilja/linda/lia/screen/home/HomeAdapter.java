package com.videlilja.linda.lia.screen.home;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.videlilja.linda.lia.model.Home;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilisa on 2018-03-27.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder>{
    private List<Home> mData = new ArrayList<>();
    private OnHomeClickedListener mEntityClickListener;
    public HomeAdapter(OnHomeClickedListener entityClickListener) {
        mEntityClickListener = entityClickListener;
    }
    public void setData(final List<Home> data) {
        mData = data;
        notifyDataSetChanged();
    }

    @Override
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return HomeViewHolder.newInstance(parent, mEntityClickListener);
    }

    @Override
    public void onBindViewHolder(HomeViewHolder holder, int position) {
        holder.bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
