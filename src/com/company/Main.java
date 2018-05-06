package com.company;

import java.util.Scanner;

public class Main {
    static final Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("XULA ID: ");
        int id = read.nextInt();

        System.out.printf("Availability: ");
        int time = read.nextInt();

        Diner student = new Diner();
        student.setId(id);
        System.out.println(student);

        Cafeteria cafe = new Cafeteria();
        cafe.diningTime(time);
    }
}
