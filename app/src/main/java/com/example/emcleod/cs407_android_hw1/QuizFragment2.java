package com.example.emcleod.cs407_android_hw1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by emcleod on 2/18/16.
 */
public class QuizFragment2 extends Fragment{

    private Button wow_radioButton;

    public QuizFragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;
        view = inflater.inflate(R.layout.fragment_quizfragment2, container, false);

        wow_radioButton = (Button) view.findViewById(R.id.wow_radioButton);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        wow_radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choicePressed(wow_radioButton);
            }

        });
    }

    public void choicePressed(View view) {

    }
}
