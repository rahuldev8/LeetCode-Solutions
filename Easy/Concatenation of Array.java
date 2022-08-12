class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[2*length];
        
        for(int i=0;i<length;i++)
        {
            ans[i] = nums[i];
            ans[length + i] = nums[i];
        }
        return ans;        
    }
}
