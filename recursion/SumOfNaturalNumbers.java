package recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = sumOfNaturalNumbers3(number);
        System.out.println(result);
    }
    public static int sumOfNaturalNumbers3(int number){
        if (number == 1)
            return 1;
        return number + sumOfNaturalNumbers3(number - 1);
    }
    public static int sumOfNaturalNumbers2(int number){
        return (number * (number + 1)) / 2;
    }
    public static int sumOfNaturalNumbers(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++)
            sum += i;
        return sum;
    }
}