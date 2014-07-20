class Solution {
    public int solution(int N) {
        long min = Long.MAX_VALUE;
        long A = 0;
        long B = 0;
        for(int i=1; i<=(int)Math.sqrt(N); i++) {
            if(N%i==0) {
                A = (long)N/i;
                B = (long)i;
                if(2*(A+B)<min) {
                    min = 2*(A+B);
                }
            }
        }
        return (int)min;
    }
}

