class Solution {
    public int solution(int a, int b) {
        String stA = Integer.toString(a);
        String stB = Integer.toString(b);
        int AB = Integer.parseInt(stA+stB);
        int BA = Integer.parseInt(stB+stA);
        
        if(AB > BA){
            return AB;
        }else{
            return BA;
        }
    }
}