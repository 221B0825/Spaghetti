class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        int n = numLog[0];
        
        for(int i=1; i<numLog.length; i++){
            if(numLog[i] == n+1){
                answer = answer+"w";
            }else if(numLog[i] == n-1){
                answer = answer+"s";   
            }else if(numLog[i] == n+10){
                answer = answer+"d";
            }else if(numLog[i] == n-10){
                answer = answer+"a";
            }
             n = numLog[i];
        }
        
        return answer;
    }
}