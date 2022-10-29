/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true*/

//Time Complexity: o(n)
//Space Complexity: o(n) ch array size will vary according to input size

bool rotateString(char * s, char * t){
    if(strlen(s) != strlen(t)) return false;
    
    char ch[strlen(s) * 2 + 1];
    strcpy(ch, s);//o(n) first copy to the ch array
    strcat(ch, s);//o(n) concate same string to existing string
    return strstr(ch, t)==NULL?false:true;
}
