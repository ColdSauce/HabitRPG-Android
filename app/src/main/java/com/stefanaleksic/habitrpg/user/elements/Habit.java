package com.stefanaleksic.habitrpg.user.elements;

import java.util.List;

/**
 * Created by Stefan on 5/27/2015.
 */
public class Habit extends Task {
    private String type;
    private List<History> history;
    private boolean up,down;

    @Override
    public void createElement() {

    }
}
