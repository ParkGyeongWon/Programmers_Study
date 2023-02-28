import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int A,B,C; //시,분,초
		int hour,minute; //시간 분
		int min;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine()," ");
		
		
		
		A=Integer.parseInt(st.nextToken());
		B=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(br.readLine());
		
		

		min=A*60+B;
		min +=C;
	
		hour = (min/60)%24;
		minute = (min%60);
			
		System.out.println(hour+" "+minute);
	
		
	}

}
