package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class MaxAndMinFrequency {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        maxAndMinFrequency2(array, n);
    }
    public static void maxAndMinFrequency2(int[] array, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: array)
            map.put(num, map.getOrDefault(num, 0) + 1);
        int maxFrequency = Integer.MIN_VALUE, minFrequency = Integer.MAX_VALUE;
        int maxElement = 0, minElement = 0;
        for (int num: map.keySet()){
            int value = map.get(num);
            if (value > maxFrequency) {
                maxFrequency = value;
                maxElement = num;
            }
            if (value < minFrequency){
                minFrequency = value;
                minElement = num;
            }
        }
        System.out.println("Max Freq Element " + maxElement);
        System.out.println("Min Freq Element " + minElement);
    }
    public static void maxAndMinFrequency(int[] array, int n){
        boolean[] visited = new boolean[n];
        int minFrequency = Integer.MAX_VALUE, maxFrequency = Integer.MIN_VALUE;
        int minElement = 0, maxElement = 0;
        for (int i = 0; i < n; i++){
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++){
                if (array[i] == array[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if (count > maxFrequency){
                maxFrequency = count;
                maxElement = array[i];
            }
            if (count < minFrequency){
                minFrequency = count;
                minElement = array[i];
            }
        }
        System.out.println("Max Freq Element " + maxElement);
        System.out.println("Min Freq Element " + minElement);
    }
}