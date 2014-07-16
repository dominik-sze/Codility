import java.util.*;

class Solution {
    public int solution(String S) {
        Stack<Character> chars = new Stack<Character>();
        char c, poped;
        for(int i=0; i<S.length(); i++) {
            c = S.charAt(i);
            if(c=='(' || c=='[' || c=='{') {
                chars.push(c);
            } else {
                if(chars.empty()){
                    return 0;
                } else {
                    poped = chars.pop();
                    if((poped=='(' && c!=')') || (poped=='[' && c!=']') || (poped=='{' && c!='}')) {
                        return 0;
                    }
                }
            }
        }
        return chars.empty() ? 1 : 0;
    }
}
