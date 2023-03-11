import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1;i<arr.length;i++){ //arr 배열에서 최소값 찾기.
            if(min > arr[i]){
                min = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){ //ArrayList에 값 추가
            if(arr.length!=1){
                if(arr[i] !=min){                
                    list.add(arr[i]);
                }
            }
            if(arr.length ==1){
                list.add(-1);
            }
           
            
            
        }
        
        int[] answer = new int [list.size()];
        
        for(int i=0;i<list.size();i++){ //ArrayList -> 배열로 변환
            answer[i] = list.get(i);
        }
        
        
        
        
        return answer;
    }
}