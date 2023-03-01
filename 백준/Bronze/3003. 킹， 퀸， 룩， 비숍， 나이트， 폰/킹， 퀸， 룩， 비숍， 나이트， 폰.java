import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int total =0;
		int[] chess = new int[6]; //킹1,퀸2,룩2,비숍2,나이트2,폰8
		int[] complete = {1,1,2,2,2,8};
		int[] answer = new int[6];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<chess.length;i++) { 
			 
			chess[i] = Integer.parseInt(st.nextToken());
			total+=chess[i]; //총 16개로 구성 
		}
		
		for(int j=0;j<chess.length;j++) {
			if(chess[j] == complete[j]) {
				answer[j]=0;
			}
			else if( chess[j] >complete[j]) { //3  1
				chess[j] = complete[j]-chess[j];
				answer[j]=chess[j];
			}
			else { //chess[j]<complete[j] //1 3
				chess[j] = complete[j]-chess[j];
				answer[j]=chess[j];
				
			}
		}
		
		for(int a : answer) {
			System.out.print(a + " ");
		}
	}

}