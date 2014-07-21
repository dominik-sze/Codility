class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int[][] nuc = new int[3][S.length()+1];
        int A,C,G;
        for(int i=0; i<S.length(); i++) {
            A=0;C=0;G=0;
            if(S.charAt(i)=='A') {
                A=1;
            } else if(S.charAt(i)=='C') {
                C=1;
            } else if(S.charAt(i)=='G') {
                G=1;
            }
            nuc[0][i+1]=nuc[0][i]+A;
            nuc[1][i+1]=nuc[1][i]+C;
            nuc[2][i+1]=nuc[2][i]+G;
        }
        int[] result = new int[Q.length];
        for(int i=0; i<Q.length; i++) {
            int from = Q[i]+1;
            int to = P[i];
            if(nuc[0][from]-nuc[0][to]>0) {
                result[i] = 1;
            } else if(nuc[1][from]-nuc[1][to]>0) {
                result[i] = 2;
            } else if(nuc[2][from]-nuc[2][to]>0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }
        return result;
    }
}
