class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        // value init
        int[] value = new int[included.length];
        
        for(int i=0; i<value.length; i++){
            value[i] = a + (d*i); 
        }
        
        
        for(int i=0; i<value.length; i++){
            if(included[i]){
                answer = answer + value[i];        
            }
        }
        
        return answer;
    }
}