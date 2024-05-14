class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        char[] codeChar = code.toCharArray();
        
        for(int i=0; i<codeChar.length; i++){
            if(codeChar[i] == '1'){
                if(mode == 0){
                    mode = 1;
                }else{
                    mode = 0;
                }
            }else{
                if(mode == 0){
                    if(i % 2 == 0){
                        ret = ret + codeChar[i];
                    }
                }else{
                    if(i % 2 != 0){
                        ret = ret + codeChar[i];
                    }
                }
            }
        }
        if(ret != ""){
            return ret;
        }
        return "EMPTY";
    }
}