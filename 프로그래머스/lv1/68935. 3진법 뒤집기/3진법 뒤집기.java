
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String Three = "";
        
        while(n>0){ //주어진 n을 인수분해 하여 문자열에 저장을한다. 이렇게 하면 주어진 조건을 전부 skip하여 나타낼수 있다.
            
            Three+=n%3;   
            n/=3;
            
        }
        
        for(int i =Three.length()-1;i>=0;i--){ //  문자열의 끝에서 부터 3^0,3^1,3^2과 같이 문자열index 값과 곱하여 합을 구한다.
            answer +=(Three.charAt(i)-'0')*Math.pow(3,Three.length()-1-i); //
        }
        
    
        
        return answer;
    }
}