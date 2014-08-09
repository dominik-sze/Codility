#include <math.h>

int solution(int A, int B, int K) {
    return floor((B-A)/(double)K) + ((B%K < A%K || A%K==0) ? 1 : 0); 
}
