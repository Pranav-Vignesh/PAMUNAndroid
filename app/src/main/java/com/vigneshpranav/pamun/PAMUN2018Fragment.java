package com.vigneshpranav.pamun;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PAMUN2018Fragment extends Fragment {
    public static View fragment;
    private Button theme;
    private Button researchReports;
    private Button confSchedule;
    private Button newFeatures;
    private Button execTeam;
    private Button venue;
    private Button countryLists;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.pamun2018,container,false);
        theme = (Button) fragment.findViewById(R.id.theme);
        confSchedule = (Button) fragment.findViewById(R.id.conf);
        newFeatures = (Button) fragment.findViewById(R.id.whatisnew);
        execTeam = (Button) fragment.findViewById(R.id.executive);
        researchReports = (Button) fragment.findViewById(R.id.researchreports);
        venue = (Button) fragment.findViewById(R.id.venue);
        countryLists = (Button) fragment.findViewById(R.id.countrylist);

        theme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment.getContext(), Theme_Issues_Activity.class);
                startActivity(intent);
            }
        });

        researchReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment.getContext(), ResearchReportActivity.class);
                startActivity(intent);
            }
        });

        confSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment.getContext(), ConferenceScheduleActivity.class);
                startActivity(intent);
            }
        });

        newFeatures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment.getContext(), NewActivity.class);
                startActivity(intent);
            }
        });

        countryLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment.getContext(), CountryListsActivity.class);
                startActivity(intent);
            }
        });

        execTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment.getContext(), ExecTeamActivity.class);
                startActivity(intent);
            }
        });

        venue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Maison de la Mutualité, Paris");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        return fragment;
    }

}
