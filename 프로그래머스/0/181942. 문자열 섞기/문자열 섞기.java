class Solution {
    public String solution(String str1, String str2) {
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        char[] result = new char[char1.length + char2.length];
        String answer = "";
        for(int i=0; i<result.length; i++){
            if(i % 2 == 0){
                answer += char1[i/2];
            }else{
                answer += char2[i/2];
            }
        }
        
        return answer;
    }
}