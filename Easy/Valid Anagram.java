/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/

//Time Complexity: o(n)
//Space Complexity: o(1) array which we are using constant always

class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[] = new char[26];//new char array to store occurance of all char
        if(s.length()!=t.length()) return false;
        
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            ch[s.charAt(i)-'a']++;//if element present in first string, incrementing its value in ch array accordingly
            ch[t.charAt(i)-'a']--;//if element present in second string, decrementing its value in ch array accordingly
        }
        
        for(int i=0;i<25;i++)
        {
            if(ch[i] != 0)//if any of non-zero value presenrt means it is not anagram so, return false
                return false;
        }
        return true;
    }
}
