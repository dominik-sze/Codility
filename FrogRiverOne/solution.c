int solution(int X, int A[], int N) {
    int *jumps = calloc(X+1, sizeof(int));
    int counter = 0;
    int i;
    for(i=0; i<N; i++) {
        if(A[i]<=X && *(jumps+A[i])!=1) {
            *(jumps+A[i])=1;
            if(++counter==X) {
                return i;
            }
        }
    }
    free(jumps);
    return -1;
}
