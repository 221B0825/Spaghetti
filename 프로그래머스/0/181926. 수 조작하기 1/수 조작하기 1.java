class Solution {
    public int solution(int n, String control) {
        int answer = n;
        // w s d a
        int[] value = {1, -1, 10, -10};
        
        for(int i=0; i<control.length(); i++){
            switch (control.charAt(i)) {
		        case 'w':
			        answer = answer+value[0];
			        break;
		        case 's':
			        answer = answer+value[1];
			        break;
                case 'd':
                    answer = answer+value[2];
                    break;
                case 'a':
                    answer = answer+value[3];
                    break;
                default:
                    break;
            }
        }
        return answer;
    }
}