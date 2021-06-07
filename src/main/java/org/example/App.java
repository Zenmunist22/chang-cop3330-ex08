package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class App 
{
    public static void main( String[] args )
    {
        int people, pizzas, slicesPerPizza, slicesTotal, leftoverSlices;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people? ");
        people = sc.nextInt();
        System.out.print("How many pizzas do you have? ");
        pizzas = sc.nextInt();
        System.out.print("How many slices per pizza? ");
        slicesPerPizza = sc.nextInt();
        slicesTotal = slicesPerPizza * pizzas;
        System.out.printf("%d people with %d pizzas (%d slices)\n", people, slicesTotal/people, slicesTotal);
        System.out.printf("Each person gets %d pieces of pizza.\n", slicesTotal/people);
        leftoverSlices = slicesTotal % people;
        System.out.printf("There are %d leftover pieces.",  leftoverSlices);
    }
}
