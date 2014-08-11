int comparator(const void *a, const void *b) {
    return *(int*)a - *(int*)b;
}

int solution(int A[], int N) {
    qsort(A, N, sizeof(int), comparator);
    long left = A[0]*A[1]*A[N-1];
    long right = A[N-1]*A[N-2]*A[N-3];
    return left > right ? left : right;
}
