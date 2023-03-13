import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String subject;//과목명
		double score;//점수
		String grade;//학점
		double total=0;
		int score_total=0;
		double result = 0;
		int Pscore = 0;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i=0;i<20;i++) {
			st =new StringTokenizer(br.readLine(), " ");
			subject= st.nextToken(); //과목명 입력
			score = Double.parseDouble(st.nextToken()); //점수
			grade = st.nextToken();
			score_total +=score; //전공평점을 위해 모든 학점을 다 더하는 변수
			
			switch(grade) {
			case "A+" : total+=score*4.5;
				break;
			case "A0" : total+=score*4.0;
				break;
			case "B+" : total+=score*3.5;
			break;
			case "B0" : total +=score*3.0;
			break;
			case "C+" : total +=score*2.5;
			break;
			case "C0" : total +=score*2.0;
			break;
			case "D+" : total+=score*1.5;
			break;
			case "D0" : total+=score*1.0;
			break;
			case "P" : Pscore += score;
			break;
			default : total +=0;
			break;
			}
			
			
		}
		
		result = total/(score_total-Pscore);
		
		System.out.println(result);
		
	}

}