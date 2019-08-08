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
import android.widget.LinearLayout;
import android.widget.TextView;

public class ClauseWritingFragment extends Fragment {
    public static View fragment;
    private TextView clauseformatting, clauseformattingtext, goodclause, goodclausetext, listofoperativeclausephrases, listofoperativeclausephrasestext, previousresolutions, exclausestext;
    private Button learnmore0, learnmore1, learnmore2, clickarchive;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.clseamdwriting,container,false);
        clauseformatting = (TextView) fragment.findViewById(R.id.clauseformatting);
        clauseformattingtext = (TextView) fragment.findViewById(R.id.clauseformattingtext);
        learnmore0 = (Button) fragment.findViewById(R.id.learn_more0);
        goodclause = (TextView) fragment.findViewById(R.id.goodclause);
        goodclausetext = (TextView) fragment.findViewById(R.id.goodclausetext);
        learnmore1 = (Button) fragment.findViewById(R.id.learn_more1);
        listofoperativeclausephrases = (TextView) fragment.findViewById(R.id.listofocs);
        listofoperativeclausephrasestext = (TextView) fragment.findViewById(R.id.listofocstext);
        learnmore2 = (Button) fragment.findViewById(R.id.learn_more2);
        previousresolutions = (TextView) fragment.findViewById(R.id.previousresolutions);
        clickarchive = (Button) fragment.findViewById(R.id.clickarchive);

        final LinearLayout.LayoutParams layoutparams = (LinearLayout.LayoutParams) clauseformattingtext.getLayoutParams();

        learnmore0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore0.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    clauseformattingtext.setText(getString(R.string.clauseformattingtext));
                    learnmore0.setText("Show Less...");
                }
                else
                {
                    clauseformattingtext.setText("");
                    layoutparams.height = 0;
                    learnmore0.setText("Learn More...");
                }
            }
        });

        final LinearLayout.LayoutParams layoutparams2 = (LinearLayout.LayoutParams) goodclausetext.getLayoutParams();

        learnmore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore1.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams2.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    goodclausetext.setText(getString(R.string.goodclausetext));
                    learnmore1.setText("Show Less...");
                }
                else
                {
                    goodclausetext.setText("");
                    layoutparams2.height = 0;
                    learnmore1.setText("Learn More...");
                }
            }
        });

        final LinearLayout.LayoutParams layoutparams3 = (LinearLayout.LayoutParams) listofoperativeclausephrasestext.getLayoutParams();

        learnmore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore2.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams3.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    listofoperativeclausephrasestext.setText(getString(R.string.listopphrasestext));
                    learnmore2.setText("Show Less...");
                }
                else
                {
                    listofoperativeclausephrasestext.setText("");
                    layoutparams3.height = 0;
                    learnmore2.setText("Learn More...");
                }
            }
        });

        clickarchive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/archive/"));
                startActivity(browserIntent);
            }
        });

        return fragment;
    }

}
