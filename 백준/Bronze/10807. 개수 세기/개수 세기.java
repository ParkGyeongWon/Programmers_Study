

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N; //정수의 개수
		int v; //찾고자 하는 정수
		int cnt=0; //찾고자 하는 정수와 같은 갯수
		
		Scanner sc = new Scanner(System.in);
		
		N=sc.nextInt();
		
		int num[] = new int[N];
		
		for(int i=0;i<N;i++) {
			
			num[i]=sc.nextInt();
		}
		
		v = sc.nextInt();
		
		for(int i =0;i<N;i++) {
			if(num[i] == v) {
				cnt++;
			}
		}
		
		
		System.out.println(cnt);
	}

}
