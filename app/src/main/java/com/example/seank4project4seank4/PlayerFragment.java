package com.example.seank4project4seank4;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class PlayerFragment extends Fragment {

    private PlayerViewModel mViewModel;
    private static final String TAG = "PlayerFragment";

    public static PlayerFragment newInstance() {
        return new PlayerFragment();
    }

    @Override
    public void onViewCreated (View view, Bundle savedInstanceState){

        Log.i(TAG, getClass().getSimpleName() + ":entered onViewCreated()");
        super.onViewCreated(view, savedInstanceState);

        mViewModel = new ViewModelProvider(requireActivity()).get(PlayerViewModel.class);

        int startState = requireArguments().getInt("startState");
        if(startState == 0) /* App just opened and needs to show opening text */ {
            TextView textView = view.findViewById(R.id.fragment_player_textView1);
            textView.setText("Hello press start in the menu to get started");
            Log.i("OnViewCreated","Test");
        }
        else if(startState == 1) /* Game has started */ {

        }
        else /* App opened and doesn't need to show the opening text */ {
            TextView textView = view.findViewById(R.id.fragment_player_textView1);
            textView.setText("");
        }
    }

}