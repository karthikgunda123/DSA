package basicMath;

import java.util.Scanner;

public class ArmstrongNumber
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean result = isArmstrongNumber(number);
        System.out.println(result);
    }
    public static boolean isArmstrongNumber(int number)
    {
        int digits = (int) Math.log10(number) + 1;
        int sum = 0;
        int temp = number;
        while (temp > 0)
        {
            int lastDigit = temp % 10;
            sum = sum + (int) Math.pow(lastDigit, digits);
            temp = temp / 10;
        }
        return sum == number;
    }
}