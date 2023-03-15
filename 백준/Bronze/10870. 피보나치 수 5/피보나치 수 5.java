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
		
		int n = Integer.parseInt(br.readLine());
		
		int result = fibonachi(n);
		
		bw.write(result+"\n");
		bw.flush();
		bw.close();
		br.close();
		
	}
	static int fibonachi(int num) {
		if(num ==0) return 0;
		else if(num ==1) return 1;
		
		return fibonachi(num-1)+fibonachi(num-2);
				
	}

}