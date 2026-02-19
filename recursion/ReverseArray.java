package recursion;

import java.util.*;

public class ReverseArray {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        reverseArray2(n, array);
        for (int num: array)
            System.out.print(num + " ");
    }
    public static void reverseArray3(int n, int[] array){
        List<Integer> ans = new ArrayList<>();
        for (int num: array) {
            ans.add(num);
        }
        Collections.reverse(ans);
        for (int i = 0; i < n; i++){
            array[i] = ans.get(i);
        }
    }
    public static void reverseArray2(int n, int[] array){
        int p1 = 0;
        int p2 = n - 1;
        while (p1 < p2){
            int temp = array[p1];
            array[p1] = array[p2];
            array[p2] = temp;
            p1++;
            p2--;
        }
    }
    public static void reverseArray(int n, int[] array){
        int[] ans = new int[n];
        for (int i = 0; i < n; i++){
            ans[i] = array[n - 1 - i];
        }
        for(int i = 0; i < n; i++){
            array[i] = ans[i];
        }
    }
}
