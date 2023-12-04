import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a five-digit number
        System.out.print("Enter 5 digits: ");
        int digits = input.nextInt();

        // Extract and print each digit with three spaces in between
        int digit1 = digits / 10000; //Extract the leftmost digit
        int digit2 = (digits / 1000) % 10;
        int digit3 = (digits / 100) % 10;
        int digit4 = (digits / 10) % 10;
        int digit5 = digits % 10; //extract the rightmost digit

        System.out.printf("%d   %d   %d   %d   %d", digit1, digit2, digit3, digit4, digit5);



    }
}
