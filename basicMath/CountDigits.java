package basicMath;

import java.util.Scanner;

public class CountDigits
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = countDigits(number);
        System.out.println(result);
    }
    public static int countDigits(int number)
    {
        int count = 0;
        while (number > 0)
        {
            count++;
            number = number / 10;
        }
        return count;
    }
}
