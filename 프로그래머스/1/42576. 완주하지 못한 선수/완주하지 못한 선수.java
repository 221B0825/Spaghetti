import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
                String answer = "";

        HashMap<String, Integer> list = new HashMap<>();

        // init
        for (String name : completion) {
            list.put(name, list.getOrDefault(name, 0) + 1);
        }
        
        
        // search
        for (String name : participant) {
            if (list.containsKey(name)) {
                if (list.get(name) > 1) {
                    list.put(name, list.get(name) - 1);
                } else {
                    list.remove(name);
                }
            } else {
                return name;
            }
        }
        
        

        // last name
        for(Map.Entry<String, Integer> person : list.entrySet()){
            if(person.getValue() == 1){
                return person.getKey();
            }
        }

        return answer;
    }
}