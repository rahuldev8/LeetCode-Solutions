class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(int i=0; i<operations.length; i++)
        {
            if(operations[i].charAt(1) == '+')
            {
                result++;
            }
            else
            {
                result--;
            }
        }
        return result;
    }
}
