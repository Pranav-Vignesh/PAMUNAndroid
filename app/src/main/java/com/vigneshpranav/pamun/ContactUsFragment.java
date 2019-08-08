package com.vigneshpranav.pamun;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ContactUsFragment extends Fragment {
    public static View fragment;
    private TextView coord, sg, dsg1, dsg2, dsg3, dsg4;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.contactus,container,false);

        coord = (TextView) fragment.findViewById(R.id.epc);
        coord.setText(Html.fromHtml("<a href=\"mailto:pamun@asparis.fr\">pamun@asparis.fr</a>"));
        coord.setMovementMethod(LinkMovementMethod.getInstance());

        sg = (TextView) fragment.findViewById(R.id.esg);
        sg.setText(Html.fromHtml("<a href=\"mailto:pamun2018SG@asparis.fr\">pamun2018SG@asparis.fr</a>"));
        sg.setMovementMethod(LinkMovementMethod.getInstance());

        dsg1 = (TextView) fragment.findViewById(R.id.esg1);
        dsg1.setText(Html.fromHtml("<a href=\"mailto:mosyukur@asparis.fr\">mosyukur@asparis.fr</a>"));
        dsg1.setMovementMethod(LinkMovementMethod.getInstance());


        dsg2 = (TextView) fragment.findViewById(R.id.esg2);
        dsg2.setText(Html.fromHtml("<a href=\"mailto:visreedhar@asparis.fr\">visreedhar@asparis.fr</a>"));
        dsg2.setMovementMethod(LinkMovementMethod.getInstance());


        dsg3 = (TextView) fragment.findViewById(R.id.esg3);
        dsg3.setText(Html.fromHtml("<a href=\"mailto:shmisra@asparis.fr\">shmisra@asparis.fr</a>"));
        coord.setMovementMethod(LinkMovementMethod.getInstance());


        dsg4 = (TextView) fragment.findViewById(R.id.esg4);
        dsg4.setText(Html.fromHtml("<a href=\"mailto:gapoupel@asparis.fr\">gapoupel@asparis.fr</a>"));
        dsg4.setMovementMethod(LinkMovementMethod.getInstance());




        return fragment;
    }

}