package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeworkPrime {
    public static void main(String[] args) {
        while (true) {
            System.out.print("輸入數字判斷是否為prime number");
            Scanner number = new Scanner(System.in);
            HomeworkPrime.IsPrime(number.nextInt());
        }
    }
    public static void IsPrime(int a){
        ArrayList<Integer> sites = new ArrayList<Integer>();
        if (a==2){
            System.out.println("是質數");
            return;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                sites.add(i);
            }
        }

        if(sites.isEmpty()){
            System.out.println("是質數");
        }else {
            System.out.println("不是質數");
            sites.forEach((e) -> {
                System.out.print(e + " ");
            });
            System.out.println();
        }
    }
}