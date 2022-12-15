/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

*/

class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--)
        {
            //from last if any number is less than 9, then increment it
            if(digits[i]<9)
                {
                    //Example:
                    //if input is [4,5,3,6,7]
                    //output will be [4,5,3,6,8] abd return it there itself
                    digits[i]++;
                    return digits;
                }
            //else replace the value with 0
            else 
                digits[i] = 0;    
        }
        //return new array of size n+1
        //Example if given Array is [9,9,9,9,9]
        //then output will be [1,0,0,0,0,0]
        int[] newNum = new int[n+1];
        newNum[0] = 1;
        return newNum;
    }
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
