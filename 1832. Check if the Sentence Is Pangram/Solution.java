/*

1832. Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:

Input: sentence = "leetcode"
Output: false

Constraints:
    
1 <= sentence.length <= 1000
sentence consists of lowercase English letters.

*/

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;

        Set<Character> uniqueCharacters = new HashSet<>();
        
        for (char c : sentence.toCharArray()) {
            uniqueCharacters.add(c);
            if (uniqueCharacters.size() == 26) return true;
        }

        return uniqueCharacters.size() == 26;
    }
}
