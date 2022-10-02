import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        // code for finding prime no's
        // original code in python

        Integer max;
        // NOTE : max is the range of loop; NOT the number of primes
        // but the last digit to check upto

        boolean breaker;
        breaker = false;

        // breaker is true as default
        // when it's true, the number is prime
        // it must be turned to false if the factor % number == 0

        if (args.length > 0) {
            max = Integer.parseInt(args[0]);
            // taking command line srguments
        } else {
            System.out.println("finding prime numbers");
            Scanner in;
            in = new Scanner(System.in);
            System.out.println("enter till what number you want to find the prime numbers ? ");
            max = in.nextInt();
            in.close();
            // using the scanner class to take the input
        }
        // in is closed after this line

        System.out.println("\n");
        if (max > 2) {
            System.out.print(2 + ", ");
            // adding 2 to the list before hand
        }
        for (int num = 2; num < (max + 1); num++) {
            // main loop finding primes
            // even numbers are skipped

            for (int fact = 2; fact < (Math.sqrt(num + 1)); fact++) {
                // loop with factors
                if (num % fact == 0) {
                    breaker = false;
                }
                // breaker set flase if not a prime number
            }
            // need for a else statement
            // fulfilled with the use of a switch "breaker" (boolean variable)

            if (breaker) {
                System.out.print(num + ", ");
            } else {
                breaker = true;
            }
        }
        // end of main loop

        System.out.println("\n");
        // last line for neatness !!

    }
}