import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N,M;
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		int[] arr= new int[N+1];
		
		for(int i=1;i<=N;i++) { //기본 배열생성
			arr[i]=i;
		}
		
		for(int a=0;a<M;a++) {
			Stack<Integer> stack = new Stack<>();
			st= new StringTokenizer(br.readLine()," ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			for(int b=i;b<=j;b++) { //후입선출 : 늦게 들어온 것이 먼저 빠져나가는
				stack.push(arr[b]); //스택에 push(값 입력)
				
			}
			
			for(int b=i;b<=j;b++) {
				arr[b] = stack.pop(); //스택에 저장되어 있는 값을 arr에 pop으로 입력
			}
		}
		
		
		for(int as : arr) {
			if(as>0) {
				bw.write(as+" ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
		

		
	}

}
