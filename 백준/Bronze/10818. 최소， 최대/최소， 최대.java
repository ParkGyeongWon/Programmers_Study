import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		
		Scanner sc = new Scanner(System.in);
		
		N= sc.nextInt();
		
		int[] arr= new int[N];
		int length = arr.length;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]+" " +arr[length-1]);
	}

}
