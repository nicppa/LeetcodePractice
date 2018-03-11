package MergeIntervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
 class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() <= 1){
            return intervals;
        }
        List<Interval> result = new ArrayList<>();
        intervals.sort((i1,i2)->Integer.compare(i1.start,i2.start));
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval i:intervals){
            if(i.start <= end){
                end = Math.max(end,i.end);
            }else{
                result.add(new Interval(start,end));
                start = i.start;
                end = i.end;
            }
        }
        result.add(new Interval(start,end));
        return result;
    }
}