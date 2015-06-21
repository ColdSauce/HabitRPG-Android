package com.stefanaleksic.habitrpg.user.elements;

import com.stefanaleksic.habitrpg.user.Challenge;
import com.stefanaleksic.habitrpg.user.Tag;

import java.util.Date;
import java.util.List;

/**
 * Created by Stefan on 5/26/2015.
 */
public abstract class Task implements Element {
    //What the Task is called.
    private String text;

    private Challenge challenge;
    private String attribute;
    private int priority;

    //Means different things for different items. Check the api doc.
    private int value;

    //TODO: REFACTOR Not really sure how structure of tags works. Maybe this isn't the best way to
    // do it.
    //Tags are user created items which help in figuring out what types of "elements" exist.
    //Such as 'fitness' or 'studying' ... etc.
    private List<Tag> tags;

    //Each element can contain notes that a user put down. This could either be an empty string
    //or actual notes someone wrote down.
    private String notes;

    private Date dateCreated;

    //Each element has its own id.
    private String id;


    /**
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
    public Task(String text, Challenge challenge, String attribute, int priority, int value,
                List<Tag> tags, String notes, Date dateCreated, String id) {
        this.text = text;
        this.challenge = challenge;
        this.attribute = attribute;
        this.priority = priority;
        this.value = value;
        this.tags = tags;
        this.notes = notes;
        this.dateCreated = dateCreated;
        this.id = id;
    }

    /**
     * @return name of the element (HrElement.text)
     */
    @Override
    public String toString() {
        return "Task{" +
                "text='" + text + '\'' +
                '}';
    }


    //Start getter methods. Oh god java why do you have to do this..


    public String getText() {
        return text;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public String getAttribute() {
        return attribute;
    }

    public int getPriority() {
        return priority;
    }

    public int getValue() {
        return value;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public String getNotes() {
        return notes;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getId() {
        return id;
    }

    //end getter methods.


}
