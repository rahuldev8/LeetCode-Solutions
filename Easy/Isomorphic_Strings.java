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

//Using HashMap
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Using HashMap

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>(); 

        for(int i=0; i<s.length(); i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);

            //mapping current elements
            if((map1.containsKey(a) && map1.get(a) != b) || (map2.containsKey(b) && map2.get(b) != a))
                return false;

            map1.put(a, b);
            map2.put(b, a);    
        }
        return true;

        //Time Complexity : O(n)
        //Space Complexity : O(n)
    }
}
