import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        // init
        stack.addLast(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(stack.peekLast() != arr[i]){
                stack.addLast(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(int i= stack.size()-1; i>=0; i--){
            answer[i] = stack.removeLast();
        }
        

        return answer;
    }
}