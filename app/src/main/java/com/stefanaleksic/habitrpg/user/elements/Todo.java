package com.stefanaleksic.habitrpg.user.elements;


import com.stefanaleksic.habitrpg.user.Challenge;
import com.stefanaleksic.habitrpg.user.Tag;

import java.util.Date;
import java.util.List;

/**
 * Created by Stefan on 5/26/2015.
 * The to-do class abstracts the to-do json object found in the User json object.
 */
public class Todo extends Task {

    private String type;
    private boolean completed;
    private Date dateCompleted;

    //Due date for todos
    private String date;

    private Checklist checklist;

    /**
     * All parameters that are self explanatory are not commented.
     *
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
    public Todo(String text, Challenge challenge, String attribute, int priority, int value, List<Tag> tags, String notes, Date dateCreated, String id) {
        super(text, challenge, attribute, priority, value, tags, notes, dateCreated, id);
    }




}
