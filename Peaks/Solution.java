import java.util.*;


class Solution {
    public int solution(int[] A) {
        List<Integer> peaks = new ArrayList<Integer>();
        int N = A.length;
        for(int i=1; i<N-1; i++) {
            if(A[i]>A[i-1] && A[i]>A[i+1]) {
                peaks.add(i);
            }
        }
        
        for(int size=3; size<=N; size++) {
            if(N%size != 0) {
                continue;
            }
            int groups = N/size;
            int found  = 0;
            for(int peakIdx: peaks) {
                if(peakIdx/size > found) {
                    break;
                } else if(peakIdx/size == found) {
                    found++;
                }
                if(found == groups) {
                    return found;
                }
            }
        }
        return 0;
    }
}
