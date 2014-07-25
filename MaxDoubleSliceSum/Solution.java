class Solution {
    public int solution(int[] A) {
        int[] maxTo   = new int[A.length];
        int[] maxFrom = new int[A.length];
        for(int i=1; i<A.length-1; i++) {
            maxTo[i] = Math.max(0, maxTo[i-1]+A[i]);
        }
        for(int i=A.length-2; i>0; i--) {
            maxFrom[i] = Math.max(0, maxFrom[i+1]+A[i]);
        }
        int max = 0;
        for(int i=1; i<A.length-1; i++) {
            max = Math.max(max, maxFrom[i+1]+maxTo[i-1]);
        }
        return max;
    }
}
