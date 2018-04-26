package com.videlilja.linda.lia.screen.quiz;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.videlilja.linda.lia.model.Quiz;

import java.util.ArrayList;
import java.util.List;

public class QuizAdapter extends RecyclerView.Adapter<QuizViewHolder> {
    private List<Quiz> mQuizList = new ArrayList<>();
    private OnQuizClickedListener mQuizClickListener;
    public QuizAdapter(OnQuizClickedListener quizClickedListener) {
        mQuizClickListener = quizClickedListener;
    }
    public void setQuizList(final List<Quiz> quizList) {
        mQuizList = quizList;
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return mQuizList.size();
    }
    @Override
    public QuizViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return QuizViewHolder.newInstance(parent, mQuizClickListener);
    }
    @Override
    public void onBindViewHolder(QuizViewHolder holder, int position) {
        holder.bind(mQuizList.get(position));
    }
}