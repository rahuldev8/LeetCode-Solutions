/*
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Optimal approach using map with direct jump
        if(s.length()==0)
            return 0;
        int result = Integer.MIN_VALUE;
        //map to store last index of duplicated character
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int left = 0,right=0;

        while(right<n){
            //if duplicate found
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            //new entry or update prevoius character's index
            map.put(s.charAt(right), right);
            result = Math.max(result, right-left+1);
            right++;
        }
        return result;

        //Time Complexity : O(n)
        //Space Complexity : O(1)   ---> because the given string will have only ascii characters limited to 256, therefore O(256) to be precise        
    }
}
