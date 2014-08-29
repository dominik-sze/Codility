int solution(int A[], int N) {
    int* s = calloc(N, sizeof(int));
    int i;
    for(i=0; i<N; i++) {
        if(A[i]<1 || A[i]>N) {
            continue;
        } else {
            s[A[i]-1] = A[i];
        }
    }
    for(i=0; i<N; i++) {
        if(s[i]!=i+1) {
            return i+1;
        }
    }
    return N+1;
}
