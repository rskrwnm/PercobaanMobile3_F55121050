package com.reskidwiramadhaniirawan_F55121050.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentExplore extends Fragment {
    View view;

    public FragmentExplore() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedinstanceState) {
        view = inflater.inflate(R.layout.explore_fragment, container, false);
        return view;
    }
}
