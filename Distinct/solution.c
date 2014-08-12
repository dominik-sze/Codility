int comparator(const void *a, const void *b) {
    return *(int*)a - *(int*)b;
}

int solution(int A[], int N) {
    if(N==0) {
        return 0;
    }
    qsort(A, N, sizeof(int), comparator);
    int counter = 1;
    int i;
    for(i=1; i<N; i++) {
        if(A[i]!=A[i-1]) {
            counter++;
        }
    }
    return counter;
}
