import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int alive = A.length;
        Stack<Integer> ds = new Stack<Integer>();
        for(int i=0; i<A.length; i++) {
            if(B[i]==1) {
                ds.push(A[i]);
            } else if(B[i]==0) {
                if(!ds.empty() && A[i]<ds.peek()) {
                    alive--;
                } else {
                    while(!ds.empty() && A[i]>ds.peek()) {
                        ds.pop();
                        alive--;
                    }
                    if(!ds.empty()) {
                        alive--;
                    }
                }
                
            }
        }
        return alive;
    }
}
