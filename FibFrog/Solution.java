import java.util.*;

class Solution {
    
    class Jump {
        int position;
        int counter;
        Jump(int position, int counter) {
            this.position = position;
            this.counter = counter;
        }
    }
    
    public int solution(int[] A) {
        List<Integer> fibs = getFibonaci(A.length);
        boolean[] accessed = new boolean[A.length]; 
        List<Jump> jumps = new ArrayList<Jump>();
        jumps.add(new Jump(-1, 0));
        Jump cj = null;
        int step = 0;
        while(true) {
            if(step==jumps.size()) {
                return -1;
            }
            cj = jumps.get(step);
            step++;
            for(int f: fibs) {
                if(cj.position+f==A.length) {
                    return cj.counter+1;
                } else if(cj.position+f>A.length || A[cj.position+f]==0 || accessed[cj.position+f]) {
                    continue;
                }
                
                jumps.add(new Jump(cj.position+f, cj.counter+1));
                accessed[cj.position+f] = true;
            }
        }
    }
    
    public List<Integer> getFibonaci(int max) {
        List<Integer> fibs = new ArrayList<Integer>();
        fibs.add(1);
        fibs.add(1);
        int f = 1;
        while(fibs.get(f)<=max) {
            fibs.add(fibs.get(f)+fibs.get(f-1));
            f++;
        }
        fibs.remove(0);
        Collections.reverse(fibs);
        return fibs;
    }
}
