package com.vigneshpranav.pamun;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CountryListsActivity extends AppCompatActivity {

    private Button scmembers;
    private Button ecosocmembers;
    private Button unodcmembers;
    private Button spcommitteemembers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_lists);

        scmembers = (Button) findViewById(R.id.scmembers);
        ecosocmembers = (Button) findViewById(R.id.ecosocmembers);
        unodcmembers = (Button) findViewById(R.id.unodcmembers);
        spcommitteemembers = (Button) findViewById(R.id.spcommitteemembers);

        scmembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2017/04/country-list.pdf"));
                startActivity(browserIntent);
            }
        });

        ecosocmembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2017/04/Membership_ECOSOC.pdf"));
                startActivity(browserIntent);
            }
        });

        unodcmembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2017/04/Membership-UNODC.pdf"));
                startActivity(browserIntent);
            }
        });

        spcommitteemembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/pamun2013/wp-content/uploads/2017/04/Membership_Special-Committee.pdf"));
                startActivity(browserIntent);
            }
        });

    }
}
