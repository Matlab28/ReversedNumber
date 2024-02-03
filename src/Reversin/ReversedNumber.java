package Reversin;

public class ReversedNumber {
    public static void main(String[] args) {
        int number = 123;
        System.out.println("The number: " + number);

        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);

        if (reversedNumber == originalNumber) {
            System.out.println("Your number '" + originalNumber + "' is a palindrome.");
        } else {
            System.out.println("Your number '" + originalNumber + "' is not a palindrome.");
        }


        int factNum = 5;
        System.out.println("\nEnter the number for calculating its factorial: " + factNum);
        int sum = 1;

        for (int i = 1; i <= factNum ; i++) {
            sum *= i;
        }

        System.out.println("Answer: " + sum + "!");

    }
}
