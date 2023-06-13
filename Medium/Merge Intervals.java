class Solution {
    public int[][] merge(int[][] intervals) {

        //creating list of 1d arrays to store intervals
        List<int[]> result = new ArrayList<>();

        //edge cases : check for empty input
        if(intervals.length == 0 || intervals == null)
            return result.toArray(new int[0][]);

        //sorting based on first element of intervals using lambda
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        //mark start and end from given intervals
        int start = intervals[0][0];
        int end = intervals[0][1];

        //looping through the entire intervals
        for(int[] current : intervals)
        {
            //if current interval's start is overlapping,
            //update the end 
            if(current[0] <= end)
                end = Math.max(end, current[1]);
            else{
                //continous overlapping is finished, add to result
                result.add(new int[]{start, end});
                //update the start and end
                start = current[0];
                end = current[1];
            }    
        }    
        //finally add last interval to list
        result.add(new int[]{start, end});
        return result.toArray(new int[0][]);

        /**
        Complexity Analysis:
        Time -> O(N log N) for sorting
                O(n) for traversing
        therefore, O(N log N) + O(n) for Time
        
        Space -> O(n) at worst case if there 
        is no submerging intervals         
        */
    }
}
