package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //String name = "fulano";
        //System.out.println("\n Hello my friend " + name);

        Scanner input = new Scanner(System.in);

        System.out.println("Chose a path!! (1-3): ");
        int num = input.nextInt();

        switch (num){
            case 1:
                System.out.println("You've chosen this path! #1");
                break;
            case 2:
                System.out.println("This is fine #2");
                break;
            case 3:
                System.out.println("Meh... #3");
                break;
            default:
                System.out.println("You indecisive, uncultured swine!!");
        }


    }
}
