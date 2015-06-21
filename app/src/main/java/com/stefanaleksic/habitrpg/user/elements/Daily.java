package com.stefanaleksic.habitrpg.user.elements;

import com.stefanaleksic.habitrpg.user.Challenge;
import com.stefanaleksic.habitrpg.user.Tag;

import java.util.Date;
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

    /**
     * @param text
     * @param challenge
     * @param attribute
     * @param priority
     * @param value
     * @param tags        describes what a task does.
     * @param notes
     * @param dateCreated
     * @param id
     */
    public Daily(String text, Challenge challenge, String attribute, int priority, int value, List<Tag> tags, String notes, Date dateCreated, String id) {
        super(text, challenge, attribute, priority, value, tags, notes, dateCreated, id);
    }



}
