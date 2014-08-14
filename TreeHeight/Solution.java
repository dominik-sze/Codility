class Solution {
    int depth = 0;
    public int solution(Tree T) {
        int level = 0;
        traverse(T, level);
        return depth;
    }
    
    public void traverse(Tree node, int level) {
        if(level>depth) {
            depth++;
        }
        if(node.l!=null) {
            traverse(node.l, level+1);
        }
        if(node.r!=null) {
            traverse(node.r, level+1);
        }
    }
}
