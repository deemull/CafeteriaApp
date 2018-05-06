package com.company;


import java.util.ArrayList;

public class Cafeteria {
    ArrayList<Diner> diners;
    ArrayList<Diner> cafeteria;

    public Cafeteria() {
        cafeteria = new ArrayList<>();
        diners = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            diners.add(new Diner());
        }
    }

    public ArrayList<Diner> isAvailable(int hour) {
        for (int i = 0; i < diners.size(); i++) {
            for (int j = 0; j < diners.get(i).getAvailableTimes().size(); j++) {
                if (diners.get(i).getAvailableTimes().get(j) == hour) {
                    cafeteria.add(diners.get(i));
                }
            }
        }
        return cafeteria;
    }

    public void outputMessage(ArrayList<Diner> cafeteria) {
        for (int i = 0; i < cafeteria.size(); i++) {
            System.out.println(cafeteria.get(i) + "can eat");
        }
    }

    public void notInCafeteria(int hour, ArrayList<Diner> cafeteria) {
        for (int i = 0; i < cafeteria.size(); i++) {
            if () {
                System.out.println("couldn't eat ");
            }
        }
    }

    @Override
    public String toString() {
        return diners + " ";
    }
}
