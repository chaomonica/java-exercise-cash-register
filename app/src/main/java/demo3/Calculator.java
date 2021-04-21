import java.util.Scanner;

public class Calculator {

    public static Scanner scanner = new Scanner(System.in);
    public static double currentNumber = 0;
    public static char currentOperand = '+';

    public static void calculate(String userOperand) {
        double previousCurrent = currentNumber;
        double userNumber = getUserNumber();
        double result = 0;
        switch (userOperand) {
        case "+":
            result = currentNumber + userNumber;
            currentNumber += userNumber;
            break;
        case "-":
            result = currentNumber - userNumber;
            currentNumber -= userNumber;
            break;
        case "*":
            result = currentNumber * userNumber;
            currentNumber *= userNumber;
            break;
        case "/":
            result = currentNumber / userNumber;
            currentNumber /= userNumber;
            break;
        }
        System.out.println(previousCurrent + " " + userOperand + " " + userNumber + " = " + result);
        // System.out.println("currentNumber: " + currentNumber);
    }

    public static double getUserNumber() {
        System.out.print("Enter your next number: ");

        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Please enter a number: ");
        }
        return scanner.nextDouble();
    }

    public static void main(String[] args) {

        // START OF OUR APPLICATION
        System.out.print("Enter your first number or q to quit: ");

        if (scanner.hasNext("q")) {
            System.out.println("quitting application");
        } else {
            // VARIABLE FOR THE 1ST NUM. DOUBLE DATA TYPE
            currentNumber = scanner.nextDouble();
            System.out.println("currentNumber:" + currentNumber);

            System.out.print("Enter your operand: ");

            // WHILE LOOP
            while (!scanner.hasNext("q")) {
                String operand = scanner.next();

                if (operand.equals("c")) {
                    System.out.print("Enter new number: ");
                    currentNumber = getUserNumber();
                    // currentNumber = scanner.nextDouble();

                    System.out.print("Enter your operand or press c to clear: ");
                } else if (operand.equals("+") || operand.equals("-") || operand.equals("*") || operand.equals("/")) {

                    calculate(operand);
                    System.out.print("Enter your operand or press c to clear: ");
                } else {
                    System.out.println("Please an enter an operand[+, -, *, /] or press c to clear or q quit");
                }

            }

        }

    }

}