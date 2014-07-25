class Solution {
    public int solution(int[] A) {
        int minI = 0;
        double min = (A[0] + A[1])/2.;
        for(int i=0; i<A.length-2; i++) {
            if((A[i]+A[i+1]+A[i+2])/3.<min) {
                min = (A[i]+A[i+1]+A[i+2])/3.;
                minI = i;
            }
            if((A[i]+A[i+1])/2.<min) {
                min = (A[i]+A[i+1])/2.;
                minI = i;
            }
        }
        if((A[A.length-2]+A[A.length-1])/2.<min) {
            minI = A.length-2;
        }
        return minI;
    }
}
