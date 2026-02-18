package basicMath;

import java.util.Scanner;

public class ExtractDigits
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        extractDigits(number);
    }
    public static void extractDigits(int number)
    {
        while (number > 0)
        {
            int lastDigit = number % 10;
            System.out.println(lastDigit);
            number = number / 10;
        }
    }
}