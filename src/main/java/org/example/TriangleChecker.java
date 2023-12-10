package org.example;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three non-negative integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (isTriangle(a, b, c)) {
            System.out.println("These numbers form a triangle.");
            System.out.println("Triangle is " + determineTriangleType(a, b, c));
        } else {
            System.out.println("These numbers cannot form a triangle.");
        }
    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }

    public static String determineTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
