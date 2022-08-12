/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.*/

class Solution {
    public int mostWordsFound(String[] sent) {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<sent.length;i++)
        {
            int res = 1;
            for(int j=0;j<sent[i].length();j++)
            {
                if(sent[i].charAt(j) == ' ')res++;
            }
            max = Math.max(res,max);
        }
        return max;
    }
}
