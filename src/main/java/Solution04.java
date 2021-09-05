/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Billy Duartez
 */

/*A simple mad-lib program that prompts for a noun, a verb, an adverb,
 and an adjective and injects those into a story that you create*/

/*import plug libraries*/
import java.util.Scanner;
import java.lang.String;

public class Solution04 {

    public static void main(String[] args) {

        /*prompt message to enter noun*/
        System.out.print("Enter a noun: ");
        Scanner input = new Scanner(System.in);
        String noun = input.nextLine();

        /*prompt message to enter verb*/
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        /*prompt message to enter adverb*/
        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        /*prompt message to enter adjective*/
        System.out.print("Enter an adjective: ");
        String adj = input.nextLine();

        /*repeat back to user*/
        System.out.print("Do you "+verb+" your "+ adj + " " + noun + " " + adverb + " ? That's hilarious!");


    }
}
