class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() ==0) return true;

        int p1 = 0;

        for(int i=0; i<t.length(); i++)
        {
            if(t.charAt(i)==s.charAt(p1))
            {
                p1++;
                if(p1==s.length()) return true;
            }
        }
        return false;
    }
}
