package recursion;

import java.util.Scanner;

public class PrintNumbers {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printNumbersBackwards(1, number);
    }
    public static void printNumbersBackwards(int current, int number){
        if (current > number)
            return;
        printNumbersBackwards(current + 1, number);
        System.out.print(current + " ");
    }
    public static void printNumbers(int current, int number) {
        if (current > number)
            return;
        System.out.print(current + " ");
        printNumbers(current + 1, number);
    }
}
