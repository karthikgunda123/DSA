package basicMath;

import java.util.Scanner;

public class ReverseNumber
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = reverseNumber(number);
        System.out.println(result);
    }
    public static int reverseNumber(int number)
    {
        int reverse = 0;
        while (number > 0)
        {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return reverse;
    }
}