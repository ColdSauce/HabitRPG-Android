package com.stefanaleksic.habitrpg.user.elements;

import com.stefanaleksic.habitrpg.user.Challenge;
import com.stefanaleksic.habitrpg.user.Tag;

import java.util.Date;
import java.util.List;

/**
 * Created by Stefan on 5/26/2015.
 * The reward object abstracts away each individual reward json item from the rewards
 * json array in the User json object.
 */
public class Reward extends Task {

     private String type;

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
    public Reward(String text, Challenge challenge, String attribute, int priority, int value, List<Tag> tags, String notes, Date dateCreated, String id) {
        super(text, challenge, attribute, priority, value, tags, notes, dateCreated, id);
    }

}
