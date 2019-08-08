package com.vigneshpranav.pamun;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResearchReportActivity extends AppCompatActivity {
    private Button ga1,sc1,sc2,ecosoc1,ecosoc2,pc1, pc2, hc1, hc2, ec1, ec2, unodc1, unodc2, unctad1, unctad2, sdc1, sdc2, special1;
    private TextView ga,sc,ecosoc,pc,hc,ec,  unodc, unctad, sdc, special;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_report);

        ga1 = (Button) findViewById(R.id.ga1);
        sc1 = (Button) findViewById(R.id.sc1);
        sc2 = (Button) findViewById(R.id.sc2);
        ecosoc1 = (Button) findViewById(R.id.ecosoc1);
        ecosoc2 = (Button) findViewById(R.id.ecosoc2);
        pc1 = (Button) findViewById(R.id.pc1);
        pc2 = (Button) findViewById(R.id.pc2);
        hc1 = (Button) findViewById(R.id.hc1);
        hc2 = (Button) findViewById(R.id.hc2);
        ec1 = (Button) findViewById(R.id.ec1);
        ec2 = (Button) findViewById(R.id.ec2);
        unodc1 = (Button) findViewById(R.id.unodc1);
        unodc2 = (Button) findViewById(R.id.unodc2);
        unctad1 = (Button) findViewById(R.id.unctad1);
        unctad2 = (Button) findViewById(R.id.unctad2);
        sdc1 = (Button) findViewById(R.id.sdc1);
        sdc2 = (Button) findViewById(R.id.sdc2);
        special1 = (Button) findViewById(R.id.special1);

        ga = (TextView) findViewById(R.id.ga);
        sc = (TextView) findViewById(R.id.sc);
        ecosoc = (TextView) findViewById(R.id.ecosoc);
        pc = (TextView) findViewById(R.id.pc);
        hc = (TextView) findViewById(R.id.hc);
        ec = (TextView) findViewById(R.id.ec);
        unodc = (TextView) findViewById(R.id.unodc);
        sdc = (TextView) findViewById(R.id.sdc);
        special = (TextView) findViewById(R.id.special);

        ga1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_GA_GlobalCompactForMigration.pdf"));
                startActivity(browserIntent);
            }
        });
        sc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_-SC-Rohingya.pdf"));
                startActivity(browserIntent);
            }
        });
        sc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_SC-CEUNPA.pdf"));
                startActivity(browserIntent);
            }
        });
        ecosoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_-ECOSOC-Corporate-Responsibility-1.pdf"));
                startActivity(browserIntent);
            }
        });
        ecosoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_ECOSOC-Finance-SDG.pdf"));
                startActivity(browserIntent);
            }
        });
        pc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_PoliticalStateBuilding.pdf"));
                startActivity(browserIntent);
            }
        });
        pc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_-Political-corruption.pdf"));
                startActivity(browserIntent);
            }
        });
        hc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_-HR-Indigenous-peoples-1.pdf"));
                startActivity(browserIntent);
            }
        });
        hc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED-2_-HR-humanitarian-aid.pdf"));
                startActivity(browserIntent);
            }
        });
        ec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED-EC-Marine-Resources.pdf"));
                startActivity(browserIntent);
            }
        });
        ec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_-EC-Envrionmentally-displaced-peoples.pdf"));
                startActivity(browserIntent);
            }
        });
        unodc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_UNODC-Cultural-Property.pdf"));
                startActivity(browserIntent);
            }
        });
        unodc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_-UNODC-Sports-corruption.pdf"));
                startActivity(browserIntent);
            }
        });
        unctad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_-UNCTAD-biodiversity-and-IP-1.pdf"));
                startActivity(browserIntent);
            }
        });
        unctad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_-UNCTAD-diversification-of-CDDC.pdf"));
                startActivity(browserIntent);
            }
        });
        sdc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_-SDC-Food-Security-1.pdf"));
                startActivity(browserIntent);
            }
        });
        sdc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_-SDC-Gender-Mainstreaming-11.pdf"));
                startActivity(browserIntent);
            }
        });
        special.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2014/04/OK_EDITED_-SPECIAL-REVISION-OF-ICJ-1.pdf"));
                startActivity(browserIntent);
            }
        });





    }
}