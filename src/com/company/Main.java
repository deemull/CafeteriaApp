package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static final int MAX_NUM_CAFE_DINERS = 3;

    public static void main(String[] args) {
        System.out.println("\nHello, Cafeteria!\n\n");

        // create an ArrayList (not a linked list) of 100 random diners
        ArrayList<Diner> diners = createDiners(5);
        System.out.println("original diners: " + diners);

        ArrayList<Diner> cafeteria = new ArrayList<>();

        // TODO: fix this loop since the cafeteria is open noon-6, not 1-6
        for (int hour = 0; hour <= 6; hour++) {
            ArrayList<Diner> dinersAtHour = dinersAtHour(diners, hour);
            System.out.println("Diners available at " + hour + ": " + dinersAtHour);

            // if any diners are available at [hour] and if they can fit in the cafeteria, they can eat
            while ((dinersAtHour.size() > 0) && (cafeteria.size() <= MAX_NUM_CAFE_DINERS)) {
                cafeteria.add(dinersAtHour.remove(0)); // diner can eat so go to cafeteria
                // TODO: set the diner's eating status to true
                boolean eatingStatus = true;
                // TODO: output a ticket showing id and the time the diner can eat
                System.out.println();
            }

            // TODO: for all dinersAtHour who couldn't eat, output the ids of all diners who could not eat at [hour]
        }
    }

    private static ArrayList<Diner> createDiners(int numOfDiners) {
        ArrayList<Diner> diners = new ArrayList<>();
        for (int i = 1000; i < numOfDiners + 1000; i++) {
            int id = i;
            ArrayList<Duration> availableTimes = randomAvailableTimes();
            diners.add(new Diner(id, availableTimes));
        }
        return diners;
    }

    private static ArrayList<Duration> randomAvailableTimes() {
        Random rand = new Random();
        int numDurations = rand.nextInt(3) + 1; // 1..3 available start-end times

        ArrayList<Duration> times = new ArrayList<>();
        for (int i = 1; i <= numDurations; i++) {
            times.add(new Duration());
        }

        return times;
    }

    // TODO: fix dinersAtHour() so it creates a list of all diners available at [hour]
    public static ArrayList<Diner> dinersAtHour(ArrayList<Diner> diners, int hour) {
        ArrayList<Diner> answer = new ArrayList<>();

        // loop through the diners
        //    if a diner's availability includes [hour], add it to [answer]

        for (int i = 0; i < diners.size(); i++) {
            for (int j = 0; j < diners.get(i).getAvailableTimes().size(); j++) {
                if (hour >= diners.get(i).getAvailableTimes().get(j).startHour &&
                        hour <= diners.get(i).getAvailableTimes().get(j).endHour) {
                    answer.add(diners.get(i));
                }
            }
        }
        return answer;

    }


}
