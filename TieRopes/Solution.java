class Solution {
    public int solution(int K, int[] A) {
        long currentLength = 0;
        int ropes = 0;
        for(int i=0; i<A.length; i++) {
            currentLength += (long)A[i];
            if(currentLength>=K) {
                ropes++;
                currentLength = 0;
            }
        }
        return ropes;
    }
}
