class Solution {
    public int solution(int[] A) {
        int count = 0;
        long left = 0;
        long right = 0;
        for(int i=A.length-1, j=0; i>=j;) {
            while(i>0 && A[i]==A[i-1]) {
                i--;
            }
            while(j<A.length-1 && A[j]==A[j+1]) {
                j++;
            }
            left = Math.abs((long)A[j]);
            right = Math.abs((long)A[i]);
            if(left==right) {
                j++;
                i--;
            } else if(left<right) {
                i--;
            } else if(left>right){
                j++;
            }
            count++;
        }
        return count;
    }
}
