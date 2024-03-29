package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class NoRepetitionOfCharacter {

        public int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> chars = new HashMap();

            int left = 0;
            int right = 0;

            int res = 0;
            while (right < s.length()) {
                char r = s.charAt(right);
                chars.put(r, chars.getOrDefault(r,0) + 1);

                while (chars.get(r) > 1) {
                    char l = s.charAt(left);
                    chars.put(l, chars.get(l) - 1);
                    left++;
                }

                res = Math.max(res, right - left + 1);

                right++;
            }
            return res;
        }
        //or
            public int lengthOfLongestSubstrings(String s) {
                int n = s.length(), ans = 0;
                Map<Character, Integer> map = new HashMap<>(); // current index of character
                // try to extend the range [i, j]
                for (int j = 0, i = 0; j < n; j++) {
                    if (map.containsKey(s.charAt(j))) {
                        i = Math.max(map.get(s.charAt(j)), i);
                    }
                    ans = Math.max(ans, j - i + 1);
                    map.put(s.charAt(j), j + 1);
                }
                return ans;
            }
        }


