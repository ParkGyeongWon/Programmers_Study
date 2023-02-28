import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class  Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int[] arr= new int[3];
		int reward=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<3;i++) {
			arr[i] = Integer.parseInt(st.nextToken());			
		}
		
		Arrays.sort(arr);
		
		if(arr[0] == arr[1] && arr[1] ==arr[2]) { //셋다 같은 숫자
			reward = 10000+arr[0]*1000;
		}
		else if( arr[0] !=arr[1] && arr[1] != arr[2] && arr[2]!=arr[0]) { //모두 다른 숫자
			reward =arr[2]*100;
		}
		else { //두개가  같은 숫자 -> 3C2=3가지 이지만 위에서 정렬을 해놨기 떄문에 2가지 경우 밖에 나올수 없다.
			if(arr[0] == arr[1] ) {
				reward = 1000+arr[0]*100;
			}
			else {
				reward = 1000+arr[2]*100;
			}
		}
		
		System.out.println(reward);
	}

}