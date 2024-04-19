import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        ArrayDeque<Integer> workQ = new ArrayDeque<Integer>();
        
        // init day
        int[] deadline = new int [progresses.length];
        
        for(int i=0; i<progresses.length; i++){
            if((100-progresses[i]) % speeds[i] == 0){
                deadline[i] = (100 - progresses[i]) / speeds[i];
            }else{
                deadline[i] = ((100 - progresses[i]) / speeds[i]) + 1;
            }
            workQ.add(deadline[i]);
        }
        
        ArrayList<Integer> deployList = new ArrayList<Integer>();
        int deployCount = 0;
        int currentDeadline = workQ.peek();
        
        while(!workQ.isEmpty()){
            if(workQ.peek() <= currentDeadline){
                workQ.removeFirst();
                deployCount++;
            }else{
                deployList.add(deployCount);
                // reset count
                deployCount = 1;
                currentDeadline = workQ.removeFirst();
            }
        }
        
        // add last deploy
        deployList.add(deployCount);
        
        int[] answer = new int[deployList.size()];
        for(int i=0; i<deployList.size(); i++){
            answer[i] = deployList.get(i);
        }
        
        
        return answer;
    }
}