import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N; //배열 원소의갯수
		int X ; //비교대상
	
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		N= sc.nextInt();
		X = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i =0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		
		for(int j=0;j<N;j++) {
			if(A[j] <X) {
				list.add(A[j]);
			}
		}
		
		for(int k=0;k<list.size();k++) {
			System.out.print(list.get(k)+" ");
		}
	}

}