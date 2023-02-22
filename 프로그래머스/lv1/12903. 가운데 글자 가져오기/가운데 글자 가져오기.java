class Solution {
    public String solution(String s) {
        String answer = "";
        int mid= 0;
        
        
       
            if(s.length() %2 ==0){ //짝수일경우
                mid = s.length()/2-1;
                    for(int i=mid;i<mid+2;i++){
                        answer +=s.charAt(i);
                    }
            }
            else{
                mid = (s.length()/2);
                    for(int i=mid;i<mid+1;i++){
                        answer +=s.charAt(i);
                    }
            }
    
        
        return answer;
    }
}