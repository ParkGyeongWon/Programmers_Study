import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt(); //과목수
		double total=0; //새로운 과목점수의 합
		
		double[] score = new double[N];
		
		
		
		
		for(int i=0;i<score.length;i++) {
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		
		double M = score[N-1]; //최대값
		
		
		for(int j=0;j<score.length;j++) {
			score[j]=score[j]/M*100;
			total+=score[j];
		}
		total/=score.length;
		
		
		System.out.println(total);
	}

}
