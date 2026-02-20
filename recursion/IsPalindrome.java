package recursion;

import java.util.Scanner;

public class IsPalindrome {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean result = isPalindrome2(word, 0, word.length() - 1);
        System.out.println(result);
    }
    public static boolean isPalindrome2(String word, int left, int right){
        if (left > right)
            return true;
        if (!Character.isLetterOrDigit(word.charAt(left)))
            left++;
        else if (!Character.isLetterOrDigit(word.charAt(right))) {
            right--;
        }
        else if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right)))
            return false;
        else {
            left++;
            right--;
        }
        return isPalindrome2(word, left, right);
    }
    public static boolean isPalindrome(String word){
        int left = 0, right = word.length() - 1;
        while (left < right){
            char ch1 = word.charAt(left);
            char ch2 = word.charAt(right);
            if (!Character.isLetterOrDigit(ch1))
                left++;
            else if (!Character.isLetterOrDigit(ch2))
                right--;
            else if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2))
                return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}