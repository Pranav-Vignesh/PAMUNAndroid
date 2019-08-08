package com.vigneshpranav.pamun;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Theme_Issues_Activity extends AppCompatActivity {
    private TextView theme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_issues);


        theme = (TextView) findViewById(R.id.theme);

        ArrayList<Committee>issues = new ArrayList<>(); //creating ArrayList of committee objects (includes committee name and issues - put into adapter)

        issues.add(new Committee("General Assembly",
                "\u2022 Drafting a Global Compact for Migration",
                ""));
        issues.add(new Committee("Security Council",
                "\u2022 Question of the Rohingya crisis",
                "\u2022 Question of Establishing a UN Parliamentary Assembly"));
        issues.add(new Committee("ECOSOC",
                "\u2022 Creating a framework for corporate responsibility in\n\tpreservation of socioeconomic rights",
                "\u2022 Question of financing the sustainable development goals in\n\tLEDCs through mutual cooperation"));
        issues.add(new Committee("Political Committee",
                "\u2022 Measures to promote state-building and good governance\n\tin the Middle East in furtherance of combatting the growth\n\tof radicalism – the case of Iraq",
                "\u2022 Question of mobilizing the international community to\n\tactively combat corruption"));
        issues.add(new Committee("Human Rights Committee",
                "\u2022 Measures to strengthen the rights of the indigenous people",
                "\u2022 Measures to strengthen coordination of humanitarian aid in\n\tresponse to emergencies"));
        issues.add(new Committee("Environment Committee",
                "\u2022 Question of the sustainable use and management of marine\n\tresources",
                "\u2022 Question of environmentally displaced people"));
        issues.add(new Committee("UNODC",
                "\u2022 Measures to stem trafficking of cultural property",
                "\u2022 Question of corruption in sporting events"));
        issues.add(new Committee("UNCTAD",
                "\u2022 Question of intellectual property and biodiversity",
                "\u2022 Measures to promote the diversification of economies in\n\tCDDCs"));
        issues.add(new Committee("Sustainable Development Commission",
                "\u2022 Question of agriculture and food security",
                "\u2022 Question of gender mainstreaming in all sectors of the\n\teconomy"));
        issues.add(new Committee("Special Committee",
                "\u2022 Redefining the role of the International Court of Justice",
                ""));
        issues.add(new Committee("ICJ",
                "\u2022 Ukraine vs. Russian Federation:\n\tApplication of the International Convention for the\n\tSuppression of the Financing of Terrorism and of the\n\tInternational Convention on the Elimination of All Forms of\n\tRacial Discrimination",
                ""));

        CommitteeAdapter committeeAdapter = new CommitteeAdapter(this, issues);
        final ListView listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(committeeAdapter);


    }

    /*@Override
    public void onBackPressed() {
        PAMUN2018Fragment pamun2018Fragment = new PAMUN2018Fragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, pamun2018Fragment).commit();

    }*/
}
