package loop;

public class Main01 {

	public static void main(String[] args) {
		// 반복문
		// 1 ~ 5 까지의 합
		// 1 + 2 + 3 + 4 + 5 = 15
		
		// for 문
		
		
		int sum = 0;
		
		// i 값이 1부터 5까지 증가하는 동안,
		// i 의 값을 sum에 누적한다. 
		for(int i = 2; i <= 10; i++) {
			 // 결과값 누적
			sum += i ;
		} 
		
		System.out.println(sum);
	}

}
