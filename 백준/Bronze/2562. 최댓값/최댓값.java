
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
        int[] arr = new int[9];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = arr[0];
		int maxOfPosition=0;
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxOfPosition = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxOfPosition+1);
			
			
	}

}
