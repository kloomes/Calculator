package com.mycompany.calculator;

import java.util.*;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        switch (input.nextInt()) {
          case 1:
          System.out.println("The answer is " + add(getNum(), getNum()));
        }
    }

    public static int getNum() {
      Scanner input = new Scanner(System.in);
      System.out.println("What number?");
      return input.nextInt();
    }

    public static int add(int x, int y) {
      return x + y;
    }
}
