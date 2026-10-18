import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        for (int i=0;i<intervals.length;i++){

            int start = intervals[i][0];
            int end = intervals[i][1];

            if(result.isEmpty() || start > result.get(result.size()- 1)[1]){
                result.add(new int[]{start ,end});
            }

            else{
                int[] last = result.get(result.size() - 1);
                last[1] = Math.max(last[1], end);
            }

        }

        return result.toArray(new int[result.size()][]);

    }
}