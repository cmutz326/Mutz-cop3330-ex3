/*
*   UCF COP 3330 Fall 2021 Assignment 1 Solution
*   Copyright 2021 Christina Mutz
*
*   Example 3 solution
 */
import java.util.Scanner;
public class ex3 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is the quote?");            //prompt the user to input a quote
            var quote = sc.nextLine();


            System.out.println("Who said it?");                  //prompt the user for the author of the quote
            var author = sc.nextLine();

            System.out.println(author + " says, " + quote );  //repeat the quote back to user with the author's name

        }
    }