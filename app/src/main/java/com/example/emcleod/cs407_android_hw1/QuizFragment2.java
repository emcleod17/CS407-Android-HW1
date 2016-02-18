package com.example.emcleod.cs407_android_hw1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by emcleod on 2/18/16.
 */
public class QuizFragment2 extends Fragment{

    public QuizFragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;
        view = inflater.inflate(R.layout.fragment_quizfragment2, container, false);

        return view;
    }
}
