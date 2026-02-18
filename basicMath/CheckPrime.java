package basicMath;

import java.util.Scanner;

public class CheckPrime {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean result = checkPrime2(number);
        System.out.println(result);
    }
    public static boolean checkPrime2(int number){
        int count = 0;
        for(int i = 1; i <= Math.sqrt(number); i++){
            if(number % i == 0)
            {
                count++;
                if (number / i != i)
                    count++;
            }
        }
        return count == 2;
    }
    public static boolean checkPrime(int number){
        int count = 0;
        for(int i = 1; i <= number; i++){
            if (number % i == 0)
                count++;
        }
        return count == 2;
    }
}
