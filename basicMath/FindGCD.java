package basicMath;

import java.util.Scanner;

public class FindGCD {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = findGCD3(number1, number2);
        System.out.println(result);
    }
    public static int findGCD3(int number1, int number2){
        while (number1 > 0 && number2 > 0){
            if (number1 > number2)
                number1 = number1 % number2;
            else
                number2 = number2 % number1;
        }
        if (number1 == 0)
            return number2;
        else
            return number1;
    }
    public static int findGCD2(int number1, int number2){
        for (int i = Math.min(number1, number2); i > 0; i--)
        {
            if (number1 % i == 0 && number2 % i == 0)
                return i;
        }
        return 1;
    }
    public static int findGCD(int number1, int number2){
        int gcd = 1;
        for (int i = 1; i <= Math.min(number1, number2); i++){
            if (number1 % i == 0 && number2 % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
