package com.vigneshpranav.pamun;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class RelevantCountryInformationFragment extends Fragment {
    public static View fragment;
    private Button access;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.relevantcountryinfo,container,false);

        setProgressDialog();


        return fragment;
    }

    public void setProgressDialog() {
        final ProgressDialog progressDialog = new ProgressDialog(fragment.getContext());
        progressDialog.setTitle("Loading...");
        progressDialog.setMessage("Getting Information...");
        progressDialog.show();

        Runnable progressRunnable = new Runnable() {
            @Override
            public void run() {
                progressDialog.cancel();
                Intent intent = new Intent(fragment.getContext(), RelevantCountryInfoActivity.class);
                startActivity(intent);
            }
        };

        Handler handler = new Handler();
        handler.postDelayed(progressRunnable, 1000); //Delays the method for three seconds it will show loading and getting information and then it will close that dialog.
    }

}
