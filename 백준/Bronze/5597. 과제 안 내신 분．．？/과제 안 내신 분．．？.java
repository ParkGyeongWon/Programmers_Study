import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(); //제출한 학생
		ArrayList<Integer> allStudent = new ArrayList<>(); //모든 학생
		
		for(int i=0;i<28;i++) { //제출한 학생 입력
			list.add(sc.nextInt());
		}
		
		for(int j=1;j<=30;j++) { //모든 학생 
			allStudent.add(j);
		}
		
		allStudent.removeAll(list); //모든학생에서 제출한 학생을 제외시키는 함수
		
		for(int a : allStudent) {
			System.out.println(a);
		}
		
	}

}
