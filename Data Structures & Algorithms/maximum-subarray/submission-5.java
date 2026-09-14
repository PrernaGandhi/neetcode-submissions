class Solution {
    public int maxSubArray(int[] nums) {

        int l = 0;
        int curr_sum = nums[l];
        int max_sum = nums[l];
        for(int r = 1; r <= nums.length - 1; r++) {
            if(curr_sum < 0) {
                l = r;
                curr_sum = 0;
            }
            curr_sum = curr_sum + nums[r];
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
}
