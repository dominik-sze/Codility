class Solution {
    public int solution(String S) {
        int N = S.length();
        if(N%2==0) {
            return -1;
        }
        int mid   = N/2;
        int left  = mid+1;
        int right = mid-1;
        while(right>=0) {
            if(S.charAt(left)!=S.charAt(right)) {
                return -1;
            }
            left++;
            right--;
        }
        return mid;
    }
}
