class Solution {
    public int solution(int X, int[] A) {
        int[] s = new int[X+1];
        int jumps = X;
        for(int i=0; i<A.length; i++) {
            if((A[i]-1)<s.length) {
                s[A[i]-1]++;
                if(s[A[i]-1]==1) {
                    jumps--;
                }
            }
            if(jumps==0) {
                return i;
            }
        }
        return -1;
    }
}

