package com.company;

import java.util.Random;

public class Duration {
    public int startHour;
    public int endHour;

    public Duration() {

        // cafeteria is open noon-6
        Random rand = new Random();
        startHour = rand.nextInt(7);  // 0..6 with 0 being noon
        endHour = rand.nextInt(7);  // 0..6 with 0 being noon
        swapStartAndEndIfNecessary();
    }

    // TODO: fix the Duration parameterized constructor
    public Duration(int startHour, int endHour) {
        this.startHour = startHour;
        this.endHour = endHour;
        swapStartAndEndIfNecessary();
    }

    //method to swap startHour and endHour
    private void swapStartAndEndIfNecessary() {
        if( startHour > endHour ) {
            int temp = startHour;
            startHour = endHour;
            endHour = temp;
        }
    }

    @Override
    public String toString() {
        return startHour + "-" + endHour;
    }

}