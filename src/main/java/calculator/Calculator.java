package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num, num1, num2;
        do {
            System.out.println("CalC-DevOps, Choose the operation");
            System.out.print("Add 1 for Factorial\nAdd 2 to for Square root\nAdd 3 to calculate power\nAdd 4 to calculate Natural Log\n" +
                    "Add 5 to exit\nEnter your preference: ");
            int preference;
            try {
                preference = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (preference) {
                case 1:
                    // do factorial
                    System.out.print("Enter the number : ");
                    num = scanner.nextDouble();
                    System.out.println("Factorial of "+num+" is : " + calculator.factorial(num));
                    System.out.println("\n");

                    break;
                case 2:
                    // find square root
                    System.out.print("Enter a number : ");
                    num = scanner.nextDouble();
                    System.out.println("Square root of "+num+" is : " + calculator.sqroot(num));
                    System.out.println("\n");


                    break;
                case 3:
                    // find power
                    System.out.print("Enter the first num : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second num : ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1+ " raised to the power "+num2+" is : " + calculator.power(num1, num2));
                    System.out.println("\n");
                    break;
                case 4:
                    // find natural log
                    System.out.print("Enter a number : ");
                    num = scanner.nextDouble();
                    System.out.println("Natural log of "+num+" is : " + calculator.naturalLog(num));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exit");
                    return;
            }
        } while (true);
    }


    public double factorial(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        double result = fact(number1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }



    public double sqroot(double num1) {
        logger.info("[SQ ROOT] - " + num1);
        double result = Math.sqrt(num1);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }


    public double power(double num1, double num2) {
        logger.info("[POWER - " + num1 + " RAISED TO] " + num2);
        double result = Math.pow(num1,num2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double naturalLog(double num) {
        logger.info("[NATURAL LOG] - " + num);
        double result = 0;
        try {

            if (num <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(num);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
    public double fact(double num) {
        double factorial = 1;
        for(int i = 1; i <= num; ++i)
        { factorial *= i;   }
        return  factorial;
    }
}