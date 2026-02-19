package recursion;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = factorial2(number);
        System.out.println(result);
    }
    public static int factorial2(int number){
        if (number == 0)
            return 1;
        return number * factorial2(number - 1);
    }
    public static int factorial(int number){
        int ans = 1;
        for (int i = number; i >= 1; i--)
            ans = ans * i;
        return ans;
    }
}