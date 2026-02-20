package recursion;

import java.util.Scanner;

public class PrintFactorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = printFactorial3(n);
        System.out.println(result);
    }
    public static int printFactorial3(int n){
        if(n <= 1)
            return n;
        int last = printFactorial3(n - 1);
        int secondLast = printFactorial3(n - 2);
        return last + secondLast;
    }
    public static void printFactorial2(int n){
        if (n == 0)
            System.out.println(0);
        else {
            int secondLast = 0;
            int last = 1;
            System.out.print(secondLast + " " + last + " ");
            int curr;
            for (int i = 2; i <= n; i++){
                curr = secondLast + last;
                secondLast = last;
                last = curr;
                System.out.print(curr + " ");
            }
        }
    }
    public static void printFactorial(int n){
        if (n == 0)
            System.out.println(0);
        else if (n == 1)
            System.out.println("0 1");
        else {
            int[] fibonacci = new int[n + 1];
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            for (int i = 2; i <= n; i++)
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            for (int num: fibonacci)
                System.out.print(num + " ");
        }
    }
}
