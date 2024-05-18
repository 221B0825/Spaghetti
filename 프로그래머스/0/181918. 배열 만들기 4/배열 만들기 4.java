import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int index = 0;
        while(index<arr.length){
            if(list.size() == 0){
                list.add(arr[index]);
                index++;
            }else{
                if(list.get(list.size()-1) < arr[index]){
                    list.add(arr[index]);
                    index++;
                }else{
                    list.remove(list.size()-1);
                }
            }
        }
        
        int[] stk = new int[list.size()];
        for(int i=0; i<stk.length; i++){
            stk[i] = list.get(i);
        }
        return stk;
    }
}