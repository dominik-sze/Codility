class Solution {
    public int solution(int[] A, int[] B) {
        int count = 0;
        for(int i=0; i<A.length; i++) {
            if(samePrimeDiv(A[i], B[i])) {
                count++;
            }
        }
        return count;
    }
    
    public boolean samePrimeDiv(int x, int y) {
        int gcdVal = gcd(x, y);
        int gcdX = 0;
        while(x!=1) {
            gcdX = gcd(x, gcdVal);
            if(gcdX==1) {
                break;
            }
            x /= gcdX;
        }
        if(x!=1) {
            return false;
        }
        int gcdY = 0;
        while(y!=1) {
            gcdY = gcd(y, gcdVal);
            if(gcdY==1) {
                break;
            }
            y /= gcdY;
        }
        return y==1;
    }
    
    public int gcd(int x, int y) {
        if(x%y==0) {
            return y;
        } else {
            return gcd(y, x%y);
        }
    }
}
