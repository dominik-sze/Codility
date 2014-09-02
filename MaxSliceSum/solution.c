int solution(int A[], int N) {
    int i;
    int max   = A[0];
    int slice = A[0];
    for(i=1; i<N; i++) {
        max   = A[i]+max > A[i] ? A[i]+max : A[i];
        slice = slice    > max  ? slice    : max;
    }
    return slice;
}
