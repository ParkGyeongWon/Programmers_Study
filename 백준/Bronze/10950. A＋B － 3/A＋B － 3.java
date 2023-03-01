import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T =Integer.parseInt(br.readLine());
		int A,B;
		for(int i=0;i<T;i++) {
			st=new StringTokenizer(br.readLine()," ");
			A= Integer.parseInt(st.nextToken());
			B=Integer.parseInt(st.nextToken());
			
			bw.write(A+B + "\n");
		
			
		}
		bw.flush();
		
		br.close();
		bw.flush();
	
	}
	

}