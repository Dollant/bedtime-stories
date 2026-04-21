package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nWelcome to Bedtime Stories!");
        System.out.println("⊹₊˚‧︵‿₊୨ᰔ୧₊‿︵‧˚₊⊹⊹₊˚‧︵‿₊୨ᰔ୧₊‿︵‧˚₊⊹");
        System.out.println("1. Goldilocks and the Three Bears");
        System.out.println("2. Hansel and Gretel");
        System.out.println("3. Mary Had a Little Lamb");
        System.out.print("\nPick a story (1-3): ");

        String choice = keyboard.nextLine().trim();

        String fileName;
        switch (choice) {
            case "1":
                fileName = "src/main/resources/goldilocks.txt";
                break;
            case "2":
                fileName = "src/main/resources/hansel_and_gretel.txt";
                break;
            case "3":
                fileName = "src/main/resources/mary_had_a_little_lamb.txt";
                break;
        }
    }
}
