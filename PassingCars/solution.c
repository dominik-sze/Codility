int solution(int A[], int N) {
    int east = 0;
    long long count = 0;
    int i;
    for(i=0; i<N; i++) {
        if(A[i]==0) {
            east++;
        } else {
            if(count>1000000000) {
                return -1;
            }
            count+=east;
        }
    }
    return count;
}
