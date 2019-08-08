package com.vigneshpranav.pamun;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;;


public class CommitteeAdapter extends ArrayAdapter<Committee> {

    public CommitteeAdapter(Context context, ArrayList<Committee> committees) {
        super(context, 0, committees);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Committee committee = getItem(position);
        View listItemView = convertView;
        // Check if an existing view is being reused, otherwise inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.theme_issues_item, parent, false);
        }
        // Lookup view for data population
        TextView committeeView = (TextView) listItemView.findViewById(R.id.comm);
        TextView issue1 = (TextView) listItemView.findViewById(R.id.iss1);
        TextView issue2 = (TextView) listItemView.findViewById(R.id.iss2);
        // Populate the data into the template view using the data object
        committeeView.setText(committee.getCommittee());
        issue1.setText(committee.getIssue1());
        issue2.setText(committee.getIssue2());

        return listItemView;
    }
}