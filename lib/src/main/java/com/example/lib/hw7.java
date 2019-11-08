package com.example.lib;

import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input");
        n = scanner.nextInt();

        int sum = 0;
        for (i = 0;i <= n;i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
