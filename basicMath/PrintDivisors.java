package basicMath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintDivisors
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> result = printDivisors2(number);
        System.out.println(result);
    }
    public static List<Integer> printDivisors2(int number)
    {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                result.add(i);
                if (number / i != i)
                    result.add(number / i);
            }
        }
        Collections.sort(result);
        return result;
    }
    public static List<Integer> printDivisors(int number)
    {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
                result.add(i);
        }
        return result;
    }
}