package basicMath;

import java.util.Scanner;

public class CheckPalindrome
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean result = checkPalindrome(number);
        System.out.println(result ? "Palindrome" : " Not Palindrome");
    }
    public static boolean checkPalindrome(int number)
    {
        int temp = number;
        int reverse = 0;
        while (temp > 0)
        {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp / 10;
        }
        return number == reverse;
    }
}
