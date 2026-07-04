/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        //we get start and end times into an array 

        //sort 
        //0 5 15
        // 10 20 40 
        //e, s 
        int n = intervals.size(); 

        int[] start = new int[n]; 
        int[] end = new int[n]; 

        for(int i = 0; i < n; i++) {

            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end; 
        }

        Arrays.sort(start); 
        Arrays.sort(end); 

        int s = 0; 
        int e = 0; 
        int count = 0; 
        int res = 0;

        while(s < n) {
            if(start[s] < end[e]) {
                count++; 
                s++; 
            } else {
                count--; 
                e++; 
            }
            res = Math.max(res, count); 
        }
        return res; 
    }
}
