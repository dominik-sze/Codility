#include <math.h>
#include <limits.h>

int solution(int A[], int N) {
    int leftSum = 0;
    int i;
    for(i=0; i<N; i++) {
        leftSum += A[i];
    }
    int diff     = 0;
    int minDiff  = INT_MAX;
    int rightSum = 0;
    for(i=N-1; i>0; i--) {
        rightSum += A[i];
        leftSum  -= A[i];
        diff      = (int)(fabs(leftSum-rightSum));
        if(diff<minDiff) {
            minDiff = diff;
        }
    }
    return minDiff;
}
