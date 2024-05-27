import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
    
        Map<Integer, Integer> dice = new HashMap<>();
        dice.put(a, dice.getOrDefault(a, 0)+1);
        dice.put(b, dice.getOrDefault(b, 0)+1);
        dice.put(c, dice.getOrDefault(c, 0)+1);
        dice.put(d, dice.getOrDefault(d, 0)+1);
        
        // 4개의 값이 모두 같은 경우
        if(dice.size() == 1) return a*1111;
        // 다른 눈의 개수가 2인 경우
        if(dice.size() == 2){
            // 3개의 눈이 같고 나머지 하나의 눈이 다른 경우
            if(dice.containsValue(3)){
                for(Map.Entry<Integer, Integer> element : dice.entrySet()){
                    answer += element.getKey() * (element.getValue() == 3 ? 10 : 1);
                }
                return answer*answer;
            }
            
            // 같은 눈이 2쌍으로 나온 경우
            int another = ((a + b + c+ d) -(2*a)) /2;
            return (a + another) * Math.abs(a-another);
        }
        
        // 2개만 같고 나머지는 다른 경우
        if(dice.size() == 3){
            answer = 1;
            for(Map.Entry<Integer, Integer> element: dice.entrySet()){
                if(element.getValue() != 2){
                    answer *= element.getKey();
                }
            }
            return answer;
        }
        // 4개 모두 다른 경우
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}