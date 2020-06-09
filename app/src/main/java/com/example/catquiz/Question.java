package com.example.catquiz;

public class Question {
    private int mTextResId;
    private boolean mIsRightAnswer;

    public Question(int textResId,boolean IsRightAnswer){
        mTextResId = textResId;
        mIsRightAnswer = IsRightAnswer;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean ismIsRightAnswer() {
        return mIsRightAnswer;
    }

    public void setmIsRightAnswer(boolean mIsRightAnswer) {
        this.mIsRightAnswer = mIsRightAnswer;
    }
}
