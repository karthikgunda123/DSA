package recursion;

import java.util.Scanner;

public class PrintName {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String name = scanner.next();
        printName(name, 0, N);
    }
    public static void printName(String name, int count, int N){
        if (count == N)
            return;
        System.out.println(name);
        printName(name, count + 1, N);
    }
}
