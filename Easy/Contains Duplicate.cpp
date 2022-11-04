/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.*/

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        
        map<int,int>m;//New Map
        
        for(auto i : nums) m[i]++;//if key is present, increment its value, else create a new one
        
        //traverse through the map, if any value is greater than 1 return true
        for(auto x : m)
            if(x.second>1)return true;
         return false;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
        
    }
};
