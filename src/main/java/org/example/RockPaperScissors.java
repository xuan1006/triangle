package org.example;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<10;i++){
            System.out.print("輸入剪刀(1)石頭(2)布(3):");
            int input=sc.nextInt();
            if(input!=1&&input!=2&&input!=3){
                System.out.println("what are you doing");
                continue;
            }
            int bot=(int)(Math.random()*3)+1;
            switch (bot){
                case (1):
                    System.out.println("剪刀");
                    break;
                case (2):
                    System.out.println("石頭");
                    break;
                case (3):
                    System.out.println("布");
                    break;
            }
            switch (input){
                case(1):
                    if(bot==1) System.out.println("you tie");
                    else if(bot==2) System.out.println("you lose");
                    else if(bot==3) System.out.println("you win");
                    break;
                case(2):
                    if(bot==1) System.out.println("you win");
                    else if(bot==2) System.out.println("you tie");
                    else if(bot==3) System.out.println("you lose");
                    break;
                case(3):
                    if(bot==1) System.out.println("you lose");
                    else if(bot==2) System.out.println("you win");
                    else if(bot==3) System.out.println("you tie");
                    break;
            }
        }

    }
}