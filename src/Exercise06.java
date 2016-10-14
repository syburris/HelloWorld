/**
 * Created by stevenburris on 10/14/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        isPalindrome("racecar"); // true
        isPalindrome("hello"); // false
    }

    public static boolean isPalindrome(String str) {
        String rString = new StringBuilder(str).reverse().toString();
        if (str.equals(rString)) {
            System.out.println(rString);
            System.out.println("");
            System.out.println("That's a palindrome!!!!");
            System.out.println("");
            return true;
        }

        else {
            System.out.println(rString);
            System.out.println("");
            System.out.println("BRRRMMMMP!!!!");
            System.out.println("");
            return false;
        }
    }
}
