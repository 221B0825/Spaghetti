import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // try each case
        for(int caseN = 0; caseN < commands.length; caseN++){
            
            // init (index number)
            int i = commands[caseN][0]-1;
            int j = commands[caseN][1]-1;
            int k = commands[caseN][2];
            
            //slice 
            int[] sliceArray = new int[j-i+1];
            int index = 0;
            for(int x = i; x<=j; x++){
                sliceArray[index++] = array[x];
            }
            
            //sort
            Arrays.sort(sliceArray);
            answer[caseN] = sliceArray[k-1];
        }
        
        return answer;
    }
}