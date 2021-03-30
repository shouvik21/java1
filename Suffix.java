package p1;

import java.util.Scanner;
public class Suffix {
	public static void main(String[] args) {
		int x;
		
		System.out.println("Enter date");
		Scanner sc =new Scanner(System.in);
		x=sc.nextInt();
		
		
		if(x<1 && x>31)
			System.out.println("INVALID INPUT");
		
		else
		{
			if(x>=11 && x<=13)
				System.out.println(x+"th");
			else if(x%10==1)
				System.out.println(x+"st");
			else if(x%10==2)
				System.out.println(x+"nd");
			else if(x%10==3)
				System.out.println(x+"rd");
			else
				System.out.println(x+"th");
		}
	}
	}
