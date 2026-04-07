class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int total = 0;
        int res = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];  // expand window

            while (total >= target) {  // shrink from left as much as possible
                res = Math.min(res, right - left + 1);
                total -= nums[left];
                left++;
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}