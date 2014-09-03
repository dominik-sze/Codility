int max(int x, int y) {
    return x > y ? x : y;
}

int solution(int A[], int N) {
    int* max_to   = calloc(N, sizeof(int));
    int* max_from = calloc(N, sizeof(int));
    int i;
    for(i=1; i<N-1; i++) {
        max_to[i]   = max(0, A[i]+max_to[i-1]);
    }
    for(i=N-2; i>0; i--) {
        max_from[i] = max(0, A[i]+max_from[i+1]);
    }
    int result = 0;
    for(i=1; i<N-1; i++) {
        result      = max(result, max_to[i-1]+max_from[i+1]);
    }
    return result;
}
