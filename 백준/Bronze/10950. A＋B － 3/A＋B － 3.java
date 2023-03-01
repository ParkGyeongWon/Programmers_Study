import java.util.*;
public class Main {

	public static void main(String[] args){	
    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A,B;
		int[] arr = new int[T];
		
		for(int i=0;i<T;i++) {
			A=sc.nextInt();
			B=sc.nextInt();
			arr[i] = A+B;
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
		
	}

}