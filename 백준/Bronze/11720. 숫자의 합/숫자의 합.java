import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int total=0;
		String s = br.readLine();
		
		
		for(int i=0;i<N;i++) {

			total +=s.charAt(i)-'0';
			
		}
		
		System.out.println(total);
		
	}

}