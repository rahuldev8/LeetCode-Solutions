class Solution {

	public int[] numberOfPairs(int[] nums) {
		int[] ans = new int[101], res = new int[2];
		for (int num : nums) {
			ans[num]++;
		}
		for (int i : ans) {
			res[0] += i / 2;
			res[1] += i % 2;
		}
		return res;
	}
}
