int solution(int A[], int N) {
    int lowest = A[0];
    int bestBuy = 0;
    int i;
    for(i=1; i<N; i++) {
        bestBuy = (A[i] - lowest) > bestBuy ? A[i] - lowest : bestBuy;
        lowest = A[i] < lowest ? A[i] : lowest;
    }
    
    return bestBuy;
}
