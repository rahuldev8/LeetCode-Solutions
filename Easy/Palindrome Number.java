/*
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

*/

class Solution {
    public boolean isPalindrome(int n) {
        
        //if Given is negative, then palindrome is not possible
        if(n<0)return false;

        int rev_num = 0;
        int ans = n;

        //Palindrome logic
        while(n!=0)
        {
            rev_num *= 10;
            int temp = n%10;
            rev_num += temp;
            n /= 10; 
        }
        //Comparing input and reversed number
        return ans==rev_num?true:false;
        
    }
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
