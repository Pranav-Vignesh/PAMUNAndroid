package com.vigneshpranav.pamun;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeFragment extends Fragment {
    public static View fragment;
    private TextView homeName;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.home, container, false);
        homeName = (TextView) fragment.findViewById(R.id.hometv);
        img1 = (ImageView) fragment.findViewById(R.id.img1);
        img2 = (ImageView) fragment.findViewById(R.id.img2);
        img3 = (ImageView) fragment.findViewById(R.id.img3);
        img4 = (ImageView) fragment.findViewById(R.id.img4);

        return fragment;
    }


}