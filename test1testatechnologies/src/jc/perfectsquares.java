package jc;
import java.util.Scanner;

public class perfectsquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int start = sc.nextInt();

	        System.out.print("Enter the second number: ");
	        int end = sc.nextInt();

	        System.out.println("Perfect squares between " + start + " and " + end + ":");
	        for (int i = start; i <= end; i++) {
	            double squareroot = Math.sqrt(i);
	            if (squareroot == (int) squareroot) {
	                System.out.print(i + " ");
	            }
	        }

	        sc.close();
	    }
	

	}


