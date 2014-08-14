class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int i = binary.length()-1;
        while(binary.charAt(i)=='0') {
            i--;
        }
        int gap = 0;
        int counter = 0;
        for(; i>=0; i--) {
            if(binary.charAt(i)=='1') {
                gap = Math.max(gap, counter);
                counter = 0;
            } else {
                counter++;
            }
        }
        gap = Math.max(gap, counter);
        return gap;
    }
}
