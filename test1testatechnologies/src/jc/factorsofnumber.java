package jc;
import java.util.Scanner;

public class factorsofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = s.nextInt();

        System.out.println("Factors of " + num + "=");
        int i = 1;

        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        s.close();
    }



	}


