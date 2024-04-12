import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strToChar = str.toCharArray();
    
        for(int i=0; i<strToChar.length; i++){
            if(Character.isUpperCase(strToChar[i])){
                strToChar[i] = Character.toLowerCase(strToChar[i]);
            }else{
                strToChar[i] = Character.toUpperCase(strToChar[i]);
            }
        }
        
        System.out.println(String.valueOf(strToChar));
    }
}