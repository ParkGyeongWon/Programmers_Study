import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int  A,B;
		ArrayList<Integer>list = new ArrayList<>();
		
		
		Scanner sc= new Scanner(System.in);
		
		A=sc.nextInt();
		B=sc.nextInt();
		list.add(A+B);
		
		while(A!=0 && B !=00) {
			
			
			A=sc.nextInt();
			B=sc.nextInt();
			list.add(A+B);
		
		}
		
		for(int i=0;i<list.size()-1;i++) {
			System.out.println(list.get(i));
			
			
		}
		

	}
}