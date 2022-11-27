/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23

*/

class Solution {
    
    public boolean canEat(int[] piles, int k, int hours)
    {
        int res = 0;
        /*
        let k = 4
        pile = 10
        time required to eat the total pile is 3 hours
        
        Calculation :
        -----------------
        x = 10/4 -> 2 hours
        y = 10%4 -> 2 bananas left to eat, therefore we need an extra hour to eat the remaining
        2+1 -> 3
        */
        for(int i : piles)
        {
            int x = i/k;  //for eating multiple of K bananas
            int y = i%k;  //for eating remaining bananas of x
            
            res += x; //adding hours to res
            
            if(y!=0)res++; //adding an single hour to eat remaining bananas
        } 
        
        return res<=hours; //true if k value is less than, given hours
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int min = 1;
        int max = Integer.MAX_VALUE;
        
        //Binary search
        while(min <= max)
        {
            int mid = min + (max - min)/2;
            //canEat will return true, if koko can able to eat all bananas
            if(canEat(piles, mid, h))max = mid -1;
            else min = mid+1;
        }
        return min;
        
        //Time Complexity : o(M log N)
        //Space Complexity : o(1)
        
    }
}
