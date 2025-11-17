package com.mycompany.remember2;

import java.util.Scanner;

public class Remember2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please choose");
        System.out.println("-----------------------------------------------");
        System.out.println("1-sum");
        System.out.println("2-sub");
        System.out.println("3-mul");
        System.out.println("4-div");
        System.out.println("5-square");
        System.out.println("6-cube");
        System.out.println("7-end");
        System.out.println("-----------------------------------------------");
        int n1 = s.nextInt();
        switch (n1) {
            case 1:
                System.out.println("choose two numbers ");
                System.out.print("number 1:");
                double s1 = s.nextInt();
                System.out.print("number 2:");
                double s2 = s.nextInt();

                double sum = s1 + s2;
                System.out.println("the sum is:" + sum);
                break;
            case 2:
                System.out.println("choose two numbers ");
                System.out.print("number 1:");
                double s3 = s.nextInt();
                System.out.print("number 2:");
                double s4 = s.nextInt();

                double sub = s3 - s4;
                System.out.println("the sub is:" + sub);
                break;
            case 3:
                System.out.println("choose two numbers ");
                System.out.print("number 1:");
                double s5 = s.nextInt();
                System.out.print("number 2:");
                double s6 = s.nextInt();

                double mul = s5 * s6;
                System.out.println("the mul is :" + mul);
                break;
            case 4:
                System.out.println("choose two numbers ");
                System.out.print("number 1:");
                double s7 = s.nextInt();
                System.out.print("number 2:");
                double s8 = s.nextInt();

                double div = s7 / s8;
                System.out.println("the div is :" + div);
                break;
            case 5:
                System.out.println("choose a number ");
                System.out.print("number 1:");
                double s9 = s.nextInt();

                double squ = s9 * s9;
                System.out.println("the square is :" + squ);
                break;
            case 6:
                System.out.println("choose a number ");
                System.out.print("number 1:");
                double s10 = s.nextInt();

                double cube = s10 * s10 * s10;
                System.out.println("the cube is :" + cube);
                break;
            case 7:
                System.out.println("bye");
            default:
                System.out.println("error");

        }
    }
}
