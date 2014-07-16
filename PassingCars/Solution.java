class Solution {
    public int solution(int[] A) {
        int eastCars = 0;
        int passed = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i]==0) {
                eastCars++;
            } else {
                passed+=eastCars;
                if(passed>1000000000) {
                    return -1;
                }
            }
        }
        return passed;
    }
}
