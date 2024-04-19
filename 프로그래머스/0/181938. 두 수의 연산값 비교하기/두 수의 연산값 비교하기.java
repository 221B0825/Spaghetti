class Solution {
    public int solution(int a, int b) {
        String stA = Integer.toString(a);
        String stB = Integer.toString(b);
        
        int AB = Integer.parseInt(stA+stB);
        int AMultiB = 2 * a * b;
        
        if(AB >= AMultiB){
            return AB;
        }else{
            return AMultiB;
        }
    }
}