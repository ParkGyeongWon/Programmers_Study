import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k; //i~j바구니까지 k번 넣는다
		int N,M; //N개의 바구니 : 1~N  / M번 공을 넣기
		
		Scanner sc = new Scanner(System.in);		
		
		N=sc.nextInt();
		M=sc.nextInt();
		
		int[] arr= new int[N];
		
		for(int z=0;z<M;z++) {
			i=sc.nextInt();
			j=sc.nextInt();
			k=sc.nextInt();
			
			for(int a=i-1;a<j;a++) {
				arr[a] = k;
			}
			
		}
		
		for(int y =0;y<arr.length;y++) {
			System.out.print(arr[y]+" ");
		}
		
	}

}