/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
*/
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        //populating map by number of occurances of all characaters in given string
        for(Character i : s.toCharArray())
        {
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i,1);    
        }

        //traversing through the map with string
        // if any values is found to be 1(means it occured once) return it
        for(int i=0; i<s.length(); i++)
        {
            if(map.get(s.charAt(i))==1)return i;
        }
        return -1;

        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
}
