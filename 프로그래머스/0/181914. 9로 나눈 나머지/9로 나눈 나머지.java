class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] numberArrays = number.toCharArray();
        for(int i=0; i<numberArrays.length; i++){
            answer += Integer.parseInt(numberArrays[i]+"");
        }
        
        answer = answer%9;
        return answer;
    }
}