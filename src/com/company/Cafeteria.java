package com.company;

import java.time.LocalDateTime;

public class Cafeteria {
    Diner node;
    Cafeteria next;

    public Cafeteria(Diner diner) {
        node = diner;
        next = null;
    }

    public Cafeteria() {
        next = null;
    }

    public Diner getNode() {
        return node;
    }

    public void setNode(Diner node) {
        this.node = node;
    }

    public Cafeteria getNext() {
        return next;
    }

    public void setNext(Cafeteria next) {
        this.next = next;
    }

    public boolean hasOneDiner() {
        if(next == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public void hourToDine(int hour) {
       int count = 0;
        for (int i = 0; i < size(); i++) {
            if (node.getAvailableTimes().get(i) == hour) {
                count++;
            }
        }
    }

    public void diningTime(int hour) {
        if (size() == 3) {
            if (hour == 12 || hour >= 1 && hour < 6) {
                System.out.println("Cafe is full");
            }
        }
        else if (hour < 1 || hour > 6) {
            System.out.println("Cafe is closed");
        } else {
            System.out.println("Cafe is open ");
        }
    }

    public void enqueue(Diner diner) {
        if (next == null) {

        }
    }

    public int size() {
        Cafeteria temp = this.next;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public String toString() {
        return next + " --> ";
    }
}
