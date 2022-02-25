package com.company;

public class Arrays {
    public static void main(String[] args) {
        //Arrays Tests
        int number = 10;
        int [] numbers = new int[5];
        int [] numbers2 = {1,2,3,4,5}; //Alternate way to start an array and assign values

        //Default value for integers is "0"
        System.out.println(numbers[0]);
        System.out.println("________________________");

        //Assigning a value to a single int
        numbers[0] = 15;
        numbers[1] = 20;
        numbers[2] = 25;
        numbers[3] = 30;
        numbers[4] = 35;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println("________________________");

        //Going through entire array and Printing
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //Numbers 2
        System.out.println("________________________");
        System.out.println(numbers2[0]);
    }
}
