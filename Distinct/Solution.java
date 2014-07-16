import java.util.*;

class Solution {
    public int solution(int[] A) {
        Set<Integer> unique = new HashSet<Integer>();
        for(int i=0; i<A.length; i++) {
            unique.add(A[i]);
        }
        return unique.size();
    }
}

