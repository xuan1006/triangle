package org.example;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("請輸入成績:");
            int x = sc.nextInt();
            if (x < 60) {
                System.out.println("\t\t轉換為:E");
            } else if (x < 70) {
                System.out.println("\t\t轉換為:D");
            } else if (x < 80) {
                System.out.println("\t\t轉換為:C");
            } else if (x < 90) {
                System.out.println("\t\t轉換為:B");
            } else if (x < 101) {
                System.out.println("\t\t轉換為:A");
            }
        }
    }
}