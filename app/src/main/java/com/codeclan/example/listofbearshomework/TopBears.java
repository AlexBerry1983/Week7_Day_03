package com.codeclan.example.listofbearshomework;

import java.util.ArrayList;

import static android.R.id.list;

/**
 * Created by user on 24/05/2017.
 */

public class TopBears {


    private ArrayList<Bear> list;

    public TopBears() {
        list = new ArrayList<Bear>();
        list.add(new Bear(1, "Black Bear"));
        list.add(new Bear(2, "Brown Bear"));
        list.add(new Bear(3, "Sun Bear"));
        list.add(new Bear(4, "Panda"));
        list.add(new Bear(5, "Polar Bear"));
        list.add(new Bear(6, "Koala"));
        list.add(new Bear(7, "Sloth Bear"));
        list.add(new Bear(8, "Grizzly Bear"));
        list.add(new Bear(9, "Cinnamon Bear"));
        list.add(new Bear(10, "Asian Bear"));
    }



    public ArrayList<Bear> getList() {
        return new ArrayList<Bear>(list); }


}

