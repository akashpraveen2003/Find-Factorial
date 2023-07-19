package find_factorial;

import java.util.Scanner;

/*
	Write a program to find the factorial of the given number A using recursion.
	Note: The factorial of a number N is defined as the product of the numbers from 1 to N.
	
	
	Input 1:
	A = 4
	
	Input 2:
	A = 1
	
	
	Output 1:
	24
	
	Output 2:
	1
 */
public class Find_Factorial {
	
	private static void factorial(int n, int result) {
		// TODO Auto-generated method stub
		if(n<=1)
		{
			System.out.println(result);
			return;
		}
		result*=n;
		factorial(n-1,result);
	}


	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		factorial(n,1);
	}

	
}
