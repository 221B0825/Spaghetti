class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        
        boolean bol1 = x1 ? x1 : x2;
        boolean bol2 = x3 ? x3 : x4;
        
        return bol1 ? bol2 : bol1;
    }
}