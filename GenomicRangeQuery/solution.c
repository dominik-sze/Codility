struct Results solution(char *S, int P[], int Q[], int M) {
    struct Results result;
    result.A = calloc(M, sizeof(int));
    result.M = M;
    int** nuc = calloc(3, sizeof(int*));
    int i;
    for(i=0; i<3; i++) {
        nuc[i] = calloc(strlen(S)+1, sizeof(int));
    }
    int A,C,G;
    int N = strlen(S);
    for(i=0; i<N; i++) {
        A=0; C=0; G=0;
        if(S[i]=='A') {
            A = 1;
        } else if(S[i]=='C') {
            C = 1;
        } else if(S[i]=='G') {
            G = 1;
        }
        nuc[0][i+1] = nuc[0][i] + A;
        nuc[1][i+1] = nuc[1][i] + C;
        nuc[2][i+1] = nuc[2][i] + G;
    }
    int from, to;
    for(i=0; i<M; i++) {
        from = Q[i]+1;
        to   = P[i];
        if(nuc[0][from]-nuc[0][to]>0) {
            result.A[i] = 1;
        } else if(nuc[1][from]-nuc[1][to]>0) {
            result.A[i] = 2;
        } else if(nuc[2][from]-nuc[2][to]>0) {
            result.A[i] = 3;
        } else {
            result.A[i] = 4;
        }
    }
    for(i=0; i<3; i++) {
        free(nuc[i]);
    }
    free(nuc);
    return result;
}
