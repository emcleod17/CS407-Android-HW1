package com.example.emcleod.cs407_android_hw1;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by emcleod on 2/17/16.
 */
public class QuizFragment1 extends Fragment{

    private Button submitQuest_button;

    public QuizFragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;
        view = inflater.inflate(R.layout.fragment_quizfragment1, container, false);

        submitQuest_button = (Button) view.findViewById(R.id.submitQuest_button);

        return view;
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        submitQuest_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.main_fragment_container, new QuizFragment2())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
