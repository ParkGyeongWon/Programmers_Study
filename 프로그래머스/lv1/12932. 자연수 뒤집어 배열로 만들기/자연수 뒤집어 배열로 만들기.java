import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n>0){
            list.add((int)(n%10)); // n =>12345 => 5 추출 & n=1234 => 4추출 & n=123 => 3추출 &n=12 => 2추출 & n=1  
            n/=10;                // n=1234
        }
                     
        int[] answer = new int[list.size()];
                     
        for(int i=0;i<list.size();i++){
            answer[i]  = list.get(i);
        }
        
        
        return answer;
    }
}