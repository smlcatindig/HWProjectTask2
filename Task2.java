package HWProjectTask2;

public class Task2 {
    /* Check if a String is Palindrome: Determine whether a given string is a palindrome,
    which means it reads the same forwards and backward. For example, "madam" is a palindrome.
    */
    private static boolean isPalindrome(String str) {
        // Convert String to char array
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] != charArray[(str.length() - 1) - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}