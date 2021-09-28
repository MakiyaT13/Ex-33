/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Makiya Thomas
 */

import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What's your question? \n>");
    String question = input.nextLine();

      Random rand = new Random();
      int num = rand.nextInt(3);
      if(num == 1){
          System.out.print("Yes");
      }

      if (num == 2){
          System.out.print("No");
      }

      if (num == 3){
          System.out.print("Ask again later.");
      }

  }
}