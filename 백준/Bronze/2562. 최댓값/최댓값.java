import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = new int[9];
			
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = arr[0];
			int maxOfPosition=0;
			
			for(int i=1;i<arr.length;i++) {
				if(max<arr[i]) {
					max=arr[i];
					maxOfPosition=i;
				}
			}
			
			System.out.println(max);
			System.out.println(maxOfPosition+1);
			
			
			
	}

}
