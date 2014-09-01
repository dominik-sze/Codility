struct Results solution(int N, int A[], int M) {
    struct Results result;
    result.C = calloc(N, sizeof(int));
    result.L = N;
    int max = 0;
    int cmax = 0;
    int i;
    for(i=0; i<M; i++) {
        if(A[i]==N+1) {
            cmax = max;
        } else {
            if(result.C[A[i]-1] < cmax) {
                result.C[A[i]-1] = cmax+1;
            } else {
                result.C[A[i]-1]++;
            }
            if(max<result.C[A[i]-1]) {
                max = result.C[A[i]-1];
            }
        }
    }
    for(i=0; i<N; i++) {
        if(result.C[i]<cmax) {
            result.C[i] = cmax;
        }
    }
    return result;
}
