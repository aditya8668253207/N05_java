package org.tns.operator;

import java.util.Scanner;

public class TurnaryOperatorDemo {

	public static void main(String[] args) {

		
	
		
		
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		if(num1>=18 && num2>=50 ) {
			System.out.println("you can donate blood");
		}else {
			System.out.println("not donate");
		}
		
//		
//		String res=(num1>=18)?"Eligible":"Not Eligible";
//        System.out.println("You are:"+res);
//		
//        String ress=(num2>=18)?"Eligible":"Not Eligible";
//        System.out.println("You are:"+ress);
		s.close();
//		
	}

}
