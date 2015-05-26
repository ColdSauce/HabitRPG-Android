package com.stefanaleksic.habitrpg.user.elements;

import com.stefanaleksic.habitrpg.ConstantValues.Type;
import com.stefanaleksic.habitrpg.user.Challenge;
import com.stefanaleksic.habitrpg.user.Tag;

import java.util.Date;
import java.util.List;

/**
 * Created by Stefan on 5/26/2015.
 */
public abstract class HRElement {
    //What the HRElement is called.
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

    //The type cooresponds to the element type. The different types are in the Type enum in
    //ConstantValues.
    private Type type;

    /**
     * Sends a post request to the Habit RPG server.
     * Different for each Habit RPG "Element" so implementation is up to the sub classes of this
     * class.
     */
    public abstract void createElement();

    /**
     * @return name of the element (HrElement.text)
     */
    @Override
    public String toString() {
        return "HRElement{" +
                "text='" + text + '\'' +
                '}';
    }
}
