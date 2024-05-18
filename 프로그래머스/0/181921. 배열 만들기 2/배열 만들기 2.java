import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=l; i<r+1; i++){
            String number = i+"";
            int lengthCheck = 0;
            for(int j=0; j<number.length();j++){
                if(number.charAt(j) == '0' || number.charAt(j) == '5'){
                    lengthCheck++;
                }
            }
            if(number.length() == lengthCheck){
                arr.add(i);
            }
        }
        
        int[] answer = new int[arr.size()];
        if(answer.length == 0){
            return new int[] {-1};
        }else{
            for(int i=0; i<answer.length; i++){
                answer[i] = arr.get(i);
            }
        }
        return answer;
    }
}