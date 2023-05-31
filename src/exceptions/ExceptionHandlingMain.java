package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMain {
    public static void main(String[] args) {

        try {
            doEverything();
        } catch (InvalidImputParameterException e) {
            System.out.println("InvalidImputParameterException");
            e.printStackTrace();
        }
    }

    private static void doEverything() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        PrintWriter writer = null;
        do {
            try {
                System.out.println("Please enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denominator");
                int denominator = scanner.nextInt();
                writer = new PrintWriter(new FileWriter("some.txt"));
                writer.println("Result = " + divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception : " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            } catch (IOException e) {

            } finally {
                System.out.println("Finally block called");
                if (writer != null) {
                    writer.close();
                }
            }
        } while (continueLoop);
    }

    private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
