// Determine if String Halves Are Alike

// You are given a string s of even length. Split this 
// string into two halves of equal lengths, and let a be the first half and b be the second half.

// Two strings are alike if they have the same
//  number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). 
//  Notice that s contains uppercase and lowercase letters.

// Return true if a and b are alike. Otherwise, return false.

package leetcode.String;

import java.util.Arrays;
import java.util.List;

public class HalvesAreAlike {
    public boolean halves(String s) {
        int mid = s.length() / 2;
        String str1 = s.substring(0, mid);
        String str2 = s.substring(mid, s.length());
        int size1 = alike(str1.toLowerCase());
        int size2 = alike(str2.toLowerCase());
        if (size1 == size2)
            return true;
        else
            return false;
    }

    public int alike(String s) {
        Character ch[] = { 'a', 'e', 'i', 'o', 'u' };
        List<Character> list = Arrays.asList(ch);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i)))
                count++;

        }
        return count;

    }
}


// class Solution {
//     public boolean halvesAreAlike(String s) {
//         Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
//         int vowelsCount = 0, midIndex = s.length() / 2;

//         for (int i = 0; i < midIndex; i++) {
//             char charA = s.charAt(i);
//             char charB = s.charAt(midIndex + i);
//             if (vowels.contains(charA)) vowelsCount++;
//             if (vowels.contains(charB)) vowelsCount--;
//         }
//         return vowelsCount == 0;
//     }
// }