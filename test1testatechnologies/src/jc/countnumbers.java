package jc;


		import java.util.Scanner;

		public class countnumbers {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
		        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
		        int num;

		        String exitKeyword = "exit";

		        do {
		            System.out.print("Enter a number (enter '" + exitKeyword + "' to stop): ");
		            // Check if the input is the exit keyword
		            if (scanner.hasNext(exitKeyword)) {
		                break; // Exit the loop if the exit keyword is entered
		            }

		            // Parse the input as an integer
		            try {
		                num = Integer.parseInt(scanner.next());
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid input. Please enter a valid number or '" + exitKeyword + "' to stop.");
		                continue; // Skip the rest of the loop for invalid input
		            }

		            // Check if the number is positive, negative, or zero
		            if (num > 0) {
		                positiveCount++;
		            } else if (num < 0) {
		                negativeCount++;
		            } else {
		                zeroCount++;
		            }

		            // Update largest and smallest numbers
		            largest = Math.max(largest, num);
		            smallest = Math.min(smallest, num);

		        } while (true);

		        // Display the results
		        System.out.println("Count of positive numbers: " + positiveCount);
		        System.out.println("Count of negative numbers: " + negativeCount);
		        System.out.println("Count of zeros: " + zeroCount);
		        System.out.println("Largest number: " + (largest == Integer.MIN_VALUE ? "N/A" : largest));
		        System.out.println("Smallest number: " + (smallest == Integer.MAX_VALUE ? "N/A" : smallest));
		        System.out.println("Exiting program...");

		        scanner.close();
		        System.exit(0);
		    }
		}




		