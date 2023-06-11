/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25*/

class Solution {
    public double myPow(double x, int n) {

        // Algorithm:
        // 1. if power is even, multiply base with itself and power/2
        // 2. else multiply base with result and decrement power by 1
        // 3. do this untill power != 0
        // 4. Edge case to handle is negative powers(store the copy in long)

        double result = 1.0;
        long pow = n;

        if(pow<0)
            pow = pow * -1;

        while(pow != 0)
        {
            if(pow%2 == 0)
            {
                x *= x;
                pow /= 2;
            }
            else
            {
                result *= x;
                pow -= 1;
            }
        }

        return n<0 ? 1.0/result : result;
        //Time Complexity : O(log N)
        //Space Complexity : O(1)
    }
}
