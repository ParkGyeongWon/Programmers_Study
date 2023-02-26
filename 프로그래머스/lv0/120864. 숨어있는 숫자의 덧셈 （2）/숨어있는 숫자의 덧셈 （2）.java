class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split("[a-zA-Z]"); //대소문자를 제외하고 배열을 만든다. 만약 대소문자에 해당하면 " "빈칸으로 대체된다.
        
        for(int i=0;i<arr.length;i++){
            answer+= !arr[i].isEmpty() ? Integer.parseInt(arr[i]) :0;  //arr[i]가 빈칸이 아닐경우 문자열->정수로 변환한 다음 answer에 값을 더해주고, 빈칸일 경우 +0을 해준다.
        }
        return answer;
    }
}