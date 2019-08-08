package com.vigneshpranav.pamun;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RulesOfProceduresFragment extends Fragment {
    public static View fragment;
    private TextView clausebasedtext, caucustext, structuretext, openclosedtext, pointsmotionstext, amendmentstext, votingtext, miscellaneoustext;
    private Button learnmore0, learnmore1, learnmore2, learnmore3, learnmore4, learnmore5, learnmore6, learnmore7;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.rulesofprocedures,container,false);
        clausebasedtext = (TextView) fragment.findViewById(R.id.clausebaseddebatetext);
        learnmore0 = (Button) fragment.findViewById(R.id.learn_more_0);
        pointsmotionstext = (TextView) fragment.findViewById(R.id.pointsmotionstext);
        learnmore1 = (Button) fragment.findViewById(R.id.learn_more_1);
        caucustext = (TextView) fragment.findViewById(R.id.caucustext);
        learnmore2 = (Button) fragment.findViewById(R.id.learn_more_2);
        structuretext = (TextView) fragment.findViewById(R.id.structureofdebatetext);
        learnmore3 = (Button) fragment.findViewById(R.id.learn_more_3);
        openclosedtext = (TextView) fragment.findViewById(R.id.opencloseddebatetext);
        learnmore4 = (Button) fragment.findViewById(R.id.learn_more_4);
        amendmentstext = (TextView) fragment.findViewById(R.id.amendmentstext);
        learnmore5 = (Button) fragment.findViewById(R.id.learn_more_5);
        votingtext = (TextView) fragment.findViewById(R.id.votingtext);
        learnmore6 = (Button) fragment.findViewById(R.id.learn_more_6);
        miscellaneoustext = (TextView) fragment.findViewById(R.id.miscellaneoustext);
        learnmore7 = (Button) fragment.findViewById(R.id.learn_more_7);

        final LinearLayout.LayoutParams layoutparams = (LinearLayout.LayoutParams) clausebasedtext.getLayoutParams();

        learnmore0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore0.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    clausebasedtext.setText(getString(R.string.clausedbaseddebatetext));
                    learnmore0.setText("Show Less...");
                }
                else
                {
                    clausebasedtext.setText("");
                    layoutparams.height = 0;
                    learnmore0.setText("Learn More...");
                }
            }
        });

        final LinearLayout.LayoutParams layoutparams2 = (LinearLayout.LayoutParams) pointsmotionstext.getLayoutParams();

        learnmore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore1.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams2.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    pointsmotionstext.setText(getString(R.string.pointsmotionstext));
                    learnmore1.setText("Show Less...");
                }
                else
                {
                    pointsmotionstext.setText("");
                    layoutparams2.height = 0;
                    learnmore1.setText("Learn More...");
                }
            }
        });

        final LinearLayout.LayoutParams layoutparams3 = (LinearLayout.LayoutParams) caucustext.getLayoutParams();

        learnmore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore2.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams3.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    caucustext.setText(getString(R.string.caucus_lobbyingtext));
                    learnmore2.setText("Show Less...");
                }
                else
                {
                    caucustext.setText("");
                    layoutparams3.height = 0;
                    learnmore2.setText("Learn More...");
                }
            }
        });

        final LinearLayout.LayoutParams layoutparams4 = (LinearLayout.LayoutParams) structuretext.getLayoutParams();

        learnmore3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore3.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams4.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    structuretext.setText(getString(R.string.structureofdebatetext));
                    learnmore3.setText("Show Less...");
                }
                else
                {
                    layoutparams4.height = 0;
                    learnmore3.setText("Learn More...");
                }
            }
        });

        final LinearLayout.LayoutParams layoutparams5 = (LinearLayout.LayoutParams) openclosedtext.getLayoutParams();

        learnmore4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore4.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams5.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    openclosedtext.setText(getString(R.string.opencloseddebatetext));
                    learnmore4.setText("Show Less...");
                }
                else
                {
                    openclosedtext.setText("");
                    layoutparams5.height = 0;
                    learnmore4.setText("Learn More...");
                }
            }
        });

        final LinearLayout.LayoutParams layoutparams6 = (LinearLayout.LayoutParams) amendmentstext.getLayoutParams();

        learnmore5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore5.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams6.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    amendmentstext.setText(getString(R.string.amendmentstext));
                    learnmore5.setText("Show Less...");
                }
                else
                {
                    amendmentstext.setText("");
                    layoutparams6.height = 0;
                    learnmore5.setText("Learn More...");
                }
            }
        });

        final LinearLayout.LayoutParams layoutparams7 = (LinearLayout.LayoutParams) votingtext.getLayoutParams();

        learnmore6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore6.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams7.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    votingtext.setText(getString(R.string.votingtext));
                    learnmore6.setText("Show Less...");
                }
                else
                {
                    votingtext.setText("");
                    layoutparams7.height = 0;
                    learnmore6.setText("Learn More...");
                }
            }
        });

        final LinearLayout.LayoutParams layoutparams8 = (LinearLayout.LayoutParams) miscellaneoustext.getLayoutParams();

        learnmore7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore7.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams8.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    miscellaneoustext.setText(getString(R.string.miscellaneoustext));
                    learnmore7.setText("Show Less...");
                }
                else
                {
                    miscellaneoustext.setText("");
                    layoutparams8.height = 0;
                    learnmore7.setText("Learn More...");
                }
            }
        });

        return fragment;
    }

}
