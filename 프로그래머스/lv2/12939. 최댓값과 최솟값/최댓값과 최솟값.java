import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr= s.split(" ");
        int[] iArr = new int[arr.length]; //중요!!! 그냥 arr를 정렬하면 문자열 기준으로 정렬되서 정확히 실행되지 않는다.
        
        for(int i=0;i<iArr.length;i++){
            iArr[i] = Integer.parseInt(arr[i]); // 정수 배열을 만들어서 문자열을 정수로 변환시킨후
        }
        
        Arrays.sort(iArr); //sort()함수로 배열을 정렬시킨다음 출력한다.
        
        answer +=iArr[0] + " " + iArr[iArr.length-1];
        
        
        return answer;
    }
}