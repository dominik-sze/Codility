int solution(int A[], int N) {
    int* perm = calloc(N, sizeof(int));
    int i;
    for(i=0; i<N; i++) {
        if(A[i]>N) {
            return 0;
        }
        if(*(perm+(A[i]-1))==1) {
            return 0;
        }
        *(perm+(A[i]-1)) = 1;
    }
    free(perm);
    return 1;
}
