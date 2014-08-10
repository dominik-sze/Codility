int comparator(const void *a, const void *b) {
    return *(long*)a - *(long*)b;
}

int solution(int A[], int N) {
    qsort(A, N, sizeof(int), comparator);
    int i;
    long long P, Q, R;
    for(i=2; i<N; i++) {
        P = (long long)A[i];
        Q = (long long)A[i-1];
        R = (long long)A[i-2];
        if((P+Q>R) && (P+R>Q) && (Q+R>P)) {
            return 1;
        }
    }
    return 0;
}
