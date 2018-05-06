package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //create Diner object
        Diner student = new Diner();
        System.out.println(student);

        //Create a Cafeteria object
        Cafeteria cafe = new Cafeteria();
        System.out.println(cafe);

        //Output Cafeteria with 3 Diners
        ArrayList<Diner> cafe2 = cafe.isAvailable(3);
        System.out.println(cafe2);

        //Output message for Diners who can eat
        cafe.outputMessage(cafe2);

        //Output message for Diners who couldn't eat



    }
}
