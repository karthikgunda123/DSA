package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountFrequency {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        countFrequencies2(array, n);
    }
    public static void countFrequencies2(int[] array, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: array)
            map.put(num, map.getOrDefault(num, 0) + 1);
        for (int num: map.keySet())
            System.out.println(num + " -> " + map.get(num));
    }
    public static void countFrequencies(int[] array, int n){
        boolean[] visited = new boolean[n];
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
            System.out.println(array[i] + " -> " + count);
        }
    }
}
