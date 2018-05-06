package com.company;


import java.util.ArrayList;

public class Cafeteria {
    ArrayList<Diner> diners;
    ArrayList<Diner> cafeteria = new ArrayList<>(3);

    public Cafeteria() {
        diners = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            diners.add(new Diner());
        }
    }

    public ArrayList<Diner> isAvailable(int hour) {
        //diners.subList(0,3);
        for (int i = 0; i < diners.size(); i++) {
            if (diners.get(i).getAvailableTimes().get(0) == hour) {
                cafeteria.add(diners.get(i));
            }
        }
        return cafeteria;
    }

    public void outputMessage(ArrayList<Diner> cafeteria) {
        for (int i = 0; i < cafeteria.size(); i++) {
            System.out.println("can eat");
        }
    }

    @Override
    public String toString() {
        return diners + " ";
    }
}
