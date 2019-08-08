package com.vigneshpranav.pamun;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ImportantDocumentResourcesFragment extends Fragment {
    public static View fragment;
    private Button pamunwebsite;
    private Button uncharter;
    private Button universaldec;
    private Button unausa;
    private Button bestdelegate;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.importantdocres,container,false);
        pamunwebsite = (Button) fragment.findViewById(R.id.pamunwebsite);
        pamunwebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://asp-edu.net/pamun/"));
                startActivity(browserIntent);
            }
        });
        uncharter = (Button) fragment.findViewById(R.id.uncharter);
        uncharter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.un.org/en/sections/un-charter/un-charter-full-text/"));
                startActivity(browserIntent);
            }
        });
        universaldec = (Button) fragment.findViewById(R.id.universal);
        universaldec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.un.org/en/universal-declaration-human-rights/index.html"));
                startActivity(browserIntent);
            }
        });
        unausa = (Button) fragment.findViewById(R.id.una);
        unausa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.unausa.org/global-classrooms-model-un"));
                startActivity(browserIntent);
            }
        });
        bestdelegate = (Button) fragment.findViewById(R.id.best);
        bestdelegate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bestdelegate.com"));
                startActivity(browserIntent);
            }
        });
        return fragment;
    }

}
