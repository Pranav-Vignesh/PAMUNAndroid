package com.vigneshpranav.pamun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    private TextView bpolitics, bpoliticstext, specialclausetopics, specialclausetopicstext, spt, spttext, noteapp, noteapptext;
    private Button learnmore1, learnmore2, learnmore3, learnmore4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        bpolitics = (TextView) findViewById(R.id.blockPolitics);
        bpoliticstext = (TextView) findViewById(R.id.blockPoliticstext);
        learnmore1 = (Button) findViewById(R.id.learnmore);
        specialclausetopics = (TextView) findViewById(R.id.spclausetopics);
        specialclausetopicstext = (TextView) findViewById(R.id.spclausetopicstext);
        learnmore2 = (Button) findViewById(R.id.learnmore2);
        spt = (TextView) findViewById(R.id.spt);
        spttext = (TextView) findViewById(R.id.spttext);
        learnmore3 = (Button) findViewById(R.id.learnmore3);


        final LinearLayout.LayoutParams layoutparams = (LinearLayout.LayoutParams) bpoliticstext.getLayoutParams();

        learnmore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore1.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    bpoliticstext.setText(getString(R.string.sbpoliticstext));
                    learnmore1.setText("Show Less...");
                }
                else
                {
                    bpoliticstext.setText("");
                    layoutparams.height = 0;
                    learnmore1.setText("Learn More...");
                }
            }
        });

        final LinearLayout.LayoutParams layoutparams2 = (LinearLayout.LayoutParams) specialclausetopicstext.getLayoutParams();

        learnmore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore2.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams2.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    specialclausetopicstext.setText(getString(R.string.specialclausetopicstext));
                    learnmore2.setText("Show Less...");
                }
                else
                {
                    specialclausetopicstext.setText("");
                    layoutparams2.height = 0;
                    learnmore2.setText("Learn More...");
                }
            }
        });

        final LinearLayout.LayoutParams layoutparams3 = (LinearLayout.LayoutParams) spttext.getLayoutParams();

        learnmore3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (learnmore3.getText().toString().equalsIgnoreCase("Learn More..."))
                {
                    layoutparams3.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    spttext.setText(getString(R.string.spttext));
                    learnmore3.setText("Show Less...");
                }
                else
                {
                    spttext.setText("");
                    layoutparams3.height = 0;
                    learnmore3.setText("Learn More...");
                }
            }
        });



    }
}