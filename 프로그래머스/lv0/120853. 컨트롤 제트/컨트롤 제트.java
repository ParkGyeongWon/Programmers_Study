class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" "); //문자열을 공백을 제외하고 배열로 만든다.
        
        for(int i=0;i<arr.length;i++){ //배열의 길이만큼 반복진행
            if(arr[i].equals("Z")){     //배열의 원소에 있는 것과 "Z"라는 문자열이 같다면
                answer-=Integer.parseInt(arr[i-1]); //문자열->정수로 변환하는 함수 Integer.parseInt(문자열 변수)를 활용하여 answer값에 저장한다.
                continue; //다음 i로 진행할수 있도록 반복문으로 되돌아 간다
            }
            answer +=Integer.parseInt(arr[i]); //"Z"가 아닐경우 그냥 덧셈을 실시한다.
            
            
        }
        return answer;
    }
}