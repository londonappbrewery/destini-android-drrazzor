package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex = 1;
    int mStory;
    int mTopAns;
    int mBottomAns;

    private ChangeStory[] mStoryBank = new ChangeStory[]{
            new ChangeStory(R.string.T1_Story,R.string.T1_Ans1, R.string.T1_Ans2),
            new ChangeStory(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new ChangeStory(R.string.T3_Story,R.string.T3_Ans1, R.string.T3_Ans2),
            new ChangeStory(R.string.T4_End,0,0),
            new ChangeStory(R.string.T5_End,0,0),
            new ChangeStory(R.string.T6_End,0,0),
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini", "Top button pressed");
                mStoryIndex = mStoryIndex + 1;
                updateStory();
                updateTopButton();

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini", "Bottom button pressed");
                mStoryIndex = mStoryIndex + 1;
                updateStory();
                updateBottomButton();
            }
        });

    }

    private void updateStory() {
        if (mStoryIndex == 1) {
            mStory = mStoryBank[mStoryIndex].getStoryId();
            mStoryTextView.setText(mStory);

        }  else if (mStoryIndex == 2) {
            mStory = mStoryBank[mStoryIndex].getStoryId();
            mStoryTextView.setText(mStory);

        } else if (mStoryIndex == 3) {
            mStory = mStoryBank[mStoryIndex].getStoryId();
            mStoryTextView.setText(mStory);
        } else {
            mStory = mStoryBank[mStoryIndex].getStoryId();
            mStoryTextView.setText(mStory);
        }

    }
    private void updateTopButton(){
        mTopAns = mStoryBank[mStoryIndex].getTopAnswer();
        mButtonTop.setText(mTopAns);

    }

    private void updateBottomButton(){
        mBottomAns = mStoryBank[mStoryIndex].getBottomAnswer();
        mButtonBottom.setText(mBottomAns);


    }



}
