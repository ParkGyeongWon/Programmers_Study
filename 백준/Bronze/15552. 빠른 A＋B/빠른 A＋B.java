import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T; //testcase
		int A,B;
		T=Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			st=new StringTokenizer(br.readLine()," ");
			A=Integer.parseInt(st.nextToken());
			B=Integer.parseInt(st.nextToken());
			
			bw.write(A+B+"\n");
			
		}
		bw.flush();
		
		bw.close();
		br.close();
		
	}

}