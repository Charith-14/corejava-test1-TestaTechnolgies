package jc;
import java.util.Scanner;
public class powerraised {
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter base value");
       double base =sc.nextDouble();
       System.out.println("enter exponent value");
       double expo=sc.nextDouble();
       double result=1;
       double initial=0;
       while(initial<expo) {
           result*= base;
           initial++;
    	   System.out.println("result= "+result);
    	   }
      double solution = Math.pow(23, 3);
       System.out.println("verified result using math.pow is ="+ solution);
	}

}
