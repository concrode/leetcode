package string;

/**
 * No.709 in leetcode
 *
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 *
 * Example 1:
 * Input: "Hello"
 * Output: "hello"
 *
 *
 * Example 2:
 * Input: "here"
 * Output: "here"
 *
 *
 * Example 3:
 * Input: "LOVELY"
 * Output: "lovely"
 *
 *
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        char[] chArray = str.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] >= 'A' && chArray[i] <= 'Z') {
                chArray[i] += 32;
            }
        }

        return String.valueOf(chArray);
    }
}
