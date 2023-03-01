import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		String star = "*";
	
		Scanner sc = new Scanner(System.in);
		
		N=sc.nextInt();
		
		for(int i=0;i<N;i++) { //01234
			for(int j=1;j<N-i;j++ ) { //4 3 2 1 
				System.out.print(" ");
	
			}
			for(int k=0;k<i+1;k++) {
				System.out.print(star);
			}
			System.out.println("");
		}
	}

}
