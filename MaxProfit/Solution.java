class Solution {
    public int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++) {
            if(min>A[i]) {
                min = A[i];
            }
        }
        for(int i=0; i<A.length; i++) {
            A[i]-=min;
        }
        min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=1; i<A.length; i++) {
            if(min>A[i-1]) {
                min = A[i-1];
            }
            if(A[i]-min>max) {
                max = A[i]-min;
            }
        }
        return max;
    }
}
