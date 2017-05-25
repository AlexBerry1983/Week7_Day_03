package com.codeclan.example.listofbearshomework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 24/05/2017.
 */

public class TopBearsAdapter extends ArrayAdapter<Bear> {

    public TopBearsAdapter(Context context, ArrayList<Bear> bears) {
        super(context, 0, bears);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        Bear currentBear = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.bear_ranking);
        ranking.setText(Integer.toString(currentBear.getRanking()));

        TextView type = (TextView) listItemView.findViewById(R.id.bear_type);
        type.setText(currentBear.getType());

        listItemView.setTag(currentBear);

        return listItemView;


    }

}
