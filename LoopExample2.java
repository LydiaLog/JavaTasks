//while 문을 이용한 구구단 출력 프로그램
import java.util.*; 

public class LoopExample2 {
   public static void main(String[] args) {
	   int n; 
	   int i = 1; // 정수 i를 1로 초기화
	   System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오: ");
	   Scanner scan = new Scanner(System.in); //scanner 함수 
	   n = scan.nextInt(); //n입력받기
	   while (i <= 9) {
		   System.out.println(n + "*"+ i + "=" + n * i);
		   i++; //i값 사용 후 증가 즉, 원래의 i값
	   }
		

	}

}
