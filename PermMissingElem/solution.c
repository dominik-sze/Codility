int solution(int A[], int N) {
    long long len = N+1;
    long long sum = (len*(len+1))/2;
    int i;
    for(i=0; i<N; i++) {
        sum-=(long)A[i];
    }
    return sum;
}
