package HWProjectTask2;

public class Task3 {
    /* Count the Number of Words in a String:
    Write a function to count the number of words in a given string.
    Words are separated by spaces or punctuation.
    For example, the input "Hello, world!" should return 2.
     */
    public static void main(String[] args) {
        String s = "Hello, world! I love Java class!";
        String[] words = s.trim().split("\\s+");
        System.out.println("count is: "+(words.length));
    }
}
