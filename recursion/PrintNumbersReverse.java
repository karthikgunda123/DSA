package recursion;

import java.util.Scanner;

public class PrintNumbersReverse {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printNumbersReverse(number);
    }
    public static void printNumbersReverseBackwards(int number){
        if (number < 1)
            return;
        printNumbersReverseBackwards(number - 1);
        System.out.println(number);
    }
    public static void printNumbersReverse(int number){
        if (number < 1)
            return;
        System.out.println(number);
        printNumbersReverse(number - 1);
    }
}
