#include <math.h>

int solution(int N) {
    int i;
    int count = 0;
    for(i=1; i<=sqrt(N); i++) {
        if(N%i==0 && i*i!=N) {
            count += 2;
        } else if(i*i==N) {
            count++;
        }
    }
    return count;
}
