import java.util.*;
class Solution {
    public long solution(long n) {
        //1.정수를 문자열로 변환 
        //2.문자열을 배열로 변환
        //3.배열을 내림차순으로 정렬
        //4.배열을 문자열로 변환
        //5.문자열을 정수로 변환
        long answer = 0;
        String l =Long.toString(n); //1번
        String[] ls = l.split("");//2번
        
        Arrays.sort(ls,Collections.reverseOrder());//3번
        String ll ="";
        
        for(int i=0;i<ls.length;i++){//4번
            ll+=ls[i]; 
        }
        answer = Long.parseLong(ll);

        return answer;
    }
}