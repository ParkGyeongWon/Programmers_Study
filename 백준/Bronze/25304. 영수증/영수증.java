import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int X; //영수증에 적힌 총 금액
		int N; //물건의 종류의 수
		int a,b; //각 물건의 가격과 개수
		int total=0;
		
		Scanner sc = new Scanner(System.in);
		
		X = sc.nextInt();
		N= sc.nextInt();
		
		for(int i=0;i<N;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			total +=a*b;
		}
		
		if(X == total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
