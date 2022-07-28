package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = fibonacci(a);
        System.out.println(res);
    }

    private static int getMinus(int a, int b){
        return a-b;
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            System.out.printf("0");
            return 0;
        } else if (n == 1) {
            System.out.printf("1");
            return 1;
        } else {
            return fibonacci(n‐1) + fibonacci(n‐2);
        }
    }

}