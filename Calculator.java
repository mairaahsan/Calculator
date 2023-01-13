
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //prompt user to enter values seperated by a space
            System.out.println("Enter the numbers separated by space:");
            //create variable to assign these values to
            String userInput = scanner.nextLine();
            //create an array of values using split method (split by space)
            String[] numbers = userInput.split(" ");
            //create new double array to convert string to individual double values
            double[] nums = new double[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                nums[i] = Double.parseDouble(numbers[i]);
            }
            //prompt user to enter an operator (+,-,*,/)
            System.out.println("Enter an operator (+, -, *, /):");
            char operator = scanner.next().charAt(0);
            double result = nums[0];
            //addition
            if (operator == '+') {
                for (int i = 1; i < nums.length; i++) {
                    result += nums[i];
                }
                System.out.println(userInput + " = " + result);
                //subtraction
            } else if (operator == '-') {
                for (int i = 1; i < nums.length; i++) {
                    result -= nums[i];
                }
                System.out.println(userInput + " = " + result);
                //multiplication
            } else if (operator == '*') {
                for (int i = 1; i < nums.length; i++) {
                    result *= nums[i];
                }
                System.out.println(userInput + " = " + result);
                //division
            } else if (operator == '/') {
                for (int i = 1; i < nums.length; i++) {
                    result /= nums[i];
                }
                System.out.println(userInput + " = " + result);
            } else {
                System.out.println("Invalid operator. Please try again!");
            }
        }
    }
}
