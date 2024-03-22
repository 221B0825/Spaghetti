class Solution {
    public int[] solution(int[] answers) {
        
        
        // init
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] correctAnswers = new int[3];
        
        // compare
        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i % 5]){
                correctAnswers[0]++;
            }
            if(answers[i] == two[i % 8]){
                correctAnswers[1]++;
            }
            if(answers[i] == three[i % 10]){
                correctAnswers[2]++;
            }
        }
        
        int maxAnswer = Math.max(correctAnswers[0], Math.max(correctAnswers[1], correctAnswers[2]));
        
        int size = 0;
        for(int i=0; i<correctAnswers.length; i++){
            if(maxAnswer == correctAnswers[i]){
                size++;
            }
        }
        
        int[] answer = new int[size];
        
        // output setting
        int index = 0;
        for(int i=0; i<correctAnswers.length; i++){
            if(correctAnswers[i] == maxAnswer){
                answer[index++] = i+1;
            }
        }
        
        return answer;
    }
}