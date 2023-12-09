public class PalindromeChecker {

    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    // Recursive helper function to check if the string is a palindrome
    private static boolean isPalindromeHelper(String str, int start, int end) {
        // Base case: when the start index crosses the end index, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If the characters at start and end positions don't match, it's not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call to check the substring between start and end positions
        return isPalindromeHelper(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String testString = "noon"; // Change this string to test different inputs
        boolean result = isPalindrome(testString);

        if (result) {
            System.out.println(testString + " is a palindrome.");
        } else {
            System.out.println(testString + " is not a palindrome.");
        }
    }
}
