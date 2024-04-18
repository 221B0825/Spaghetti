class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] origin = my_string.toCharArray();
        char[] overwrite = overwrite_string.toCharArray();
        
        for(int i=0; i<overwrite.length;i++){
            origin[i+s] = overwrite[i];
        }
        
        String answer = "";
        for(int i=0; i<origin.length;i++){
            answer += origin[i];
        }
        
        return answer;
    }
}