int solution(int A[], int N) {
    int count = 0;
    unsigned long left;
    unsigned long right;
    int i,j;
    for(i=N-1, j=0; i>=j;) {
        while(i>0 && A[i]==A[i-1]) {
            i--;
        }
        while(j<N-1 && A[j]==A[j+1]) {
            j++;
        }
        left = (unsigned long)abs(A[j]);
        right = (unsigned long)abs(A[i]);
        if(left==right) {
            i--;
            j++;
        } else if(left<right) {
            i--;
        } else {
            j++;
        }
        count++;
    }
    return count;
}
