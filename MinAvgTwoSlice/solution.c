int solution(int A[], int N) {
    int minI = 0;
    int i;
    double min = (A[0] + A[1])/2.;
    for(i=0; i<N-2; i++) {
        if((A[i]+A[i+1]+A[i+2])/3.<min) {
            min = (A[i]+A[i+1]+A[i+2])/3.;
            minI = i;
        }
        if((A[i]+A[i+1])/2.<min) {
            min = (A[i]+A[i+1])/2.;
            minI = i;
        }
    }
    if((A[N-2]+A[N-1])/2.<min) {
        minI = N-2;
    }
    return minI;
}
