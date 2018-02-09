package com.londonappbrewery.destini;

/**
 * Created by ADITYA on 07-Feb-18.
 */

public class ChangeStory {
    private int mStoryId;
    private int mTopAnswer;
    private int mBottomAnswer;

    public ChangeStory(int storyResourceId, int  topAnswer, int bottomAnswer){
        mStoryId = storyResourceId;
        mTopAnswer = topAnswer;
    }

    public int getStoryId() {
        return mStoryId;
    }

    public void setStoryId(int storyId) {
        mStoryId = storyId;
    }

    public int getTopAnswer() {
        return mTopAnswer;
    }

    public void setTopAnswer(int topAnswer) {
        mTopAnswer = topAnswer;
    }

    public int getBottomAnswer() {
        return mBottomAnswer;
    }

    public void setBottomAnswer(int bottomAnswer) {
        mBottomAnswer = bottomAnswer;
    }
}
