package com.stefanaleksic.habitrpg.user.elements;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Stefan on 5/27/2015.
 */
public class Daily extends Task {

    private String type;

    private List<History> history;

    //If the daily has been completed, this is true.
    private boolean completed;

    /*
        What days the user should do the daily for.
        The string represents the day while the boolean represents whether or not that daily should
        be on for that date.
    */
    private HashMap<String, Boolean> repeat;

    //This counts how many days the user has done the daily.
    private int streak;


    @Override
    public void createElement() {

    }
}
