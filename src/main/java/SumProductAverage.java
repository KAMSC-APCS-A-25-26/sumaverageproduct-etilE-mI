/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

 import java.util.Scanner;

 public class SumProductAverage
 {
     public static void main(String[] args)
     {
         // TODO
         Scanner scanner = new Scanner(System.in);
 
         // Sign the output
         System.out.println("Sequoia Brown\nAPCS-A\nLewis 2.3 SumAverageProgram");
         System.out.println();
         System.out.println();
 
         // Prompt the user for the number of runs
         System.out.print("Enter number of runs: ");
         int runs = scanner.nextInt();
         System.out.println();
 
         for (int i = 1; i <= runs; i++)
         {
             // Prompt the user for three numbers
             System.out.print("Enter first number: ");
             double num1 = scanner.nextDouble();
             System.out.print("Enter second number: ");
             double num2 = scanner.nextDouble();
             System.out.print("Enter third number: ");
             double num3 = scanner.nextDouble();
 
             // Do the calculations
             double sum = num1 + num2 + num3;
             double product = num1 * num2 * num3;
             double average = sum / 3.0;
 
             // Print the outputs
             System.out.println("Sum: " + sum);
             System.out.println("Product: " + product);
             System.out.println("Average: " + average);
             System.out.println();
         }
         scanner.close();
     }
 }
 
