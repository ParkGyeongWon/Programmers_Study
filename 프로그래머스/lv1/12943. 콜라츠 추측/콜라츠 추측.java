class Solution {
    public int solution(int num) {
        int answer = 0;
        int count=0;
        
        for(int i=0;i<500;i++){
            if(num ==1){
                answer =-1;
                break;
            }
            else{
                if(num%2 ==0){
                    num = num/2;
                    count++;
                    answer = count;
                        if(num ==1){
                            break;
                        }
                }
                else if(num %2==1){
                    num = num*3+1;
                    count++;
                    answer=count;
                        
                }
            }
        }
        
        if(num!=1){
            answer = -1;
        }
        else{
            answer = count;
        }
        return answer;
    }
}