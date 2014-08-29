int depth = 0;

void traverse(struct tree * node, int level) {
    if(level>depth) {
        depth = level;
    }
    if(node->l!=NULL) {
        traverse(node->l, level+1);
    }
    if(node->r!=NULL) {
        traverse(node->r, level+1);
    }
}
    
int solution(struct tree * T) {
    int level = 0;
    traverse(T, level);
    return depth;
}
