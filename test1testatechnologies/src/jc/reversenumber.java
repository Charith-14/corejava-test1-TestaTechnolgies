package jc;
import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int originalNumber = sc.nextInt();
	        int number = originalNumber;
	        int reversedNumber = 0;

	        do {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        } while (number != 0);

	        System.out.println("Reversed number = " + reversedNumber);

	        if (originalNumber == reversedNumber) {
	            System.out.println("The number is a palindrome.");
	        } else {
	            System.out.println("The number is not a palindrome.");
	        }

	        sc.close();
	    }
	

	}
