package org.example;

import java.util.Scanner;

public class HomeworkNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入:");
		int x = sc.nextInt();
		System.out.println("輸入:");
		int y = sc.nextInt();		
		System.out.println("輸入:");
		char c = sc.next().charAt(0);
		switch(c) {
			case '+':
				System.out.printf("%d%c%d=%f",x,c,y,(float)x+y);
				break;
			case '-':
				System.out.printf("%d%c%d=%f",x,c,y,(float)x-y);
				break;
			case '*':
				System.out.printf("%d%c%d=%f",x,c,y,(float)x*y);
				break;
			case '/':
				System.out.printf("%d%c%d=%f",x,c,y,(float)x/y);
				break;
		}
		sc.close();
	}

}
