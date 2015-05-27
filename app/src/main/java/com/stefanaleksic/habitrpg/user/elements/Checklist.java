package com.stefanaleksic.habitrpg.user.elements;

/**
 * Created by Stefan on 5/27/2015.
 */
public class Checklist {
    private boolean completed;
    private String text;
    private String id;
    private boolean isCollapsed;

    /**
     * Collapses the checklist.
     */
    public void collapse(){
        isCollapsed = true;
    }
}
