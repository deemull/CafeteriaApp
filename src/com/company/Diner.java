package com.company;

import java.util.ArrayList;
import java.util.List;

public class Diner {
    private int id;
    private ArrayList<Integer> availableTimes;

    public Diner() {
        id = 0;
        availableTimes = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            availableTimes.add(i);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getAvailableTimes() {
        return availableTimes;
    }

    public void setAvailableTimes(ArrayList<Integer> availableTimes) {
        this.availableTimes = availableTimes;
    }

    @Override
    public String toString() {
        List<String> availabilityStringList = new ArrayList<>();
        int i = 0;
        while (i < availableTimes.size()) {
            int start = availableTimes.get(i);
            int end = availableTimes.get(i+1);
            i += 2;
            availabilityStringList.add(start + "-" + end);
        }
        return id
                + " ["
                + String.join(", ", availabilityStringList)
                + "] ";
    }
}
