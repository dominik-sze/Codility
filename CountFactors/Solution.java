class Solution {
    public int solution(int N) {
        int counter = 0;
        for(int i=1; i<=(int)Math.sqrt(N); i++) {
            if(N%i==0 && i*i!=N) {
                counter+=2;
            } else if (i*i==N) {
                counter++;
            }
        }
        return counter;
    }
}
