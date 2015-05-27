package com.stefanaleksic.habitrpg.user.elements;


import java.util.Date;

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


    @Override
    public void createElement() {
        //TODO: Implement this method.
    }
}
