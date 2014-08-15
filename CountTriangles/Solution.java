import java.util.*;

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        int z;
        int result = 0;
        for(int x=0; x<N-2; x++) {
            z = x+2;
            for(int y=x+1; y<N-1; y++) {
                while(z<N && A[x]+A[y]>A[z]) {
                    z++;
                }
                result += z-y-1;
            }
        }
        return result;
    }
}
