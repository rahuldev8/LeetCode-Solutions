/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1


Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16


Example 3:

Input: n = 3
Output: false*/

bool isPowerOfTwo(int n){
    //Ensuring n value is always positive and the value
    //of Logical AND of n and (n-1) is always zero, to
    //Achieve the power of two
    if(n>0 && (n&n-1) == 0)return 1;
    else return 0;
}
