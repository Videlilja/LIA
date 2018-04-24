package com.videlilja.linda.lia.screen.quiz;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.videlilja.linda.lia.model.Quiz;
import java.util.ArrayList;
import java.util.List;

public class QuizAdapter extends RecyclerView.Adapter<QuizViewHolder> {
    private List<Quiz> mData = new ArrayList<>();
    private OnQuizClickedListener mQuizClickListener;
    public QuizAdapter(OnQuizClickedListener onQuizClickedListener) {
        mQuizClickListener = onQuizClickedListener;
    }

    public void setData(List<Quiz> data) {
        mData = data;
        notifyDataSetChanged();
    }

    @Override
    public QuizViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return QuizViewHolder.newInstance(parent, mQuizClickListener);
    }

    @Override
    public void onBindViewHolder(QuizViewHolder holder, int position) {
        holder.bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}