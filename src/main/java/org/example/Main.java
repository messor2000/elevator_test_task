package org.example;

import org.example.service.Building;

import java.util.Random;

public class Main {
    private static final Random random = new Random();
    private static final int floor = random.nextInt(16) + 5;

    public static void main(String[] args) {
        Building building = new Building(floor);
        System.out.println(building);
        building.startCycle();
    }
}