class Solution {
    public int maxSubArray(int[] nums) {

        int l = 0;
        int curr_sum = 0;
        int max_sum = nums[l];
        for(int r = 0; r <= nums.length - 1; r++) {
            curr_sum = Math.max(curr_sum, 0);
            curr_sum += nums[r];
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
}
