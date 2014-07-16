import java.util.*;

class Solution {
    
    private Stack<Integer> ch = new Stack<Integer>();
    private int blocks;
    
    public int solution(int[] H) {
        for(int newHeight: H) {
            if(wallShouldGrow(newHeight)) {
                addBlock(newHeight);
            } else if(newHeight<ch.peek()) {
                while(newHeight!=ch.peek()) {
                    ch.pop();
                    if(wallShouldGrow(newHeight)) {
                        addBlock(newHeight);
                        break;
                    }
                }
            }       
        }
        return blocks;
    }
    
    private void addBlock(int newHeight) {
        ch.push(newHeight);
        blocks++;
    }
    
    private boolean wallShouldGrow(int newHeight) {
        return ch.empty() || newHeight>ch.peek();
    }
    
}
