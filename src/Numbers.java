import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        calculateLargestNum();
        calculateLargestNumberByOp();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        printTable(scan.nextInt());
        palindromeNumber();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter 2 numbers and arithmetic operator:");
        String operator = scan1.nextLine();
        int num = scan1.nextInt();
        int num2 = scan1.nextInt();
        userOperation(num, num2, operator);
        calculateArray();
        calculateArmstrongNumber();
        printFibonacciSeries();
    }

    public static void calculateLargestNum() {
        int[] number = {3, 4, 6};
        int largestNumber = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largestNumber) {
                largestNumber = number[i];
            } else {
                largestNumber = 0;
            }
        }
        System.out.println(largestNumber);
    }

    public static void calculateLargestNumberByOp() {
        int one = 14; int two = 5; int three = 9;
        int largestNumber = (one > two) ? ((one > three) ? one : three) : ((two > three) ? two : three);
        System.out.println(largestNumber);
    }

    public static void printTable(int number) {
        for (int i = 1; i < 11; i++) {
            int table = number * i;
            System.out.println(number + " * " + i + " = " + table);
        }
    }

    public static void palindromeNumber() {
        int num = 121;
        int reverse = 0;
        int lastDigit = 0;
        while (num != 0) {
            lastDigit = num%10;
            reverse = reverse*10 + lastDigit;
            num = num/10;
        }
        if (num == reverse) {
            System.out.println(num + " is palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }

    public static void userOperation(int num, int num1, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = num + num1;
                break;
            case "*":
                result = num * num1;
                break;
            case "-":
                if (num > num1) {
                    result = num - num1;
                }
                break;
            case "/":
                if (num > num1 && num1 !=0) {
                    result = num / num1;
                }
                break;
            default:
                System.out.println("There is an error");
        }
        System.out.println("The result is " + result);
    }

    public static void calculateArray() {
        int[] numbers = {4,6,3,7};
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        System.out.println("The total for array is " + result);
    }

    public static void calculateArmstrongNumber() {
        int number = 971;
        int result = 0;
        while (number !=0) {
            int num = number%10;
            result += num*num*num;
            number = number/10;
        }
        System.out.println("Total is " + result);
    }

    public static void printFibonacciSeries() {
        //next number is the sum of previous two numbers
        //0, 1, 1, 2, 3, 5, 8
        int[] array = new int[12];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-2] + array[i-1];
        }
        System.out.println(Arrays.toString(array));
    }
}
