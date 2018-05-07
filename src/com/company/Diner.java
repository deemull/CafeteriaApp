package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Diner {
    private Random randInt = new Random();
    private int id;
    private ArrayList<Duration> availableTimes;
    private boolean eatingStatus;

    // TODO: Write a default Diner constructor that sets the id to 99_999
    // and the available times to [3-5, 12-2, 4-7]
    public Diner() {
        id = 99_999;
        availableTimes = new ArrayList<>();
        availableTimes.add(new Duration(3, 5));
        availableTimes.add(new Duration(0, 2));
        availableTimes.add(new Duration(4, 7));
    }

    public Diner(int id, ArrayList<Duration> availableTimes) {
        this.id = id;
        this.availableTimes = availableTimes;
        eatingStatus = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Duration> getAvailableTimes() {
        return availableTimes;
    }

    public void setAvailableTimes(ArrayList<Duration> availableTimes) {
        this.availableTimes = availableTimes;
    }

    public boolean isEatingStatus() {
        return eatingStatus;
    }

    public void setEatingStatus(boolean eatingStatus) {
        this.eatingStatus = eatingStatus;
    }

    @Override
    public String toString() {
        return id + " " + availableTimes + " " + eatingStatus;
    }

}
