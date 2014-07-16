class Solution {
    public int solution(int[] A) {
        int[] perm = new int[A.length];
        for(int i=0; i<A.length; i++) {
            if(A[i]-1>=A.length || perm[A[i]-1]!=0) {
                return 0;
            }
            perm[A[i]-1]++;
        }
        return 1;
    }
}
