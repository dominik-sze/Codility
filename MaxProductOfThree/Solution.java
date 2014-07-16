import java.util.*;
import java.lang.Math.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int i = A.length-1;
        int lower = A[0]*A[1]*A[i];
        int upper = A[i]*A[i-1]*A[i-2];
        return (int)Math.max(lower, upper);
    }
}
