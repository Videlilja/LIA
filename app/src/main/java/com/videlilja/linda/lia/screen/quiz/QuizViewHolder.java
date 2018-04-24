package com.videlilja.linda.lia.screen.quiz;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.videlilja.linda.lia.R;
import com.videlilja.linda.lia.model.Quiz;

public class QuizViewHolder extends RecyclerView.ViewHolder {
    private TextView mLabel;
    private Quiz mEntity;
    private ImageView mImage;

    public QuizViewHolder(View itemView, final OnQuizClickedListener listener) {
        super(itemView);
        mLabel = itemView.findViewById(R.id.quiz_label);
        mImage = itemView.findViewById(R.id.quiz_image_view);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                listener.onQuizClicked(mEntity);
            }
        });

    }

    public void bind(Quiz entity) {
        mEntity = entity;
        mLabel.setText(entity.getmName());
        mImage.setImageResource(entity.getmImage());
    }
    public static com.videlilja.linda.lia.screen.quiz.QuizViewHolder newInstance(final ViewGroup parent,
                                                                                 OnQuizClickedListener listener) {
        return new com.videlilja.linda.lia.screen.quiz.QuizViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.quiz_item,
                        parent,
                        false
                ),
                listener
        );
    }


}