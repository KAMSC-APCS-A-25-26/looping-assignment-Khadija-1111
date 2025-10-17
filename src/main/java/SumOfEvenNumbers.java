import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int x = sc.nextInt();
        int y = 0;
        // TODO: Step 2 - Validate input
        if (x < 2) {
            System.out.println("Error: Input must be 2 or greater.");
        } else {
            for (int i = 2; i <= x; i += 2) {
                y = y + i;
            }
            System.out.println("The sum of even numbers between 2 and " + x + " is " + y + ".");
            // TODO: Step 3 - Calculate sum of even numbers

            // TODO: Step 4 - Display the result

        }
    }
}