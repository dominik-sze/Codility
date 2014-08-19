#include <limits.h>
#include <math.h>

int solution(int N) {
    int i;
    long A = 0;
    long B = 0;
    long per = LONG_MAX;
    for(i=1; i<=(int)sqrt(N); i++) { 
        if(N%i==0) {
            A = N/i;
            B = i;
            if(2*(A+B)<per) {
                per = 2*(A+B);
            }
        }
    }
    return (int)per;
}
