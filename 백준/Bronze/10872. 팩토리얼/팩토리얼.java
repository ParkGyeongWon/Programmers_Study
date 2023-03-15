import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int result = factorial(N);
		
		bw.write(result+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int factorial(int num) {
		
		if(num==1||num ==0) return 1;
		
		return num*factorial(num-1);
		
	}

}
