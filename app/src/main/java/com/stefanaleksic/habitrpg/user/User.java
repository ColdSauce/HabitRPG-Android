package com.stefanaleksic.habitrpg.user;

import com.stefanaleksic.habitrpg.user.elements.Reward;

import java.util.List;

/**
 * Created by Stefan on 5/26/2015.
 * The User is an abstraction of the User json. This allows for the UI portion of the Android
 * code to easily get attributes of the user without having to worry about JSONObjects and other
 * stuff that could make the code very messy.
 */
public class User {
    private int id;
    private List<Reward> rewards;

    //TODO: Implement rest of user.

}
