import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		HashSet<Integer>h = new HashSet<>();
		
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			
			num= sc.nextInt();
			h.add(num%42);
		}
		
		System.out.println(h.size());
		
	}

}