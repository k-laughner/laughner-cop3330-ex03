/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the quote?");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
        System.out.println("Who said it?");
        Scanner input1 = new Scanner(System.in);
        String who = input1.nextLine();
        System.out.println(who + " says, \"" + quote + ".\"");
    }
}
