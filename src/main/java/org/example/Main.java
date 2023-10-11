package org.example;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> winMap = new HashMap<>();
        winMap.put("rock", "scissors");
        winMap.put("paper", "rock");
        winMap.put("scissors", "paper");

        Scanner nameScanner = new Scanner(System.in);
        String userName;

        while (true) {
            System.out.println("Please enter your name");
            userName = nameScanner.nextLine();
            if (userName.isEmpty() || userName.trim().isEmpty()) {
                System.out.println(Color.red + "Username can't be blank." + Color.end);
                System.out.println();
            } else {
                System.out.println("Welcome," + Color.yellow + userName + Color.end);
                break;
            }
        }

        System.out.println(Color.yellow + "Let's play Rock-Paper-Scissors!" + Color.end);
        System.out.println(Color.yellow + "僕とじゃんけんしましょう!" + Color.end);
        System.out.println(Color.yellow + "跟我玩！石头剪刀布！" + Color.end);
        System.out.println();

        while (true) {
            System.out.println("Game Start!");
            System.out.println(Color.yellow + "Type to choose from" + Color.end);
            System.out.println(Color.back + "1.rock" + Color.end);
            System.out.println(Color.back + "2.paper" + Color.end);
            System.out.println(Color.back + "3.scissors" + Color.end);
            System.out.println(Color.back + "0.finish game" + Color.end);
            Scanner intScanner = new Scanner(System.in);
            try {
                int num = intScanner.nextInt();
                if (num == (0)) {
                    System.out.println("Thanks for playing.");
                    break;
                }
                if (num == (1)) {
                    System.out.println("You:rock");
                    System.out.println("Me:" + winMap.get("rock"));
                    System.out.println(Color.yellow + "You WIN!" + Color.end);
                    System.out.println();
                } else if (num == (2)) {
                    System.out.println("You:paper");
                    System.out.println("Me:" + winMap.get("paper"));
                    System.out.println(Color.yellow + "You WIN!" + Color.end);
                    System.out.println();
                } else if (num == (3)) {
                    System.out.println("You:scissors");
                    System.out.println("Me:" + winMap.get("scissors"));
                    System.out.println(Color.yellow + "You WIN!" + Color.end);
                    System.out.println();
                } else {
                    System.out.println("Please choose from 1~3");
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.out.println(Color.red + "Sorry. Please enter a number." + Color.end);
            }
        }
    }
}