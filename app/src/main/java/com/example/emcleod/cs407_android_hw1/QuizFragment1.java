package com.example.emcleod.cs407_android_hw1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by emcleod on 2/17/16.
 */
public class QuizFragment1 extends Fragment{

    public QuizFragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;
        view = inflater.inflate(R.layout.fragment_quizfragment1, container, false);

        return view;
    }
}
