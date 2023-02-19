class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n); //정수를 문자열로 변경
        char[] ch = str.toCharArray(); //문자열을 배열에 한 글자씩 저장
        
        int[] answer = new int[str.length()]; //정수를 뒤집어서 저장할 배열 생성
        
        for(int i=str.length()-1;i>=0;i--){
            answer[str.length()-i-1] = str.charAt(i)-'0'; //char형을 int 형으로 바꿔줄떈 아스키코드 값으로 변환되기 떄문에 -'0'을 해줘야 된다.
        }
  
        
        return answer;
    }
}