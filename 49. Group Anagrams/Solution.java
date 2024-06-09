/*

49. Group Anagrams

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]


Constraints:
1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.

*/

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    // Helper method receives an input String and returns the sorted string
    private String sortString(String input) {
        char[] characters = input.toCharArray();    // Convert the string to a char array
        Arrays.sort(characters);                    // Sort the char array
        return new String(characters);              // Return the sorted the char array as a string
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize an empty HashMap to store sorted strings as keys and list of original strings as values
        Map<String, List<String>> anagramsMap = new HashMap<>();

        // Iterate through each string in the strs input
        for (String str : strs) {
            String sortedStr = sortString(str);  // Sort the current string
            
            // If the key does not exist
            if (!anagramsMap.containsKey(sortedStr)) {
                // Create key, set to sorted string and set value to empty ArrayList
                anagramsMap.put(sortedStr, new ArrayList<>());
            }
            // Add the original string to the list associated with the sorted string key
            anagramsMap.get(sortedStr).add(str);
        }

        // Convert the values of the HashMap to a List<List<String>> and return
        return new ArrayList<>(anagramsMap.values());
    }
}
