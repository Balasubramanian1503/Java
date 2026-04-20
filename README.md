# Java
import java.util.*;
class Main{
public static void main(String[] args){
int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        int maxsum = maxsubarray(arr);
        System.out.println(maxsum);
    }
    static int maxsubarray(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int currsum =0;
        for(int num:arr){
            currsum += num;
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum =0;
            }
        }
        return maxsum;
    }
}
2) Palindrome Number:
import java.util.*;
class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();
int rev =0;
int temp= num;
while(num >0){
int digit = num % 10;
rev = (rev * 10) + digit;
num /= 10;
}
if(temp == num){
System.out.println("palindrome Number");
}else{
System.out.println("Not a palindrome number");
}
}
}
3)Valid palindrome:
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string to check:");
        String s = scan.nextLine();
        Solution sol = new Solution();
        boolean result = sol.validPalindrome(s);
        System.out.println("Is valid palindrome (with 1 deletion allowed)? " + result);
    }
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
