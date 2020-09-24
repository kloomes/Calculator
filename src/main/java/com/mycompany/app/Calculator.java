package com.mycompany.calculator;

import java.util.*;

public class Calculator
{
    public static void main(String[] args)
    {
        options();
    }

    public static void options() {
      Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Exit");
        switch (input.nextInt()) {
          case 1:
          System.out.println("The answer is " + add(getNum(), getNum()));
          goAgain();
          break;
          case 2:
          System.out.println("The answer is " + subtract(getNum(), getNum()));
          goAgain();
          break;
          case 3:
          System.out.println("The answer is " + multiply(getNum(), getNum()));
          goAgain();
          break;
          case 4:
          System.out.println("The answer is " + divide(getNum(), getNum()));
          goAgain();
          break;
          case 5:
          break;
        }
    }

    public static double getNum() {
      Scanner input = new Scanner(System.in);
      System.out.println("What number?");
      return input.nextDouble();
    }

    public static void goAgain() {
      Scanner input = new Scanner(System.in);
      System.out.println("Go again? y/n");
      String answer = input.nextLine();
      if (answer.equals("n")) {
        System.out.println("Exiting...");
      } else if (answer.equals("y")) {
        options();
      } else {
        System.out.println("y or n only please.");
        goAgain();
      }
    }

    public static double add(double x, double y) {
      return x + y;
    }

    public static double subtract(double x, double y) {
      return x - y;
    }

    public static double multiply(double x, double y) {
      return x * y;
    }

    public static double divide(double x, double y) {
      return x / y;
    }
}
