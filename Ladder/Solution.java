import java.math.*;

class Solution {
    public int[] solution(int[] A, int[] B) {
        int N = A.length;
        int[] L = new int[N];
        for(int i=0; i<N; i++) {
            B[i] = (1<<B[i])-1;
        }
        long[] fib = new long[N+2];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<N+2; i++) {
            fib[i] = fib[i-1]+fib[i-2];
        }
        for(int i=0; i<N; i++) {
            L[i] = (int)(fib[A[i]+1]&(long)B[i]);
        }
        return L;
    }
}
