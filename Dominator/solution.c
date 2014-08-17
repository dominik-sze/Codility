int solution(int A[], int N) {
    int size = 0;
    int value = 0;
    int i;
    for(i=0; i<N; i++) {
        if(size==0) {
            size++;
            value=A[i];
        } else {
            if(value!=A[i]) {
                size--;
            } else {
                size++;
            }
        }
    }
    int candidate = -1;
    if(size>0) {
        candidate = value;
    }
    int count = 0;
    int index = -1;
    for(i=0; i<N; i++) {
        if(A[i]==candidate) {
            count++;
            index = i;
        }
    }
    int leader = -1;
    if(count>N/2) {
        leader = index;
    }
    return leader;
}
