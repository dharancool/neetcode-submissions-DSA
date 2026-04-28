class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> frequency=new HashMap<Character, Integer>();

        int left=0;
        int maxLength=0;
        int maxFreq=0;

        for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        frequency.put(c, frequency.getOrDefault(c, 0) + 1);


        maxFreq = Math.max(maxFreq, frequency.get(c));

        int windowSize = right - left + 1;
        if (windowSize - maxFreq > k) {
            char leftChar = s.charAt(left);
            frequency.put(leftChar, frequency.get(leftChar) - 1);
            left++;
        }

        maxLength = Math.max(maxLength, right - left + 1);
     }
     return maxLength;


    }
}
