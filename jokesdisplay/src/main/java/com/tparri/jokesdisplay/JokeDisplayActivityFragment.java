package com.tparri.jokesdisplay;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokeDisplayActivityFragment extends Fragment {

    public final static String JOKE_KEY = "joke";

    private TextView jokeTextView;

    public JokeDisplayActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root  = inflater.inflate(R.layout.fragment_joke_display, container, false);
        jokeTextView = root.findViewById(R.id.joke_text_view);

        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Intent intent = getActivity().getIntent();
        if(intent.hasExtra(JOKE_KEY)) {
            jokeTextView.setText(intent.getStringExtra(JOKE_KEY));
        } else {
            jokeTextView.setText("Error in retrieving joke!");
        }
    }
}
