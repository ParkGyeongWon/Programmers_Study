import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N,M; //N개 바구니 / M번  바꾸기
		int i,j; // i번쨰부터 j번쨰까지 바꾸기
		
		Scanner sc= new Scanner(System.in);
		
		N=sc.nextInt();
		M=sc.nextInt();
		
		int[] arr = new int[N+1];
		
		for(int k=1;k<=N;k++) { // 1 2 3 4 5
			arr[k]=k;
		}
		
		
		for(int a=0;a<M;a++) {
			Stack<Integer> stack = new Stack<>();
			i= sc.nextInt();
			j= sc.nextInt();
			
			for(int b=i;b<=j;b++) 
				stack.push(arr[b]);
			
			
			for(int c=i;c<=j;c++) 
				arr[c] = stack.pop();
			
			
		}
		
		for(int as : arr) {
			if(as>0)
			System.out.print(as+" ");
		}
	}

}