package leetcode.easy;

import java.nio.charset.CharacterCodingException;
import java.util.StringTokenizer;

 /**
 * Given a sentence that consists of some words separated by a single space, and a searchWord.
 *
 * You have to check if searchWord is a prefix of any word in sentence.
 *
 * Return the index of the word in sentence where searchWord is a prefix of this word (1-indexed).
 *
 * If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.
 *
 * A prefix of a string S is any leading contiguous substring of S.
 *
 *
 *
 * Example 1:
 *
 * Input: sentence = "i love eating burger", searchWord = "burg"
 * Output: 4
 * Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
 * Example 2:
 *
 * Input: sentence = "this problem is an easy problem", searchWord = "pro"
 * Output: 2
 * Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
 * Example 3:
 *
 * Input: sentence = "i am tired", searchWord = "you"
 * Output: -1
 * Explanation: "you" is not a prefix of any word in the sentence.
 * Example 4:
 *
 * Input: sentence = "i use triple pillow", searchWord = "pill"
 * Output: 4
 * Example 5:
 *
 * Input: sentence = "hello from the other side", searchWord = "they"
 * Output: -1
 */
public class WordOccurrence {

    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";

        System.out.println(isPrefixOfWord(sentence, searchWord));

    }

    public static int isPrefixOfWord(String sentence, String searchWord)
    {
        String[] tokens = sentence.split("\\s");
        int  tokenCount = 0;
        byte matchFound = 0;
        for (String token :
                tokens)
        {
            tokenCount++;
            if (token.length() >= searchWord.length() && token.startsWith(searchWord)  )
            {
                matchFound = 1;
                break;
            }

        }
        return (tokenCount = (matchFound == 1) ? tokenCount : -1);
    }
}
