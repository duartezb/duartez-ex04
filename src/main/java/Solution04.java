/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Billy Duartez
 */

/*A simple mad-lib program that prompts for a noun, a verb, an adverb,
 and an adjective and injects those into a story that you create*/

import java.util.Scanner;
import java.lang.String;

public class Solution04 {

    public static void main(String[] args) {

        //enter noun
        System.out.printf("Enter a noun: ");
        Scanner input = new Scanner(System.in);
        String noun = input.nextLine();

        //enter verb
        System.out.printf("Enter a verb: ");
        String verb = input.nextLine();

        //enter adverb
        System.out.printf("Enter an adverb: ");
        String adverb = input.nextLine();

        //enter adjective
        System.out.printf("Enter an adjective: ");
        String adj = input.nextLine();

        //repeat back to user
        System.out.printf("Do you "+verb+" your "+ adj + " " + noun + " " + adverb + " ? That's hilarious!");


    }
}
