import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N,M; //N개의 바구니 / M번공 바꾸기
		int temp;
		Scanner sc = new Scanner(System.in);
		
		int i,j; // i번째 j번쨰 바꾸기
		
		N=sc.nextInt();
		M=sc.nextInt();
		
		int[] arr= new int[N];
		
		for(int c =0;c<arr.length;c++ ) {
			arr[c] = c+1;
		}
		
		for(int a=0;a<M;a++) {
			
			i=sc.nextInt();
			j=sc.nextInt();
			
			temp = arr[i-1];
			arr[i-1]=arr[j-1];			
			arr[j-1] = temp;
			
			
			
			
		}
		
		for(int b : arr) {
			System.out.print(b+ " ");
		}

	}

}