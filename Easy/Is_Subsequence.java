class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        
        int s_p = 0;
        int t_p = 0;
        
        while(t_p < t.length())
        {
            if(t.charAt(t_p) == s.charAt(s_p))
            {
                s_p++;            
                if(s_p == s.length())return true;
            }
            t_p++;
            
        }
        return false; 
    }
}
