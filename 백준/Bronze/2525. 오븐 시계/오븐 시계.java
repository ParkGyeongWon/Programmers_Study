import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A,B,C; //시,분,초
		int hour,minute; //시간 분
		int min;
		Scanner sc = new Scanner(System.in);
		
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();

		min=A*60+B;
		min +=C;
	
		hour = (min/60)%24;
		minute = (min%60);
			
		System.out.println(hour+" "+minute);
	
		
	}

}