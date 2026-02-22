package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class NumberHashing {
    /*
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++){
            array1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++){
            array2[i] = scanner.nextInt();
        }
        printHashing(array1, array2);
    }
    public static void printHashing(int[] array1, int[] array2){
        for (int num: array2){
            int count = 0;
            for (int num2: array1){
                if (num2 == num)
                    count++;
            }
            System.out.println(count);
        }
    }
     */
    /*
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] array = new int[n1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n1; i++){
            array[i] = scanner.nextInt();
            max = Math.max(max, array[i]);
        }
        int[] hash = new int[13];
        for (int i = 0; i < n1; i++)
            hash[array[i]] += 1;
        int n2 = scanner.nextInt();
        for (int i = 0; i < n2; i++)
        {
            int number = scanner.nextInt();
            System.out.println(hash[number]);
        }
    }
     */
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] array = new int[n1];
        for (int i = 0; i < n1; i++)
            array[i] = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: array)
        {
            int freq = 0;
            if (map.containsKey(num))
                freq = map.get(num);
            freq++;
            map.put(num, freq);
        }
        int n2 = scanner.nextInt();
        for (int i = 0; i < n2; i++){
            int number = scanner.nextInt();
            if (map.containsKey(number))
                System.out.println(map.get(number));
            else
                System.out.println(0);
        }
    }
}