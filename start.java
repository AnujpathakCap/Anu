package day3;

import java.util.Scanner;

public class start {
	public static void main(String[] args) {
		
		int result;
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		fibbo fb=new fibbo();
		
		if(num==2)
		{
			fb.fie(9);
			
		}
		else
		{
			result=fb.fib(num);
			System.out.println("The number :"+result);
		}
		
		
		
	}

}
