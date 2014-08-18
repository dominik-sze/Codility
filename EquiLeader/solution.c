int solution(int A[], int N) {
    int i;
    int value = 0;
    int size = 0;
    for(i=0; i<N; i++) {
        if(size==0) {
            value=A[i];
            size++;
        } else {
            if(A[i]!=value) {
                size--;
            } else {
                size++;
            }
        }
    }
    int leader = value;
    int index = 0;
    for(i=0; i<N; i++) {
        if(A[i]==leader) {
            index++;
        }
    }
    int count = 0;
    int equi = 0;
    for(i=0; i<N; i++) {
        if(A[i]==leader) {
            count++;
        }
        if((count>(i+1)/2) && (index-count)>(N-(i+1))/2) {
           equi++;
        }
    }
    return equi;
}
