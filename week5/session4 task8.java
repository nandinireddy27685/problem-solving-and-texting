import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(String word, String pattern) {
        char[] map = new char[26];
        char[] reverseMap = new char[26];

        Arrays.fill(map, '#');
        Arrays.fill(reverseMap, '#');

        for (int i = 0; i < pattern.length(); i++) {
            int p = pattern.charAt(i) - 'a';
            int w = word.charAt(i) - 'a';

            // Pattern character already mapped
            if (map[p] != '#') {
                if (map[p] != word.charAt(i)) {
                    return false;
                }
            } else {
                // Word character already mapped from another pattern character
                if (reverseMap[w] != '#') {
                    return false;
                }

                map[p] = word.charAt(i);
                reverseMap[w] = pattern.charAt(i);
            }
        }

        return true;
    }
}