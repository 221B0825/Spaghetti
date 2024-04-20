import java.util.*;

class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.addLast('(');
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                stack.removeLast();
            }    
        }
        
        return stack.isEmpty();
    }
}