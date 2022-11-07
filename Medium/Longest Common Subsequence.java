/*
Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.

 

Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:

Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Example 3:

Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.

*/

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        
        //Matrix for Caching of DP
        int[][] lcs = new int[len1+1][len2+1];
        
        for(int i=0;i<=len1;i++)
        {
            for(int j=0;j<=len2;j++)
            {

                if(i==0 || j==0) lcs[i][j] = 0;
                
                //If character of both string matches, add one with diagonal element
                else if(arr1[i-1] == arr2[j-1])
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                
                //Else get the maximum from neighbours
                else
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
            }
        }
        //return the last element in matrix
        return lcs[len1][len2];
        
        //Time Complexity : o(n*m)
        //Space Complexity : o(n*m)
    }
}
