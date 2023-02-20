import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int total=0;


        Arrays.sort(d); //비용이 적은 순서대로 배열을 정렬한다 -> 최대한 많은 부서에 지원해주기 위해
        
        for(int i=0;i<d.length;i++){
            total+=d[i];
            
            if(budget>=total){
                answer++;
            }
            else{
                break;
            }
        }
        
        
        return answer;
    }
}