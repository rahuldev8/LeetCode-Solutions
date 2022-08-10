class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
        {
            return false;
        }
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int loop = s.length();
        
        for(int i=0;i<loop;i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(m1[c1] != m2[c2])
                return false;
            m1[c1] = i + 1;
            m2[c2] = i + 1;
        }
        return true;
    }
}
