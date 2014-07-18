class Solution {
    public int solution(int[] A) {
        int[] idxs = new int[A.length];
        int value = 0;
        int size = 0;
        for(int i=0; i<A.length; i++) {
            if(size==0) {
                size++;
                value = A[i];
            } else {
                if(A[i]!=value) {
                    size--;
                } else {
                    size++;
                }
            }
        }
        int leader = value;
        int count = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i]==leader) {
                count++;
            }
        }
        int leftCount = 0;
        int equiLeader = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i]==leader) {
                leftCount++;
            }
            if(leftCount>(i+1)/2 && (count-leftCount)>(A.length-(i+1))/2) {
                equiLeader++;
            }
        }
        return equiLeader;
    }
}
