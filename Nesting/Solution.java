class Solution {
    public int solution(String S) {
        int openParent = 0;
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i)=='(') {
                openParent++;
            } else {
                if(openParent==0) {
                    return 0;
                } else {
                    openParent--;
                }
            }
        }
        return openParent==0 ? 1 : 0;
    }
}

