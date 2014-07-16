class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;
        int maxCounter = 0;
        int idx;
        for(int i=0; i<A.length; i++) {
            idx = A[i]-1;
            if(A[i]==N+1) {
                maxCounter = max;
                continue;
            }
            if(counters[idx]<maxCounter) {
                counters[idx]=maxCounter+1;
            } else {
                counters[idx]++;
            }
            if(counters[idx]>max) {
                max = counters[idx];
            }
        }
        for(int i=0; i<counters.length; i++) {
            if(counters[i]<maxCounter) {
                counters[i] = maxCounter;
            }
        }
        return counters;
    }
}
