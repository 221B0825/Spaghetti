import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int index = 0;
        
        HashMap<String, Integer> numberList = new HashMap<>();
        
        for(String number : phone_book){
            numberList.put(number, index++);
        }
        
        for(Map.Entry<String, Integer> number : numberList.entrySet()){
            for(int i=0; i<number.getKey().length(); i++){
                if(numberList.containsKey(number.getKey().substring(0, i))){
                    return false;
                }
            }
        }
        
        
        return answer;
    }
}