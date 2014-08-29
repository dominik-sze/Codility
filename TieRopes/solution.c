int solution(int K, int A[], int N) {
    unsigned long sum = 0;
    int count         = 0;
    int i;
    for(i=0; i<N; i++) {
        sum += (unsigned long)A[i];
        if(sum>=K) {
            count++;
            sum = 0;
        }
    }
    return count;
}
