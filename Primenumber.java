package gjk;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  i, count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = s.nextInt();
		
		for (i=2; i<num; i++) {
			 if(num%i==0)
			 {
				 count++;
				 break;
			 }
		}
        if(count==0)
        	System.out.println("\n its  a prime number.");
        else 
        	System.out.println("\n its not prime number");
	}

}
