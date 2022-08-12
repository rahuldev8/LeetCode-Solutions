class Solution {
    public int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for(int i=0;i<len;i++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
